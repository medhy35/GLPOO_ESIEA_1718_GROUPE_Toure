package library;


import java.awt.*;
import javax.swing.*;

public class Panels extends JPanel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author	Julie
	 * 
	 * Création d'un panneau
	 * @param	la largeur, la longueur et la couleur de fond
	 * @return	Ne retourne rien (constructeur)
	 */
		
	public Panels (int width, int lenght, String color) {					
		this.setPreferredSize(new Dimension(width, lenght));																					//On dimensionne le panneau
		this.setBackground(new Color(Colors.choose_color(color).get(0),Colors.choose_color(color).get(1),Colors.choose_color(color).get(2)));	//On colorie le panneau
	}
	
}

