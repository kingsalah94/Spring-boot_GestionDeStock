package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.MouvementDeStockDto;
import com.salah.gestiondestock.model.MouvementDeStock;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class MouvementDeStockMapperImpl{

    public MouvementDeStockDto fromMouvementDeStock(MouvementDeStock mouvementDeStock){
        MouvementDeStockDto mouvementDeStockDto = new MouvementDeStockDto();
        BeanUtils.copyProperties(mouvementDeStock,mouvementDeStockDto);
        return mouvementDeStockDto;
    }

    public MouvementDeStock fromMouvementDeStockDto(MouvementDeStockDto mouvementDeStockDto){
        MouvementDeStock mouvementDeStock = new MouvementDeStock();
        BeanUtils.copyProperties(mouvementDeStockDto,mouvementDeStock);
        return mouvementDeStock;
    }
}
