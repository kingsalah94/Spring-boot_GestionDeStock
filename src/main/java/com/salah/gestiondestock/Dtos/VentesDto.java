package com.salah.gestiondestock.Dtos;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
public class VentesDto {

    private Integer id;
    private String code;

    private Instant dateVente;

    private String commentaire;
}
