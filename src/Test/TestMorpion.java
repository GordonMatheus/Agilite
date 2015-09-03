

package Test;

import static org.junit.Assert.*;
import morpion.Joueur;
import morpion.Morpion;

import org.junit.Test;

public class TestMorpion {
	
	@Test
	public final void TestisFini(){
		
		Morpion m = new Morpion();
		Joueur j1 = new Joueur("j1",'I');
		Joueur j2 = new Joueur("j2",'x');
		
		assertFalse(m.isFini());
		
		m.addChar(0, j1);
		m.addChar(1,j1);
		m.addChar(3,j1);
		assertFalse(m.isFini());
		
		m.addChar(2, j2);
		assertFalse(m.isFini());
		m.addChar(5,j2);
		m.addChar(8,j2);
		assertTrue(m.isFini());
		
		
	}
	@Test
	public final void TestisRempli(){
		
		Morpion m = new Morpion();
		Joueur j1 = new Joueur("j1",'I');

		assertFalse(m.isRempli());
		m.addChar(0, j1);
		m.addChar(1,j1);
		m.addChar(2,j1);
		m.addChar(3, j1);
		m.addChar(5,j1);
		m.addChar(6,j1);
		m.addChar(7, j1);
		m.addChar(8,j1);
		assertFalse(m.isRempli());
		m.addChar(4,j1);
		assertTrue(m.isRempli());
		
	}
	
	

}
