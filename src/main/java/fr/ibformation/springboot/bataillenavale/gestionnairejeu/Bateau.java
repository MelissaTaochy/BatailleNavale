package fr.ibformation.springboot.bataillenavale.gestionnairejeu;

import javax.persistence.Entity;

@Entity
public class Bateau {
	int taille;
	int position_x;
	int position_y;
	boolean orientation;
	int vie;
	

}
