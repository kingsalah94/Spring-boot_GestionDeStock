package com.salah.gestiondestock.Repositories;

import com.salah.gestiondestock.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Articles,Integer> {

}
