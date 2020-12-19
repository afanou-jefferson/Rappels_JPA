package TP2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TP2.entite.Categorie;
import TP2.entite.Film;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>  {



}
