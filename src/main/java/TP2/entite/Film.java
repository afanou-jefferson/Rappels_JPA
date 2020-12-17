package TP2.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titre;

	private String annee_sortie;

	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_acteur", referencedColumnName = "id"))
	private List<Acteur> listeActeurs;

	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie categorieFilm;

	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(String titre, String annee_sortie, List<Acteur> listeActeurs, Categorie categorieFilm) {
		super();
		this.titre = titre;
		this.annee_sortie = annee_sortie;
		this.listeActeurs = listeActeurs;
		this.categorieFilm = categorieFilm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(String annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public List<Acteur> getListeActeurs() {
		return listeActeurs;
	}

	public void setListeActeurs(List<Acteur> listeActeurs) {
		this.listeActeurs = listeActeurs;
	}

	public Categorie getCategorieFilm() {
		return categorieFilm;
	}

	public void setCategorieFilm(Categorie categorieFilm) {
		this.categorieFilm = categorieFilm;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee_sortie=" + annee_sortie + ", categorieFilm="
				+ categorieFilm + "]";
	}

	public String getStringListeActeursDuFilm() {

		String s = "";

		for (Acteur a : this.listeActeurs) {
			s = s.concat(a.toString() + "\n");
		}

		return s;
	}

}
