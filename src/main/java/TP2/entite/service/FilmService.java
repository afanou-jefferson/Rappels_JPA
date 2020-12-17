package TP2.entite.service;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import TP2.entite.Film;

@Service
public class FilmService extends AbstractService {

	public FilmService() {
		super();
	}

	public Film selectFilmByNom(String nomFilmParam) {
		TypedQuery<Film> query = this.em.createQuery("select f from Film f where f.titre='" + nomFilmParam + "'",
				Film.class);
		Film filmCherche = query.getResultList().get(0);
		return filmCherche;
	}

}
