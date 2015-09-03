
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
	
	
}
