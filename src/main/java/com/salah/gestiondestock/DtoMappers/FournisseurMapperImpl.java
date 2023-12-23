package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.FournisseurDto;
import com.salah.gestiondestock.model.Fournisseur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FournisseurMapperImpl {

    public FournisseurDto FromFournisseur(Fournisseur fournisseur){
        FournisseurDto fournisseurDto = new FournisseurDto();
        BeanUtils.copyProperties(fournisseur,fournisseurDto);
        return fournisseurDto;
    }

    public Fournisseur FromFournisseurDto(FournisseurDto fournisseurDto){
        Fournisseur fournisseur = new Fournisseur();
        BeanUtils.copyProperties(fournisseurDto,fournisseur);
        return fournisseur;
    }
}
