package Swings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 * @autor Iynthurisha @ avec Classe Donnee.java
 *@param 
 * @return une fractale en fontion de valeur Donnee sans bouton
 **/

public class PythagorasTree extends JPanel {
	Donnee data1 = new Donnee(7, 0.15f, 0.5f, 0.02f, 1, 0.035f, 1);
	// Donnee data1 = new Donnee(etoile1, boule1*0.01, etoile2*0.1, boule2*0.01,
	// boule3 paire/impaire, boule4*0.01, boule5paire/impaire);
	// static Donnee data1 = new Donnee(7, 0.15f, 0.5f, 0.02f, , 0.035f, 1);
	// Donnee(int pdepthLimit, float phue, float protation, float psquareH, float
	// psquareS, float ptringleH,float ptringleS)

	public PythagorasTree() {
		setPreferredSize(new Dimension(500, 500)); //
		setBackground(Color.white);
	}

	private void drawTree(Graphics2D g, float x1, float y1, float x2, float y2, int depth) {

		if (depth == data1.getDepthLimit())
			return;

		float dx = x2 - x1;
		float dy = y1 - y2;

		float x3 = x2 - dy;
		float y3 = y2 - dx;
		float x4 = x1 - dy;
		float y4 = y1 - dx;
		float x5 = x4 + data1.getRotation() * (dx - dy);
		float y5 = y4 - 0.5F * (dx + dy);

		Path2D square = new Path2D.Float();

		square.moveTo(x1, y1);
		square.lineTo(x2, y2);
		square.lineTo(x3, y3);
		square.lineTo(x4, y4);
		square.closePath();

		square.moveTo(x1, y1);
		square.lineTo(x2, y2);
		square.lineTo(x3, y3);
		square.lineTo(x4, y4);
		square.closePath();

		g.setColor(Color.getHSBColor(data1.getHue() + depth * data1.getSquareH(), data1.getSquareS(), 1));
		g.fill(square);
		g.setColor(Color.lightGray);
		g.draw(square);
		Path2D triangle = new Path2D.Float();
		triangle.moveTo(x3, y3);
		triangle.lineTo(x4, y4);
		triangle.lineTo(x5, y5);
		triangle.closePath();

		g.setColor(Color.getHSBColor(data1.getHue() + depth * data1.getTringleH(), data1.getTringleS(), 1));
		g.fill(triangle);
		g.setColor(Color.lightGray);
		g.draw(triangle);

		drawTree(g, x4, y4, x5, y5, depth + 1);
		drawTree(g, x5, y5, x3, y3, depth + 1);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawTree((Graphics2D) g, 200, 300, 270, 300, 0);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame f = new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setTitle("Pythagoras Tree1");
			f.setResizable(false);
			f.add(new PythagorasTree(), BorderLayout.CENTER);
			f.pack();
			f.setLocationRelativeTo(null);
			f.setVisible(true);

		});
	}

}
