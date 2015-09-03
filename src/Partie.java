import java.util.Scanner;

public class Partie {

	private int last = -1;
	
	public String saisie() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
	}

	public int parse() {
		int i = -1;
		while (i<1 || i>9) {
			
			try {
				i = Integer.parseInt(saisie());
				i++;
			} catch (Exception e) {
				System.out.println("saisir un entier");
			}
			if (i<1 || i>9) {
				System.out.println("saisir un entier compris entre 0 et 8");
			}
		}
		return i;
	}
	
	public int choixPlateau() {
			System.out.println("Choississez le plateau sur lequel vous souhaitez placer votre pion");
		return parse();
	}
	
	public int choixCase(int plateau) {
		System.out.println("Vous jouez sur le morpion " +plateau+"" +
				"\nSur quelle case voulez-vous placer votre pion ?\n");
		return parse();
	}
	
	public void tour(Joueur j, BigMorpion m) {
		if( last == -1 || m.getTotal()[last].isFini())
			last = choixPlateau();
		
		int choix = choixCase(last);
		m.getTotal()[last].addChar(choix, j);
		last= choix;
	}

}
