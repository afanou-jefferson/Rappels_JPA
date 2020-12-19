package TP2.entite.service;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import TP2.entite.Acteur;
import TP2.repository.ActeurRepository;

@org.springframework.stereotype.Service
public class ActeurService extends AbstractService {
	
	@Autowired
	private ActeurRepository acteurRepo;

	public ActeurService() {
		super();
	}

	public Acteur selectActeurByNom(String nomActeurParam) {
		TypedQuery<Acteur> query = this.em.createQuery("select a from Acteur a where a.nom='" + nomActeurParam + "'",
				Acteur.class);
		Acteur acteurCherche = query.getResultList().get(0);
		return acteurCherche;
	}
	
	public Acteur selectActeurByNomEtPrenom(String nomActeurParam, String prenomActeurParam ) {
		Acteur retour = new Acteur();
		if ( this.acteurRepo.trouverActeurParNomEtPrenom(nomActeurParam, prenomActeurParam).isPresent()) {
			retour = this.acteurRepo.trouverActeurParNomEtPrenom(nomActeurParam, prenomActeurParam).get();
		} else {
			System.out.println("Empty af");
		}
				
		return retour;
	}
	
	

}
