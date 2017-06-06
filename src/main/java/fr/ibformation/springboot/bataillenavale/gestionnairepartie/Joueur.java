package fr.ibformation.springboot.bataillenavale.gestionnairepartie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Joueur implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	long idJoueur;
	String nomJoueur;
	int nbPartiesGagnees;
	Partie partieEnCours;
	
	@OneToMany(mappedBy="joueur", cascade = CascadeType.ALL)
	private List<Joueur> joueurs = new ArrayList<>();
	
	public Joueur() {
	}
	public Joueur(String nomJoueur) {
		this.nomJoueur=nomJoueur;
	}
	

	public long getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(long idJoueur) {
		this.idJoueur = idJoueur;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public int getNbPartiesGagnees() {
		return nbPartiesGagnees;
	}

	public void setNbPartiesGagnees(int nbPartiesGagnees) {
		this.nbPartiesGagnees = nbPartiesGagnees;
	}
	
	
	
	
	
	///////METHODES DE JOUEUR
	
	public void seConnecter(){
		System.out.println("connecte");
	}
	
	public void creerPartie(){
		
		

	}
	
	public void rejoindrePartie(){
		System.out.println("partie rejointe");
		
	}
	
	public void tirer(int x, int y){
		
		int tour =	partieEnCours.getTourEnCours();
		tour++;
		
		
	}
	
	

}
