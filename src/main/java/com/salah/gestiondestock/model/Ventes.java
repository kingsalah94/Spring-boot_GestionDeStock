package com.salah.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Ventes")
public class Ventes extends AbstractEntity{

   @Column(name = "code")
    private String code;

    @Column(name = "dateVente")
   private Instant dateVente;

    @Column(name = "commentaire")
   private String commentaire;
}
