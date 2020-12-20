package TP3.services;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TP3.entite.Acteur;
import TP3.entite.Adresse;
import TP3.entite.Categorie;
import TP3.entite.Film;
import TP3.entite.Producteur;
import TP3.entite.Realisateur;
import TP3.entite.Tache;
import TP3.entite.TacheDatee;
import TP3.factories.ActeurFactory;
import TP3.factories.ProducteurFactory;
import TP3.factories.RealisateurFactory;
import TP3.repositories.repoAdresse;

@Service
public class FilmService extends AbstractService {
	
	private ActeurFactory acteurFactory;
	private ProducteurFactory producteurFactory;
	private RealisateurFactory realisateurFactory;
	
	@Autowired
	private TP3.repositories.repoFilm repoFilm;
	
	@Autowired
	private repoAdresse repoAdresse;
	
	@Autowired
	private TP3.repositories.repoCategorie repoCategorie;
	
	@Autowired
	private TP3.repositories.repoActeur repoActeur;
	
	@Autowired
	private TP3.repositories.repoRealisateur repoRealisateur;
	
	@Autowired
	private TP3.repositories.repoProducteur repoProducteur;
	
	@Autowired
	private TP3.repositories.repoTache repoTache;
	
	
	
	
	public FilmService() {
		super();
	}




	public void insert() {
		Categorie categorieTest =  new Categorie("CategorieDeDrive", new Date());
		this.repoCategorie.save(categorieTest);
		
		Film film = new Film("Drive", "2011");
		film.setCategorie(categorieTest);
		
		Adresse  adresse1  = new  Adresse(1, "libelle1", "ville1", 34001);
		Adresse  adresse2  = new  Adresse(2, "libelle2", "ville2", 34002);
		Adresse  adresse3  = new  Adresse(3, "libelle3", "ville3", 34003);
		Adresse  adresse4  = new  Adresse(4, "libelle4", "ville4", 34004);
		Adresse  adresse5  = new  Adresse(7, "libelle5", "ville5", 34005);
		this.repoAdresse.save(adresse1);
		this.repoAdresse.save(adresse2);
		this.repoAdresse.save(adresse3);
		this.repoAdresse.save(adresse4);
		this.repoAdresse.save(adresse5);
		
		Acteur acteur1 = this.acteurFactory.build("Ninja", "XXX", "Agende des Ninja", 4000.0, adresse1);
		Acteur acteur2 = this.acteurFactory.build("De la Montagne", "Bao", "Ases", 1000.0, adresse2);
		Acteur acteur3 = this.acteurFactory.build("Mescudy", "Scott", "G.O.O.D", 3000.0, adresse3);
		Realisateur realisateur = this.realisateurFactory.build("Cameron", "James", 10.0, adresse4);
		Producteur producteur = this.producteurFactory.build("Je connais pas", "de Producteur", 200_000.0, adresse5);
		
		
		this.repoActeur.save(acteur1);
		this.repoActeur.save(acteur2);
		this.repoActeur.save(acteur3);
		this.repoRealisateur.save(realisateur);
		this.repoProducteur.save(producteur);
		
		Tache tache1 = new  Tache("descirption1", new  Date());
		Tache tache2 = new  TacheDatee("descirption1", new  Date(), new  Date());
		tache1.setIntervenant(producteur);
		tache2.setIntervenant(producteur);
		
		this.repoTache.save(tache1);
		this.repoTache.save(tache2);
		
		film.addIntervenant(acteur1);
		film.addIntervenant(acteur2);
		film.addIntervenant(acteur3);
		film.addIntervenant(realisateur);
		film.addIntervenant(producteur);
		this.repoFilm.save(film);
	}
}
