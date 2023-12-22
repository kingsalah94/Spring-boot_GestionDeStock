package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.ClientDto;
import com.salah.gestiondestock.model.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClientMapperImpl {

    public ClientDto fromClient(Client client){
        ClientDto clientDto = new ClientDto();
        BeanUtils.copyProperties(client,clientDto);
        return clientDto;
    }

    public Client fromClientDto(ClientDto clientDto){
        Client client = new Client();
        BeanUtils.copyProperties(clientDto,client);
        return client;
    }
}
