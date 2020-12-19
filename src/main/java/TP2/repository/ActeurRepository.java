package TP2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import TP2.entite.Acteur;

@Repository
public interface ActeurRepository extends JpaRepository<Acteur, Integer> {
	
	
	Optional<Acteur> findByNomAndPrenom(String nom, String prenom);
	
	@Query("From Acteur a WHERE a.nom=:nom AND a.prenom=:prenom")
	Optional<Acteur> trouverActeurParNomEtPrenom(String nom, String prenom);
	
}
