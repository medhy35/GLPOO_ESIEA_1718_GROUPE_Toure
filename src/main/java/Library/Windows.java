package Library;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Windows extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * @author	Julie
	 * 
	 * Positionnement d'�l�ments
	 * @param	le titre de la fen�tre, le largeur et la longueur
	 * @return	Ne retourne rien (constructeur)
	 */
	
	public Windows(String headline, int width, int weight) {
		this.setTitle(headline);								//On ajoute un titre � la fen�tre
	    this.setSize(new Dimension(width, weight));				//On dimensionne la fen�tre
	    this.setLocationRelativeTo(null);						//On centre la fen�tre sur l'�cran
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//La fen�tre se ferme lorsqu'on clique sur la croix
	    this.setResizable(false);								//Emp�che l'utilisateur de changer la taille de la fen�tre
	    this.setVisible(true);									//Affiche la fen�tre
	}
}
