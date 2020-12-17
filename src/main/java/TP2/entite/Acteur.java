package TP2.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "acteur")
public class Acteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;

	private String prenom;

	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_acteur", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id"))
	private List<Film> listeFilms;

	public Acteur() {
	}

	public Acteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeFilms = new ArrayList<Film>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Film> getListeFilms() {
		return listeFilms;
	}

	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}

	@Override
	public String toString() {
		return "Acteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public String getStringListeFilmsDeActeur() {

		String s = "";
		for (Film f : this.listeFilms) {
			s = s.concat(f.toString() + "\n");
		}

		return s;
	}

}
