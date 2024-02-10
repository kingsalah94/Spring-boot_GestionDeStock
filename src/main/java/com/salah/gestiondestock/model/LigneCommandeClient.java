package com.salah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LigneCommandeClients")
public class LigneCommandeClient extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idarticles")
    private Articles articles;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idcommandclient")
    private CommandClient commandClient;
}
