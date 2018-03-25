package library;

import java.awt.Dimension;

import javax.swing.JFrame;

// Création d'une fenêtre

public class Windows extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * @author	Julie
	 * 
	 * Positionnement d'éléments
	 * @param	le titre de la fenêtre, le largeur et la longueur
	 * @return	Ne retourne rien (constructeur)
	 */
	
	public Windows(String headline, int width, int weight) {
		this.setTitle(headline);								//On ajoute un titre à la fenêtre
	    this.setSize(new Dimension(width, weight));				//On dimensionne la fenêtre
	    this.setLocationRelativeTo(null);						//On centre la fenêtre sur l'écran
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//La fenêtre se ferme lorsqu'on clique sur la croix
	    this.setResizable(false);								//Empêche l'utilisateur de changer la taille de la fenêtre
	    this.setVisible(true);									//Affiche la fenêtre
	}
	
	
}
