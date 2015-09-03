import java.util.Scanner;

public class Partie {

	BigMorpion m = new BigMorpion();
	private int last;
	private Scanner sc;

	public Partie() {
		this.last = -1;
		sc = new Scanner(System.in);
	}

	public String saisie() {
		String str = sc.nextLine();
		return str;
	}

	public int parse() {
		int i = -1;
		while (i < 1 || i > 9) {
			String s = saisie();
			try {
				i = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("saisir un entier");
			}
			if (i < 1 || i > 9) {
				System.out.println("saisir un entier compris entre 0 et 8");
			}
		}
		return --i;
	}

	public int choixPlateau() {
		System.out
				.println("Choississez le plateau sur lequel vous souhaitez placer votre pion");
		return parse();
	}

	public int choixCase(int plateau) {
		System.out.println("Vous jouez sur le morpion " + plateau + ""
				+ "\nSur quelle case voulez-vous placer votre pion ?\n");
		return parse();
	}

	public void tour(Joueur j) {
		System.out.println("Tour du joueur " + j.getNom());

		if (last == -1 || m.getTotal()[last].isFini())
			last = choixPlateau();

		int choix = choixCase(last);
		m.getTotal()[last].addChar(choix, j);
		last = choix;
	}

	public void start(Joueur j1, Joueur j2) {
		while (!m.isFini()) {
			System.out.println(m.toString());
			tour(j1);
			if (!m.isFini()) {
				System.out.println(m.toString());
				tour(j2);
			}
		}
	}
	
	public char checkWinner() {
			return m.getWinner();
	}

}
