package TP3.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TP3.entite.Acteur;


public interface repoActeur extends JpaRepository<Acteur, Integer> {
	public Optional<Acteur> findByNomAndPrenom(String nom, String prenom);
}
