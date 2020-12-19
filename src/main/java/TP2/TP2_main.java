package TP2;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import TP2.entite.Acteur;
import TP2.entite.Film;
import TP2.entite.service.ActeurService;
import TP2.entite.service.CategorieService;
import TP2.entite.service.FilmService;

@SpringBootApplication // (exclude = { DataSourceAutoConfiguration.class })
@EnableTransactionManagement // Annotation Spring pour autoriser la gestion des transactions
public class TP2_main implements CommandLineRunner {

	@Autowired // Injecte le service
	// On les mets en attributs d'une classe où ils vont être appelés
	// Controller -> Service == Manger -> Repo/DAO
	ActeurService acteurServ;

	@Autowired
	FilmService filmServ;

	@Autowired
	CategorieService categorieServ;

	public static void main(String[] args) {
		SpringApplication.run(TP2_main.class, args);

	}

	@Override
	@Transactional // Démarre la transaction
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		// Affichez les informations concernant cet acteur ainsi que les films associés
//		// connus de la base de données
//		Acteur acteurBDD = acteurServ.selectActeurByNom("WAHLBERG");
//		System.out.println();
//		System.out.println(acteurBDD.toString());
//		System.out.println(acteurBDD.getStringListeFilmsDeActeur());
//
//		// Ajoutez un acteur : Simon Pegg et associez-le au film Mission impossible :
//		// FALLOUT
//		Acteur newActeur = new Acteur();
//		newActeur.setNom("Pegg");
//		newActeur.setPrenom("Simon");
//		newActeur.setListeFilms(new ArrayList<Film>());
//		acteurServ.merge(newActeur);
//
//		Acteur simon = acteurServ.selectActeurByNom("Pegg");
//		System.out.println();
//		System.out.println(simon.toString());
//		System.out.println(simon.getStringListeFilmsDeActeur());
//
//		// Modifiez la date de sortie du film « Avengers : Endgame » qui est 2019 et non
//		// 2018
//		Film avengers = filmServ.selectFilmByNom("Avengers: Endgame");
//		avengers.setAnnee_sortie("2019");
//		System.out.println(avengers.toString());
//
//		// Ajoutez en base de données un film de votre choix ainsi que 3 acteurs ayant
//		// joué
//		// dans ce film
//		List<Acteur> listActeursMonFilm = new ArrayList<Acteur>();
//		listActeursMonFilm.add(simon);
//		listActeursMonFilm.add(acteurServ.selectActeurByNom("BASSETT"));
//		listActeursMonFilm.add(acteurServ.selectActeurByNom("MONAGHAN"));
//
//		Film monFilm = new Film("Drive", "2011", listActeursMonFilm, categorieServ.selectCategorieByNom("Drame"));
//
//		// Merge insert si n'existe pas alors que save(persist) va créer une nouvelle
//		// entité quoi qu'il arrive
//		filmServ.merge(monFilm);
//
//		// OK en BDD mais en commentaire car n'existe plus et Error quand on rejoue
//		//categorieServ.deleteCategorieById(10);
//		//categorieServ.deleteCategorieById(13);
		
		//Créez une méthode permettant d’extraire un film à partir de son nom
		Film filmTest = filmServ.selectFilmByNomREpo("Avengers: Endgame");
		System.out.println(filmTest);
		
		
		// Créez une méthode permettant d’extraire un acteur à partir de son nom et de son
		//prénom
		Acteur test = acteurServ.selectActeurByNomEtPrenom("RUSSELL", "Kurt");
		System.out.println(test.toString());
		
		//Créez une méthode permettant d’extraire une catégorie à partir de sa date de
		//dernière mise à jour.
		
		// Dunno 
		

	}
}
