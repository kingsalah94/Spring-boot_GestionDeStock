package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.VentesDto;
import com.salah.gestiondestock.model.Ventes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VentesMapperIpl {
    public VentesDto fromVentes(Ventes ventes){
        VentesDto ventesDto = new VentesDto();
        BeanUtils.copyProperties(ventes,ventesDto);
        return ventesDto;
    }

    public Ventes fromVentesDto(VentesDto ventesDto){
        Ventes ventes = new Ventes();
        BeanUtils.copyProperties(ventesDto,ventes);
        return ventes;
    }
}
