package morpion;

import java.util.Scanner;

public class Joueur {
	char marque;
	String nom;

	private Scanner sc;

	Joueur(char m) {
		this.marque = m;
		sc = new Scanner(System.in);
	}

	public char getMarque() {
		return this.marque;
	}

	public void setMarque(char c) {
		this.marque = c;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void chooseName() {
		System.out.println("choisir un nom pour le joueur au pion "
				+ this.marque);
		setNom(sc.nextLine());
	}

	public boolean chooseIA() {
		String answer;
		while (true) {
			System.out.println("Voulez-vous jouer contre une IA ?\n"
					+ "Tapez 'oui' ou 'non'");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("oui") 
					|| answer.equalsIgnoreCase("o")
					|| answer.equalsIgnoreCase("yes")
					|| answer.equalsIgnoreCase("y")) {
				return true;
			} else if (answer.equalsIgnoreCase("non")
					|| answer.equalsIgnoreCase("no")
					|| answer.equalsIgnoreCase("n")) {
				return false;
			} else 
				System.out.println("Réponse invalide");
			
		}
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
				System.out.println("saisir un entier compris entre 1 et 9");
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
		System.out.println("Vous jouez sur le morpion " + (plateau + 1) + ""
				+ "\nSur quelle case voulez-vous placer votre pion ?\n");
		return parse();
	}

}
