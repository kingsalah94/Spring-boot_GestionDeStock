package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Articles")
public class Articles extends AbstractEntity{

    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;
    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;
    @Column(name = "tauxttva")
    private BigDecimal tauxTva;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;


}

