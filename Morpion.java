
public class Morpion extends Plateau {

	static final int hauteur = 3;
	static final int largeur = 3;
	char[] petitMorpion = new char[hauteur*largeur];
	
	Morpion () {
		for (int i = 0; i < hauteur*largeur; i++) {
				this.petitMorpion[i] = ' ';
		}
	}
	
	/*public String toString() {
		String rep = "";
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				if (j < largeur-1) {
				rep += this.petitMorpion[i][j] + "|";
				} else {
					rep += this.petitMorpion[i][j];
				}
			}
		if (i < hauteur -1) {
			rep += "\n";
			rep += "------";
			rep += "\n";
			}
		}
		return rep;
	}*/
	
	public void addChar(int num, Joueur j) {
		if (this.petitMorpion[num] == ' ') {
			this.petitMorpion[num] = j.getMarque();
		}
	}
	
	public boolean isFini() {
		char[] test = this.getPetitMorpion();
			if (test[0] != ' ' && test[0] == test[3] && test [0] == test[6]) { // Ligne verticale de gauche
				return true;
			} else if (test[0] != ' ' && test[0] == test[1] && test[0] == test[2]) { // Ligne horizontale du haut
				return true;
			} else if (test[0] != ' ' && test[4] == test[0] && test[0] == test[8]) { // Ligne diagonale de haut gauche vers bas droite
				return true;
			} else if (test[1] != ' ' && test[1] == test[4] && test[1] == test[7]) { // Ligne verticale du milieu
				return true;
			} else if (test[2] != ' ' && test[2] == test[5] && test[2] == test[8]) { // Ligne verticale de droite
				return true;
			} else if (test[6] != ' ' && test[6] == test[7] && test[6] == test[8]) { // Ligne horizontale du bas
				return true;
			} else if (test[3] != ' ' && test[3] == test[4] && test[3] == test[5]) { // Ligne horizontale du milieu
				return true;
			} else if (test[2] != ' ' && test[2] == test[4] && test[2] == test[6]) { // Derniere diago (haut droite -> bas gauche)
				return true;
			} else {
				return false;
			}
			
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
	
	
}
