package morpion;

public class main {
	public static void main(String[] args) {
		System.out
				.println("Bonjour, bienvenue dans Mega Morpion \n"
						+ "Le but du jeu est de gagner 3 petits morpions alignés dans le grand plateau pour gagner le grand morpion \n"
						+ "Le premier joueur choisi où il peut jouer, et le deuxième joueur devra jouer selon le placement du pion du premier joueur \n"
						+ "En effet, si le premier joueur place son pion dans le carré haut-gauche d'un petit morpion, le deuxième joueur devra donc jouer\n"
						+ "sur la case haut-gauche du grand morpion, et décidera donc du petit morpion où le premier joueur jouera son second tour,\n"
						+ "et ainsi de suite jusqu'à ce que l'un des joueurs aligne 3 petits morpions gagnants.\n"
						+ "Si un morpion a été rempli mais qu'il n'y a pas de gagnant (match nul), il sera rempli de N\n"
						+ "Si le joueur ne peut pas jouer sur le morpion assigné par le joueur précédent, car celui ci est plein \n"
						+ "alors, il devra choisir le morpion sur lequel il veut jouer\n");
		System.out
				.println("L'ordinateur vous dira dans quel morpion jouer. Vous devrez entrer un numéro entre 1 et 9, les cases se situeront selon ce dessin: \n"
						+ " 1 | 2 | 3 \n" + " 4 | 5 | 6 \n" + " 7 | 8 | 9 \n");

		Partie p = new Partie();
		Joueur j1 = new Joueur('X');
		j1.chooseName();

		if (j1.chooseIA()) {
			IA ia = new IA('O');
			p.startIA(j1, ia);
			p.checkWinner(j1, ia);
		} else {
			Joueur j2 = new Joueur('O');
			j2.chooseName();

			p.start(j1, j2);
			p.checkWinner(j1, j2);
		}
	}
}
