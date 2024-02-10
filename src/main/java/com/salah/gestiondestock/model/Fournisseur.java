package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Fournisseurs")
public class Fournisseur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "photo")
    private String photo;
    @Column(name = "numTel")
    private String numTel;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandFournisseur> commandFournisseurs;
}
