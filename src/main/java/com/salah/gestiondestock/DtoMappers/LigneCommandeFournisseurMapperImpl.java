package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.LigneCommandeFournisseurDto;
import com.salah.gestiondestock.model.LigneCommandeFournisseur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LigneCommandeFournisseurMapperImpl {

    public LigneCommandeFournisseurDto fromLigneCommandeFournisseur(LigneCommandeFournisseur ligneCommandeFournisseur){
        LigneCommandeFournisseurDto ligneCommandeFournisseurDto = new LigneCommandeFournisseurDto();
        BeanUtils.copyProperties(ligneCommandeFournisseur,ligneCommandeFournisseurDto);
        return ligneCommandeFournisseurDto;
    }

    public LigneCommandeFournisseur fromLigneCommandeFournisseurDto(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        BeanUtils.copyProperties(ligneCommandeFournisseur,ligneCommandeFournisseurDto);
        return ligneCommandeFournisseur;
    }
}
