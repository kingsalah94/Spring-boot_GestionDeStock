package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.LigneCommandeClientDto;
import com.salah.gestiondestock.model.LigneCommandeClient;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LigneCommandeClientMapperImpl {

    public LigneCommandeClientDto FromLigneCommandeClient(LigneCommandeClient ligneCommandeClient){
        LigneCommandeClientDto ligneCommandeClientDto = new LigneCommandeClientDto();
        BeanUtils.copyProperties(ligneCommandeClient,ligneCommandeClientDto);
        return ligneCommandeClientDto;
    }

    public LigneCommandeClient FromLigneCommandeClientDto(LigneCommandeClientDto ligneCommandeClientDto){
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        BeanUtils.copyProperties(ligneCommandeClientDto,ligneCommandeClient);
        return ligneCommandeClient;
    }
}
