
public class Joueur {
	char marque;
	String nom;
	
	Joueur (String name, char m) {
		this.nom = name;
		this.marque = m;
	}
		
	public char getMarque() {
		return this.marque;
	}
	
	public void setMarque(char c) {
		this.marque = c;		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
