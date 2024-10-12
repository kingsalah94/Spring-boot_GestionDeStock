package com.salah.gestiondestock.Repositories;

import com.salah.gestiondestock.Dtos.ClientDto;
import com.salah.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Integer> {

    Optional<Client> findClientByClientEmail(String email);
}
