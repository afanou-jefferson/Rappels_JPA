package TP2.entite;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_maj")
	private Date dateMaj;

	@OneToMany(mappedBy = "categorieFilm")
	private List<Film> filmsCategorie;

	public Categorie() {
		// TODO Auto-generated constructor stub
	}

	public Categorie(String nom, Date dateMaj, List<Film> filmsCategorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateMaj = dateMaj;
		this.filmsCategorie = filmsCategorie;
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

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}

	public List<Film> getFilmsCategorie() {
		return filmsCategorie;
	}

	public void setFilmsCategorie(List<Film> filmsCategorie) {
		this.filmsCategorie = filmsCategorie;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", dateMaj=" + dateMaj + "]";

	}

}
