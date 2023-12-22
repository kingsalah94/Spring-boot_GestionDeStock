package com.salah.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Entreprises")
public class Entreprise extends AbstractEntity{

    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;

    @Embedded
    private Adresse adresse;

    @Column(name = "codefiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;
}
