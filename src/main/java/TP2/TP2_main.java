package TP2;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication // (exclude = { DataSourceAutoConfiguration.class })
@EnableTransactionManagement // Annotation Spring pour autoriser la gestion des transactions
public class TP2_main implements CommandLineRunner {

	// @Autowired // Injecte le service
	// On les mets en attributs d'une classe où ils vont être appelés
	// ActeurService acteurServ;

	public static void main(String[] args) {
		SpringApplication.run(TP2_main.class, args);

	}

	@Override
	@Transactional // Démarre la transaction
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//		// EntityManagerFactory entityManagerFactory =
//		// Persistence.createEntityManagerFactory("films");
//		// EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		// Initialisation de la transaction
//		// EntityTransaction entityTransaction = entityManager.getTransaction();
//		// entityTransaction.begin();
//
//		// Affichez les informations concernant cet acteur ainsi que les films associés
//		// connus de
//		// la base de données
//		// Acteur acteurBDD = entityManager.find(Acteur.class, 1);
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
////		TypedQuery<Film> query = entityManager
////				.createQuery("select f from Film f where f.titre='Mission impossible: Fallout'", Film.class);
////		Film fallout = query.getResultList().get(0);
////		newActeur.getListeFilms().add(fallout);
//
////		entityManager.persist(newActeur);
//
////		TypedQuery<Acteur> query2 = entityManager.createQuery("select a from Acteur a where a.prenom='Simon'",
////				Acteur.class);
////		Acteur simon = query2.getResultList().get(0);
//		Acteur simon = acteurServ.selectActeurByNom("Pegg");
//		System.out.println();
//		System.out.println(simon.toString());
//		System.out.println(simon.getStringListeFilmsDeActeur());

	}
}
