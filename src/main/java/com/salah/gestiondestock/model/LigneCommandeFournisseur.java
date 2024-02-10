package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LigneCommandeFournisseurs")
public class LigneCommandeFournisseur extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idarticles")
    private Articles articles;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandFournisseur commandeFournisseur;
}
