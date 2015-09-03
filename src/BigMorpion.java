
public class BigMorpion extends Plateau {
	Morpion[] total;
	static final int nbMorpion = 9;
	
	BigMorpion() {
		this.total = new Morpion[9];
		for (int i = 0; i < nbMorpion; i++) {
			total[i] = new Morpion();
		}
	}
	
	public String toString() {
		String rep = "";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++){
				rep += total[i].getChar();
			}
			
			if ( i == 3 || i == 6) {
				rep += "\n";
				rep += "------------------";
				rep += "\n";		
			}
		}
		return rep;
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
