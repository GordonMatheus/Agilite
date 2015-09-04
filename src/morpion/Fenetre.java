package morpion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame {
	int tour = 1;
	public Fenetre() {

		JFrame fen = new JFrame();
		JPanel[] base = new JPanel[9];
		JButton[][] button = new JButton[9][9];
		fen.setLayout(new FlowLayout());
		fen.setPreferredSize(new Dimension(600,600));
		Dimension dBouton = new Dimension(30,30);
		
		for (int i =0; i < 9; i++) {
			base[i] = new JPanel();
			base[i].setLayout(new GridLayout(3,3));
			base[i].setPreferredSize(new Dimension(175,175));
			base[i].setBackground(Color.black);
			for (int j = 0; j < 9; j++) {
				button[i][j] = new JButton();
				button[i][j].setPreferredSize(dBouton);
/*				button[i][j].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						if (tour == 1) {
							arg0.getSource().
						}
					}
					
				});*/
				base[i].add(button[i][j]);
			}
			fen.add(base[i]);
			fen.getContentPane().setBackground(new Color(0,0,144));
		}
		

		fen.pack();
		fen.setVisible(true);
	}


}
