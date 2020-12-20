package TP3.factories;

import TP3.entite.Adresse;
import TP3.entite.Realisateur;

public class RealisateurFactory {
private Realisateur realisateur;
	
	public RealisateurFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Realisateur build(String  nom, String prenom, Double salaire, Adresse  adresse) {
		this.createRealisateur(nom, prenom, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createRealisateur(String nom, String prenom, Double commission) {
		this.realisateur = new  Realisateur(nom, prenom, commission);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.realisateur.getAdresse().add(adresse);
	}
	
	private Realisateur get() {
		return this.realisateur;
	}
}
