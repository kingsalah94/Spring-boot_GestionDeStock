package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.UtilisateurDto;
import com.salah.gestiondestock.model.Utilisateur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurMapperImpl {
    public UtilisateurDto fromUtilisateur(Utilisateur utilisateur){
        UtilisateurDto utilisateurDto = new UtilisateurDto();
        BeanUtils.copyProperties(utilisateur,utilisateurDto);
        return utilisateurDto;
    }

    public Utilisateur fromUtilisateurDto(UtilisateurDto utilisateurDto){
        Utilisateur utilisateur = new Utilisateur();
        BeanUtils.copyProperties(utilisateurDto,utilisateur);
        return utilisateur;
    }
}
