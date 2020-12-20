package TP3.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TP3.entite.Categorie;


public interface repoCategorie extends JpaRepository<Categorie, Integer> {
	public Optional<List<Categorie>> findByDateMaj(Date date);
}
