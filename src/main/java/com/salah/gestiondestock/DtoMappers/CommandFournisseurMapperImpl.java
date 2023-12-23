package com.salah.gestiondestock.DtoMappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.salah.gestiondestock.Dtos.CommandFournisseurDto;
import com.salah.gestiondestock.model.CommandFournisseur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CommandFournisseurMapperImpl {

    public CommandFournisseurDto formCommandFournisseur(CommandFournisseur commandFournisseur){

        CommandFournisseurDto commandFournisseurDto = new CommandFournisseurDto();
        BeanUtils.copyProperties(commandFournisseur,commandFournisseurDto);
        return commandFournisseurDto;
    }

    public CommandFournisseur formCommandFournisseurDto(CommandFournisseurDto commandFournisseurDto){
        CommandFournisseur commandFournisseur = new CommandFournisseur();
        BeanUtils.copyProperties(commandFournisseurDto,commandFournisseur);
        return commandFournisseur;
    }
}
