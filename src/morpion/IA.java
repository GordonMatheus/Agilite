package morpion;

import java.util.ArrayList;
import java.util.Random;

public class IA extends Joueur {

	IA(char m) {
		super(m);
	}

	public int choixCaseRandom() {
		Random rand = new Random();
		int x = rand.nextInt(9);
		return x;
	}

	public int choixPlateauRandom() {
		Random rand = new Random();
		int x = rand.nextInt(9);
		return x;
	}
	
	public int choixCaseMorpionSimple(Morpion m) {
		int x=-1;
		for (int i = 0;i<9;++i) {
			if (m.getChar(i) == ' ') {
				System.out.println(" espace ");
				if (i%3 == 0) {
					if (m.getChar(i+1) != ' ' && m.getChar(i+1) == m.getChar(i+2)) {
						x = i;
						System.out.println(" ligne ");
					}
				} else if (i%3 == 1) {
					if (m.getChar(i+1) != ' ' && m.getChar(i-1) == m.getChar(i+1)) {
						x = i;
						System.out.println(" ligne ");
					}
				} else if (i%3 == 2) {
					if (m.getChar(i-1) != ' ' && m.getChar(i-1) == m.getChar(i-2)) {
						x = i;
						System.out.println(" ligne ");
					}
				} else if (i<3) {
					if (m.getChar(i-3) != ' ' && m.getChar(i+3) == m.getChar(i+6)) {
						x = i;
					}
				} else if (i>=6) {
					if (m.getChar(i-3) != ' ' && m.getChar(i-3) == m.getChar(i-6)) {
						x = i;
					}
				} else if (i>=3 && i<6) {
					if (m.getChar(i-3) != ' '  && m.getChar(i+3) == m.getChar(i-3)) {
						x = i;
					}
				}
			}
		}
		if (x == -1) {
			Random rand = new Random();
			x = rand.nextInt(9);
		}
		return x;
	}

}
