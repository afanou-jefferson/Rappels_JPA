package TP2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TP2.entite.Acteur;
import TP2.entite.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
	
	Optional<Film> findByTitre(String titre);

	
}
