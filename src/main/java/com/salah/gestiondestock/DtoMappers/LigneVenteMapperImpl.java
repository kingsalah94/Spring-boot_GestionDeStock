package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.LigneVenteDto;
import com.salah.gestiondestock.model.LigneVente;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LigneVenteMapperImpl {

    public LigneVenteDto formLigneVente(LigneVente ligneVente){
        LigneVenteDto ligneVenteDto = new LigneVenteDto();
        BeanUtils.copyProperties(ligneVente,ligneVenteDto);
        return ligneVenteDto;
    }

    public LigneVente formLigneVentDto(LigneVenteDto ligneVenteDto){
        LigneVente ligneVente = new LigneVente();
        BeanUtils.copyProperties(ligneVenteDto,ligneVente);
        return ligneVente;
    }
}
