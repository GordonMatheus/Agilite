
public class main {
	public static void main(String[] args) {
		BigMorpion m = new BigMorpion();
		Joueur j1 = new Joueur("Paul", 'X');
		Joueur j2 = new Joueur("Jean", 'O');
		
		System.out.println("Bonjour, bienvenue dans Mega Morpion \n" +
				"Le but du jeu est de gagner 3 petits morpions alignés dans le grand plateau pour gagner le grand morpion \n" +
				"Le premier joueur choisi où il peut jouer, et le deuxième joueur devra jouer selon le placement du pion du premier joueur \n" +
				"En effet, si le premier joueur place son pion dans le carré haut-gauche d'un petit morpion, le deuxième joueur devra donc jouer" +
				" sur la case haut-gauche du grand morpion, et décidera donc du petit morpion où le premier joueur jouera son second tour, " +
				"et ainsi de suite jusqu'à ce que l'on réussisse à aligner 3 petits morpions gagnants.");
		System.out.println("Si un morpion a été rempli mais qu'il n'y a pas de gagnant (match nul), il sera rempli de 'N");
		System.out.println("Si le joueur ne peut pas jouer sur le morpion assigné par le joueur précédent, car celui ci est plein \n" +
				"alors, il devra jouer sur le morpion où le joueur précédent a joué");
		
		m.getTotal()[0].addChar(0,j1);
		m.getTotal()[0].addChar(1,j1);
		System.out.println(m.getTotal()[0].isFini());
		m.getTotal()[0].addChar(2,j1);
		System.out.println(m.getTotal()[0].isFini());
		System.out.println(m.getTotal()[0]);
	}
}
