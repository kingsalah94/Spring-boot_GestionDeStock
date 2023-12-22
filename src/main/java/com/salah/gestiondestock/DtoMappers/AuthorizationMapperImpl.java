package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.AuthorizationDto;
import com.salah.gestiondestock.model.Authorization;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationMapperImpl {

    public AuthorizationDto froAuthorization(Authorization authorization){
        AuthorizationDto authorizationDto = new AuthorizationDto();
        BeanUtils.copyProperties(authorization,authorizationDto);
        return authorizationDto;
    }

    public Authorization fromAuthorizationDto(AuthorizationDto authorizationDto){
        Authorization authorization = new Authorization();
        BeanUtils.copyProperties(authorizationDto,authorization);
        return authorization;
    }
}
