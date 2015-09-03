import java.util.Scanner;


public class Joueur {
	char marque;
	String nom;

	private Scanner sc;
	
	Joueur (char m) {
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
		System.out.println("choisir un nom pour le joueur au pion " + this.marque);
		setNom(sc.nextLine());
	}
	
}
