package fr.ibformation.springboot.bataillenavale.gestionnairepartie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long idPartie;
	Joueur joueur1;
	Joueur joueur2;
	Joueur joueurEnCours;
	int nbToursMax = 60;
	int tourEnCours = 0;
	TypeStatut statut;
	Joueur gagnant;
	Map map1;
	Map map2;

	@ManyToOne
	Joueur joueur;

	public Partie() {

	}

	public Joueur getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}

	public int getNbToursMax() {
		return nbToursMax;
	}

	public void setNbTours(int nbToursMax) {
		this.nbToursMax = nbToursMax;
	}

	public int getTourEnCours() {
		return tourEnCours;
	}

	public void setTourEnCours(int tourEnCours) {
		this.tourEnCours = tourEnCours;
	}

	public TypeStatut getStatut() {
		return statut;
	}

	public void setStatut(TypeStatut statut) {
		this.statut = statut;
	}

	public Joueur getGagnant() {
		return gagnant;
	}

	public Joueur setGagnant(Joueur gagnant) {

		return gagnant;
	}

	public Map getMap1() {
		return map1;
	}

	public void setMap1(Map map1) {
		this.map1 = map1;
	}

	public Map getMap2() {
		return map2;
	}

	public void setMap2(Map map2) {
		this.map2 = map2;
	}

	public void demarrerPartie() {
		statut = TypeStatut.ENCOURS;
		tourEnCours = 0;
		joueurEnCours = joueur1;
		map1=new Map(10);
		map2 = new Map(10);
		
		for (int i = 0; i < nbToursMax; i++) {
			int x = 1;
			int y = 1;
			joueurEnCours.tirer(x, y);
	
			
	
			joueurEnCours = joueur2;
			
			int taille = 10;
			
			
			

		}
	}

}
