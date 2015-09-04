package morpion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame {
	JFrame fen = new JFrame();
	public Menu() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		JButton b1 = new JButton("JOUEUR CONTRE JOUEUR");
		JButton b2 = new JButton("JOUEUR CONTRE IA");
		JButton b3 = new JButton("RÈGLES");
		JButton b4 = new JButton("QUITTER");
		panel.setLayout(new BorderLayout());
		panel.add(new JLabel(new ImageIcon("images/mega.png")), BorderLayout.NORTH);
		panel.add(b1, BorderLayout.WEST);
		panel.add(b2, BorderLayout.EAST);
		panel.add(b3, BorderLayout.CENTER);
		panel.add(b4, BorderLayout.SOUTH);
		b1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Fenetre();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		
		b2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Fenetre();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		
		b3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Regles();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		
		b4.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		
		fen.add(panel);
		fen.setLocation(600, 320);
		fen.pack();
		fen.setVisible(true);
	}
}
