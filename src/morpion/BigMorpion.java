
public class BigMorpion extends Plateau {
	Morpion[] total;
	static final int nbMorpion = 9;
	
	BigMorpion() {
		this.total = new Morpion[nbMorpion];
		for (int i = 0; i < nbMorpion; i++) {
			total[i] = new Morpion();
		}
	}
	
	public boolean isFini(){
		Morpion[] t = this.getTotal();
		if(t[0].isFini() && t[0].getGagnant() == t[1].getGagnant() && t[2].getGagnant() == t[0].getGagnant()){ //horinzontale haut
		return true;
		}
		else if(t[0].isFini() && t[0].getGagnant() == t[3].getGagnant() && t[6].getGagnant() == t[0].getGagnant()){ // verticale gauche
			return true;
		}
		else if(t[1].isFini() && t[1].getGagnant() == t[4].getGagnant() && t[7].getGagnant() == t[1].getGagnant()){ // verticale milieu
			return true;
		}
		else if(t[2].isFini() && t[2].getGagnant() == t[5].getGagnant() && t[8].getGagnant() == t[2].getGagnant()){ // verticale droite
			return true;
		}
		else if(t[3].isFini() && t[3].getGagnant() == t[4].getGagnant() && t[5].getGagnant() == t[3].getGagnant()){ // horizon milieu
			return true;
		}
		else if(t[6].isFini() && t[6].getGagnant() == t[7].getGagnant() && t[8].getGagnant() == t[6].getGagnant()){ // horizon bas
			return true;
		}
		else if(t[0].isFini() && t[0].getGagnant() == t[4].getGagnant() && t[8].getGagnant() == t[0].getGagnant()){ // diago haut bas
			return true;
		}
		else if(t[2].isFini() && t[2].getGagnant() == t[4].getGagnant() && t[6].getGagnant() == t[2].getGagnant()){ // diago bas haut
			return true;
		}
		else 
			return false;
	}	
	
	

	public boolean isRempli(){
		Morpion[] t = this.getTotal();
		for (int i = 0; i < nbMorpion; i++){
			if(!t[i].isRempli()){
				return false;
			}
		}
		return true;	
	}
	
	public Morpion[] getTotal() {
		return total;
	}

	public void setTotal(Morpion[] total) {
		this.total = total;
	}

	public static int getNbmorpion() {
		return nbMorpion;
	}

	public String afficherLigne (int big, int small) {
		String s = "";
		Morpion[] t = this.getTotal();
		if (small == 0) {
		s += t[big].getChar(0) + "|" + t[big].getChar(1) + "|" + t[big].getChar(2) + " || " + t[big+1].getChar(0) + "|" + t[big+1].getChar(1) + "|" + t[big+1].getChar(2) + " || " + t[big+2].getChar(0) + "|" + t[big+2].getChar(1) + "|" + t[big+2].getChar(2);
		} else if (small == 1) {
			s += t[big].getChar(3) + "|" + t[big].getChar(4) + "|" + t[big].getChar(5) + " || " + t[big+1].getChar(3) + "|" + t[big+1].getChar(4) + "|" + t[big+1].getChar(5) + " || " + t[big+2].getChar(3) + "|" + t[big+2].getChar(4) + "|" + t[big+2].getChar(5);
		} else if (small == 2) {
			s += t[big].getChar(6) + "|" + t[big].getChar(7) + "|" + t[big].getChar(8) + " || " + t[big+1].getChar(6) + "|" + t[big+1].getChar(7) + "|" + t[big+1].getChar(8) + " || " + t[big+2].getChar(6) + "|" + t[big+2].getChar(7) + "|" + t[big+2].getChar(8);
		}
		return s;
	}
	
	public String toString() {
		String s = "------------------------\n";
		for (int i = 0; i < 9; i= i+3) {
			for (int j = 0; j < 3; j++) {
				s += afficherLigne(i,j) + "\n";
			}
			s+= "------------------------\n";
		}
		return s;
	}
	
	
}
