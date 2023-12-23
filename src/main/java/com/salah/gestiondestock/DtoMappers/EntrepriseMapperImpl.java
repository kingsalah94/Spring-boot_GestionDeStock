package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.EntrepriseDto;
import com.salah.gestiondestock.model.Entreprise;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseMapperImpl {

    public EntrepriseDto fromEntreprise(Entreprise entreprise){
        EntrepriseDto entrepriseDto = new EntrepriseDto();
        BeanUtils.copyProperties(entreprise,entrepriseDto);
        return entrepriseDto;
    }

    public Entreprise FromEntrepriseDto(EntrepriseDto entrepriseDto){
        Entreprise entreprise = new Entreprise();
        BeanUtils.copyProperties(entrepriseDto,entreprise);
        return entreprise;
    }
}
