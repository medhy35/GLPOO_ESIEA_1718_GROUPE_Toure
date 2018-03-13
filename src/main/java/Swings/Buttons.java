package Swings;

import javax.swing.JButton;

public class Buttons extends JButton {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author	Julie
	 * 
	 * Création d'un bouton 
	 * @param	Le text du bouton
	 * @return	Il ne retourne rien (constructeur)
	 */
	
	public Buttons(String text) {
        this.setText(text);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
	}
}
