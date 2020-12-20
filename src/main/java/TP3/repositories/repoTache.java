package TP3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TP3.entite.Tache;


public interface repoTache extends JpaRepository<Tache, Integer> {

}
