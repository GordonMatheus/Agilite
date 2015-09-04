package test;

import static org.junit.Assert.*;
import morpion.Joueur;
import morpion.Morpion;

import org.junit.Test;

public class TestMorpion {

	@Test
	public final void isFini() {

		Morpion m = new Morpion();
		Joueur j1 = new Joueur('I');
		Joueur j2 = new Joueur('x');

		assertFalse(m.isFini());

		m.addChar(0, j1);
		m.addChar(1, j1);
		m.addChar(3, j1);
		assertFalse(m.isFini());

		m.addChar(2, j2);
		assertFalse(m.isFini());
		m.addChar(5, j2);
		m.addChar(8, j2);
		assertTrue(m.isFini());
	}

	@Test
	public final void isRempli() {

		Morpion m = new Morpion();
		Joueur j1 = new Joueur('I');

		assertFalse(m.isRempli());
		m.addChar(0, j1);
		m.addChar(1, j1);
		m.addChar(2, j1);
		m.addChar(3, j1);
		m.addChar(5, j1);
		m.addChar(6, j1);
		m.addChar(7, j1);
		m.addChar(8, j1);
		assertFalse(m.isRempli());
		m.addChar(4, j1);
		assertTrue(m.isRempli());

	}

}
