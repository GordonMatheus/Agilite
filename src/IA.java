import java.util.Random;


public class IA extends Joueur {

	IA(String name, char m) {
		super(name, m);
	}
	
	public int choixCase (int numMorpion, Morpion  t) {
		Random rand = new Random();
		int x = rand.nextInt(9);
		while (t.getChar(x) != ' ') {
			x = rand.nextInt(9);
		}
		t.addChar(x, this);
		return x;
		}


	}
	
