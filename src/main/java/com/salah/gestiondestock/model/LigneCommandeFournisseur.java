package com.salah.gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandFournisseur commandeFournisseur;
}
