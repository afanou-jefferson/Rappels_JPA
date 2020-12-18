package TP2.entite.service;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import TP2.entite.Categorie;

@Service
public class CategorieService extends AbstractService {

	public CategorieService() {
		super();
	}

	public Categorie selectCategorieByNom(String nomCategorieParam) {
		TypedQuery<Categorie> query = this.em
				.createQuery("select c from Categorie c where c.nom='" + nomCategorieParam + "'", Categorie.class);
		Categorie categorieCherche = query.getResultList().get(0);
		return categorieCherche;
	}

	public Categorie selectCategorieById(int idCherche) {
		TypedQuery<Categorie> query = this.em.createQuery("select c from Categorie c where c.id='" + idCherche + "'",
				Categorie.class);
		Categorie categorieCherche = query.getResultList().get(0);
		return categorieCherche;
	}

	public void deleteCategorieByName(String nomCatToDelete) {
		Categorie toDelete = this.selectCategorieByNom(nomCatToDelete);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}

	public void deleteCategorieById(int idToDelete) {
		Categorie toDelete = this.selectCategorieById(idToDelete);
		if (toDelete != null) {
			em.remove(toDelete);
		}
	}

}
