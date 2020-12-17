package TP2.entite.service;

import javax.persistence.TypedQuery;

import TP2.entite.Acteur;

@org.springframework.stereotype.Service
public class ActeurService extends AbstractService {

	public ActeurService() {
		super();
	}

	public Acteur selectActeurByNom(String nomActeurParam) {
		TypedQuery<Acteur> query = this.em.createQuery("select a from Acteur a where a.nom='" + nomActeurParam + "'",
				Acteur.class);
		Acteur acteurCherche = query.getResultList().get(0);
		return acteurCherche;
	}

}
