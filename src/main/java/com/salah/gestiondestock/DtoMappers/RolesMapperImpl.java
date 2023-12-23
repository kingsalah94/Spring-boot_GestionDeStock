package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.RolesDto;
import com.salah.gestiondestock.model.Roles;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class RolesMapperImpl {

    public RolesDto fromRoles(Roles roles){
        RolesDto rolesDto = new RolesDto();
        BeanUtils.copyProperties(roles,rolesDto);
        return rolesDto;
    }

    public Roles fromRolesDto(RolesDto rolesDto){
        Roles roles = new Roles();
        BeanUtils.copyProperties(rolesDto,roles);
        return roles;
    }
}
