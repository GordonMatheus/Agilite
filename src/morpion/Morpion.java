package morpion;

public class Morpion {

	static final int hauteur = 3;
	static final int largeur = 3;
	char[] petitMorpion = new char[hauteur * largeur];
	char gagnant;

	public Morpion() {
		for (int i = 0; i < hauteur * largeur; i++) {
			this.petitMorpion[i] = ' ';
		}
	}

	public char getGagnant() {
		return gagnant;
	}

	public void setGagnant(char gagnant) {
		this.gagnant = gagnant;
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
		char[] test = this.petitMorpion;
		if (test[0] != ' ' && test[0] == test[3] && test[0] == test[6]) {
			// Ligne verticale de gauche
			remplir(this.petitMorpion, test[0]);
			return true;
		} else if (test[0] != ' ' && test[0] == test[1] && test[0] == test[2]) {
			// Ligne horizontale du haut
			remplir(this.petitMorpion, test[0]);
			return true;
		} else if (test[0] != ' ' && test[4] == test[0] && test[0] == test[8]) {
			// Ligne diagonale de haut gauche vers bas droite
			remplir(this.petitMorpion, test[0]);
			return true;
		} else if (test[1] != ' ' && test[1] == test[4] && test[1] == test[7]) {
			// Ligne verticale du milieu
			remplir(this.petitMorpion, test[1]);
			return true;
		} else if (test[2] != ' ' && test[2] == test[5] && test[2] == test[8]) {
			// Ligne verticale de droite
			remplir(this.petitMorpion, test[2]);
			return true;
		} else if (test[6] != ' ' && test[6] == test[7] && test[6] == test[8]) {
			// Ligne horizontale du bas
			remplir(this.petitMorpion, test[6]);
			return true;
		} else if (test[3] != ' ' && test[3] == test[4] && test[3] == test[5]) {
			// Ligne horizontale du milieu
			remplir(this.petitMorpion, test[3]);
			return true;
		} else if (test[2] != ' ' && test[2] == test[4] && test[2] == test[6]) {
			// Derniere diago (haut droite -> bas gauche)
			remplir(this.petitMorpion, test[2]);
			return true;
		} else if (isRempli()) {
				remplir(this.petitMorpion, 'N');
				return true;
		} else {
				return false;
		}
	}

	public boolean isRempli() {
		char[] t = this.petitMorpion;
		for (int i = 0; i < 9; i++) {
			if (t[i] == ' ') {
				return false;
			}
		}
		return true;
	}

	public void remplir(char[] morpion, char c) {
		for (int i = 0; i < morpion.length; i++) {
			morpion[i] = c;
		}
		this.setGagnant(c);
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

}
