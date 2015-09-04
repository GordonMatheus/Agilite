package morpion;

public class Morpion {

	static final int hauteur = 3;
	static final int largeur = 3;
	char[] petitMorpion = new char[hauteur * largeur];
	boolean fini;
	char gagnant;

	public char getGagnant() {
		return gagnant;
	}

	public void setGagnant(char gagnant) {
		this.gagnant = gagnant;
	}

	Morpion() {
		for (int i = 0; i < hauteur * largeur; i++) {
			this.petitMorpion[i] = ' ';
		}
		this.fini = false;
	}

	public String toString() {
		String rep = "";
		for (int i = 0; i < hauteur * largeur; i++) {
			rep += "|" + petitMorpion[i];
			if (i == 2 || i == 5) {
				rep += "|\n-------\n";
			}
		}
		return rep + "|\n";
	}

	public boolean addChar(int num, Joueur j) {
		if (this.petitMorpion[num] == ' ') {
			this.petitMorpion[num] = j.getMarque();
			return true;
		} else
			return false;
	}

	public boolean isFini() {
		char[] test = this.getPetitMorpion();
		if (test[0] != ' ' && test[0] == test[3] && test[0] == test[6]) { // Ligne
																			// verticale
																			// de
																			// gauche
			this.setFini(true);
			this.setGagnant(test[0]);
			return true;
		} else if (test[0] != ' ' && test[0] == test[1] && test[0] == test[2]) { // Ligne
																					// horizontale
																					// du
																					// haut
			this.setFini(true);
			this.setGagnant(test[0]);
			return true;
		} else if (test[0] != ' ' && test[4] == test[0] && test[0] == test[8]) { // Ligne
																					// diagonale
																					// de
																					// haut
																					// gauche
																					// vers
																					// bas
																					// droite
			this.setFini(true);
			this.setGagnant(test[0]);
			return true;
		} else if (test[1] != ' ' && test[1] == test[4] && test[1] == test[7]) { // Ligne
																					// verticale
																					// du
																					// milieu
			this.setFini(true);
			this.setGagnant(test[1]);
			return true;
		} else if (test[2] != ' ' && test[2] == test[5] && test[2] == test[8]) { // Ligne
																					// verticale
																					// de
																					// droite
			this.setFini(true);
			this.setGagnant(test[2]);
			return true;
		} else if (test[6] != ' ' && test[6] == test[7] && test[6] == test[8]) { // Ligne
																					// horizontale
																					// du
																					// bas
			this.setFini(true);
			this.setGagnant(test[6]);
			return true;
		} else if (test[3] != ' ' && test[3] == test[4] && test[3] == test[5]) { // Ligne
																					// horizontale
																					// du
																					// milieu
			this.setFini(true);
			this.setGagnant(test[3]);
			return true;
		} else if (test[2] != ' ' && test[2] == test[4] && test[2] == test[6]) { // Derniere
																					// diago
																					// (haut
																					// droite
																					// ->
																					// bas
																					// gauche)
			this.setFini(true);
			this.setGagnant(test[2]);
			return true;
		} else {
			if (isRempli()) {
				for (int i = 0; i < hauteur * largeur; i++) {
					petitMorpion[i] = 'N';
				}
				return true;
			} else {
				return false;
			}
		}

	}

	public boolean isRempli() {
		char[] t = this.getPetitMorpion();
		for (int i = 0; i < 9; i++) {
			if (t[i] == ' ') {
				return false;
			}
		}
		return true;
	}

	public void setFini(boolean fini) {
		this.fini = fini;
	}

	public char[] getPetitMorpion() {
		return petitMorpion;
	}

	public void setPetitMorpion(char[] petitMorpion) {
		this.petitMorpion = petitMorpion;
	}

	public static int getHauteur() {
		return hauteur;
	}

	public static int getLargeur() {
		return largeur;
	}

	public char getChar(int num) {
		return petitMorpion[num];
	}

	public void remplirMorpion() {
		if (fini) {
			for (int i = 0; i < hauteur * largeur; i++) {
				petitMorpion[i] = gagnant;
			}
		}
	}

}
