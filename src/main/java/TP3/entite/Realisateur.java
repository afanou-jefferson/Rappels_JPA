package TP3.entite;

import javax.persistence.Entity;

@Entity
public class Realisateur extends Intervenant {

	private Double commission;
	
	public Realisateur() {}
	
	public Realisateur(String nom, String prenom, Double commission2) {
		super();
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

}
