package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CommandFournisseurs")
public class CommandFournisseur extends AbstractEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "dateCommande")
    private Instant dateCommande;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
