
public class Morpion extends Plateau {

	static final int hauteur = 3;
	static final int largeur = 3;
	char[][] petitMorpion = new char[hauteur][largeur];
	
	Morpion () {
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				this.petitMorpion[i][j] = ' ';
			}
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
	
	public void addChar(int abs, int ord, Joueur j) {
		if (this.petitMorpion[ord][abs] == ' ') {
			this.petitMorpion[ord][abs] = j.getMarque();
		}
	}
	
	public char getChar(int abs, int ord) {
		return petitMorpion[ord][abs];
	}
	
	
}
