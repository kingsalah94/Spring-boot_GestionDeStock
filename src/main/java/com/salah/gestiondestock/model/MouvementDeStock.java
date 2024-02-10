package com.salah.gestiondestock.model;

import com.salah.gestiondestock.Enums.TypeMouvementStock;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MouvementDeStocks")
public class MouvementDeStock extends AbstractEntity{

    @Column(name = "datemouvement")
    private Instant dateMouvement;

    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idarticles")
    private Articles articles;

    @Column(name = "typemouvementstock")
    private TypeMouvementStock typeMouvementStock;
}
