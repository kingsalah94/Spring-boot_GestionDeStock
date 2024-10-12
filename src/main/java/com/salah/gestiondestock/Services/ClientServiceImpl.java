package com.salah.gestiondestock.Services;

import com.salah.gestiondestock.DtoMappers.ClientMapperImpl;
import com.salah.gestiondestock.Dtos.ClientDto;
import com.salah.gestiondestock.Enums.ErrorCodes;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;
import com.salah.gestiondestock.Exceptions.InvalideEntityException;
import com.salah.gestiondestock.Repositories.ClientRepository;
import com.salah.gestiondestock.Validators.ClientValidator;
import com.salah.gestiondestock.model.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.View;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService{

    private final View error;
    private ClientRepository clientRepository;
    private ClientMapperImpl dtoMapper;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository,
                             ClientMapperImpl dtoMapper, View error) {
        this.clientRepository = clientRepository;
        this.dtoMapper = dtoMapper;
        this.error = error;
    }

    @Override
    public ClientDto addClient(ClientDto clientDto) {
        List<String> errors = ClientValidator.validate(clientDto);
        if(!errors.isEmpty()) {
            log.error("Error while adding Client Client is not valid: {}", clientDto);
            throw new InvalideEntityException("Client not valid", ErrorCodes.Client_NOT_VALIDE,errors);
        }
        Client client = dtoMapper.fromClientDto(clientDto);
        Client savedClient = clientRepository.save(client);
        return dtoMapper.fromClient(savedClient);
    }

    @Override
    public ClientDto updateClient(ClientDto clientDto) {
        List<String> errors = ClientValidator.validate(clientDto);
        if(!errors.isEmpty()) {
            log.error("Error while updating Client Client is not valid: {}", clientDto);
            throw new InvalideEntityException("Client not valid", ErrorCodes.Client_NOT_VALIDE,errors);
        }
        Client client = dtoMapper.fromClientDto(clientDto);
        Client savedClient = clientRepository.save(client);
        return dtoMapper.fromClient(savedClient);
    }

    @Override
    public ClientDto getClientById(Integer id) throws EntityNotFoundException {
        if(id == null){
            log.error("Error while getting client id is null");
            return null;
        }
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client not found",ErrorCodes.CLIENT_NOT_FOUND));
        return dtoMapper.fromClient(client);
    }

    @Override
    public ClientDto getClientByEmail(String email) throws EntityNotFoundException {
        if(!StringUtils.hasLength(email)){
            log.error("Error while getting client email is null");
            return null;
        }
        Client client = clientRepository.findClientByClientEmail(email)
                .orElseThrow(()->new EntityNotFoundException("Client not Found",ErrorCodes.CLIENT_NOT_FOUND));
        return null;
    }

    @Override
    public List<ClientDto> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(client -> dtoMapper.fromClient(client))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteClientById(Integer id) {
        if (id == null){
            log.error("Error while deleting client id is null {}",error);
            return;
        }
        clientRepository.deleteById(id);
    }
}
