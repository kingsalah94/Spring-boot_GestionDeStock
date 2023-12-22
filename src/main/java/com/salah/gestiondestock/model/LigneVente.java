package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LigneVentes")
public class LigneVente extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idventes")
    private Ventes ventes;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "prixunitaire")
    private String prixUnitaire;
}
