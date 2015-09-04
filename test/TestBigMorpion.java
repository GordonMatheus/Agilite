package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import morpion.BigMorpion;
import morpion.Joueur;
import morpion.Morpion;

public class TestBigMorpion {

	@Test
	public final void isFini() {

		BigMorpion m = new BigMorpion();
		Morpion[] l = m.getTotal();
		Joueur j1 = new Joueur('I');
		Joueur j2 = new Joueur('x');

		assertFalse(m.isFini());

		for (int i = 0; i < 9; i++) {
			l[0].addChar(i, j1);
			l[2].addChar(i, j1);
		}
		l[0].setGagnant('I');
		l[2].setGagnant('I');
		assertFalse(m.isFini());

		for (int i = 0; i < 9; i++) {
			l[1].addChar(i, j1);
		}
		l[1].setGagnant('I');
		assertTrue(m.isFini());

	}

	@Test
	public final void isRempli() {
		BigMorpion m = new BigMorpion();
		Morpion[] l = m.getTotal();
		Joueur j1 = new Joueur('I');
		Joueur j2 = new Joueur('x');

		for (int i = 0; i < 9; i++) {
			l[0].addChar(i, j1);
			l[2].addChar(i, j1);

		}
		assertFalse(m.isRempli());
		for (int i = 0; i < 9; i++) {
			l[1].addChar(i, j1);
			l[3].addChar(i, j1);
			l[4].addChar(i, j1);
			l[5].addChar(i, j1);
			l[6].addChar(i, j1);
			l[7].addChar(i, j1);
			l[8].addChar(i, j1);
		}
		assertTrue(m.isRempli());
	}

	@Test
	public final void affichageLigne() {
		BigMorpion m = new BigMorpion();
		Morpion[] l = m.getTotal();
		Joueur j1 = new Joueur('I');
		Joueur j2 = new Joueur('x');

		l[0].addChar(0, j1);
		l[0].addChar(1, j1);
		l[0].addChar(2, j2);

		l[1].addChar(0, j1);
		l[1].addChar(1, j2);
		l[1].addChar(2, j2);

		l[2].addChar(1, j1);

		System.out.println(m.afficherLigne(0, 0));
		String resultatTheorique = "";
		assertFalse(resultatTheorique.equals(m.afficherLigne(0, 0)));
		resultatTheorique = "I|I|x || I|x|x ||  |I| ";
		assertTrue(resultatTheorique.equals(m.afficherLigne(0, 0)));
	}
}
