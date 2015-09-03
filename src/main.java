
public class main {
	public static void main(String[] args) {
		BigMorpion m = new BigMorpion();
		Joueur j1 = new Joueur("Paul", 'X');
		Joueur j2 = new Joueur("Jean", 'O');
		
		m.getTotal()[0].addChar(0,0,j1);
		m.getTotal()[0].addChar(1,1,j2);
		System.out.println(m);
	}
}
