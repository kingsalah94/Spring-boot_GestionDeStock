package com.salah.gestiondestock.Services;

import com.salah.gestiondestock.Dtos.ClientDto;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;

import java.util.List;

public interface ClientService {

    ClientDto addClient(ClientDto clientDto);

    ClientDto updateClient(ClientDto clientDto);

    ClientDto getClientById(Integer id)throws EntityNotFoundException;

    ClientDto getClientByEmail(String email) throws EntityNotFoundException ;

    List<ClientDto> getAllClients();

    void deleteClientById(Integer id);

}
