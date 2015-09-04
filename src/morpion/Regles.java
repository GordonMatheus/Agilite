package morpion;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Regles extends JFrame {

	public Regles() {
		JFrame fen = new JFrame();
		fen.setPreferredSize(new Dimension(1200,200));
		fen.setLayout(new FlowLayout());
		fen.add(new JLabel("Bonjour, bienvenue dans Mega Morpion !!!"));
		fen.add(new JLabel("Le but du jeu est de gagner 3 petits morpions alignés dans le grand plateau pour gagner le grand morpion."));
		fen.add(new JLabel("Le premier joueur choisi où il peut jouer, et le deuxième joueur devra jouer selon le placement du pion du premier joueur."));
		fen.add(new JLabel("En effet, si le premier joueur place son pion dans le carré haut-gauche d'un petit morpion, le deuxième joueur devra donc jouer"));
		fen.add(new JLabel("sur la case haut-gauche du grand morpion, et décidera donc du petit morpion où le premier joueur jouera son second tour,"));
		fen.add(new JLabel("et ainsi de suite jusqu'à ce que l'on réussisse à aligner 3 petits morpions gagnants."));
		fen.add(new JLabel("Si un morpion a été rempli mais qu'il n'y a pas de gagnant (match nul), il sera rempli de N."));
		fen.add(new JLabel("Si le joueur ne peut pas jouer sur le morpion assigné par le joueur précédent, car celui ci est plein"));
		fen.add(new JLabel("alors, il devra choisir le morpion sur lequel il veut jouer."));
		fen.setLocation(200, 300);
		fen.pack();
		fen.setVisible(true);
	}
}
