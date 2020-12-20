package TP3.factories;

import org.springframework.stereotype.Component;

import TP3.entite.Adresse;
import TP3.entite.Producteur;

@Component
public class ProducteurFactory {
private Producteur producteur;
	
	public ProducteurFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Producteur build(String  nom, String prenom, Double salaire, Adresse  adresse) {
		this.createProducteur(nom, prenom, salaire);
		this.appendAdresse(adresse);
		return this.get();
	}
	public void createProducteur(String nom, String prenom, Double budget) {
		this.producteur = new  Producteur(nom, prenom, budget);
	}
	
	public void appendAdresse(Adresse  adresse) {
		this.producteur.getAdresse().add(adresse);
	}
	
	private Producteur get() {
		return this.producteur;
	}
}
