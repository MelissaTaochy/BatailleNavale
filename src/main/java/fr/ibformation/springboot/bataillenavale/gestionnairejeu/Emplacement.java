package fr.ibformation.springboot.bataillenavale.gestionnairejeu;

import javax.persistence.Entity;

@Entity
public class Emplacement {
	int position_x;
	int posiyion_y;
	TypeStatutCase statut;
	TypeType type;

	public Emplacement() {
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosiyion_y() {
		return posiyion_y;
	}

	public void setPosiyion_y(int posiyion_y) {
		this.posiyion_y = posiyion_y;
	}

	public TypeStatutCase getStatut() {
		return statut;
	}

	public void setStatut(TypeStatutCase statut) {
		this.statut = statut;
	}

	public void gererTir(int x, int y) {
		switch (statut) {
		case PASDECOUVERT:
			switch (type) {
			case MER:

				break;
			case BATEAU:

				break;
			default:
				break;
			}
			break;
		case DECOUVERT:

			break;
		default:
			break;
		}

	}

}
