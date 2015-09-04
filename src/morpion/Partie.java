package morpion;

public class Partie {

	BigMorpion m = new BigMorpion();
	private int last;

	public Partie() {
		this.last = -1;
	}

	public void tour(Joueur j) {
		int choix;
		do {
			System.out.println("Tour du joueur " + j.getNom());
			if (last == -1 || m.getTotal()[last].isFini())
				last = j.choixPlateau();

			choix = j.choixCase(last);

		} while (!m.getTotal()[last].addChar(choix, j));
		last = choix;
	}

	public void tourIA(IA ia) {
		int choix;
		do {
			System.out.println("Tour de l'IA");
			if (last == -1 || m.getTotal()[last].isFini())
				last = ia.choixPlateauRandom();

			choix = ia.choixCaseMorpionSimple(m.getTotal()[last]);

		} while (!m.getTotal()[last].addChar(choix, ia));
		last = choix;
	}

	public void start(Joueur j1, Joueur j2) {
		System.out.println("Début de la partie :  " + j1.getNom() + " VS "
				+ j2.getNom());
		while (!m.isFini()) {
			System.out.println(m.toString());
			tour(j1);
			if (!m.isFini()) {
				System.out.println(m.toString());
				tour(j2);
			}
		}
		System.out.println("Fin de la partie");
	}

	public void startIA(Joueur j1, IA ia) {
		System.out.println("Début de la partie :  " + j1.getNom() + " VS IA");
		while (!m.isFini()) {
			System.out.println(m.toString());
			tour(j1);
			if (!m.isFini()) {
				System.out.println(m.toString());
				tourIA(ia);
			}
		}
		System.out.println(m.toString());
		System.out.println("Fin de la partie");
	}

	public void checkWinner(Joueur j1, Joueur j2) {
		char winner = m.getWinner();
		if (winner == 'N')
			System.out.println("égalité");
		else if (winner == j1.getMarque())
			System.out.println("Le joueur " + j1.getNom() + " a gagné");
		else if (winner == j2.getMarque())
			System.out.println("Le joueur " + j2.getNom() + " a gagné");
	}

}
