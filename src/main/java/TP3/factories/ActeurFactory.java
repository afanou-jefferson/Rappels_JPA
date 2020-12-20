package TP3.factories;

import org.springframework.stereotype.Component;

import TP3.entite.Acteur;
import TP3.entite.Adresse;


@Component
public class ActeurFactory {
	private Acteur acteur;
	
	public ActeurFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Acteur build(String  nom, String prenom, String agence, Double salaire, Adresse  adresse) {
		this.createActeur(nom, prenom, agence, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createActeur(String  nom, String prenom, String agence, Double salaire) {
		this.acteur = new  Acteur(nom, prenom, agence, salaire);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.acteur.getAdresse().add(adresse);
	}
	
	private Acteur get() {
		return this.acteur;
	}
}
