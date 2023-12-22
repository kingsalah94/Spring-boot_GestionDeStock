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
@Table(name = "CommandClients")
public class CommandClient extends AbstractEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;
    @OneToMany(mappedBy = "commandClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
