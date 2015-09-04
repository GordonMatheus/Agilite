package morpion;

import java.util.Random;

public class IA extends Joueur {

	IA(char m) {
		super(m);
	}

	public int choixCase() {
		Random rand = new Random();
		int x = rand.nextInt(9);
		return x;
	}

	public int choixPlateau() {
		Random rand = new Random();
		int x = rand.nextInt(9);
		return x;
	}

}
