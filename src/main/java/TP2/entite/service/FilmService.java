package TP2.entite.service;

import java.util.Optional;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TP2.entite.Film;
import TP2.repository.ActeurRepository;
import TP2.repository.FilmRepository;

@Service
public class FilmService extends AbstractService {
	
	@Autowired
	private FilmRepository filmRepo;

	public FilmService() {
		super();
	}

	public Film selectFilmByNom(String nomFilmParam) {
		TypedQuery<Film> query = this.em.createQuery("select f from Film f where f.titre='" + nomFilmParam + "'",
				Film.class);
		Film filmCherche = query.getResultList().get(0);
		return filmCherche;
	}
	
	public Film selectFilmByNomREpo(String nomFilmParam) {
		
		Optional<Film> filmRetour = this.filmRepo.findByTitre(nomFilmParam);
		
		return filmRetour.get();
		
	}

}
