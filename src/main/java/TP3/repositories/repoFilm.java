package TP3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TP3.entite.Film;


public interface repoFilm extends JpaRepository<Film, Integer> {

}
