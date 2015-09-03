
public abstract class Morpion {

	protected char[][] morpion;
	
	public Morpion() {
		morpion = new char[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				morpion[i][j] = ' '; 
			}
		}
	}
	
	public String afficherLigne(int ligne) {
		String s = "";
		for(int i = 0 ; i < 3 ; i++) {
			s += "|" + morpion[ligne][i];
		}
		return s;
	}
	
	public void ajouterPiece(char marque, int ligne, int colonne) {
		morpion[ligne][colonne] = marque;
	}
}
