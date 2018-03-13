package Swings;

import java.awt.Color;


import javax.swing.*;

public class Pictures extends JLabel {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @author	Julie
	 * 
	 * Importation d'une image
	 * @param	lien de l'image dans le projet et la couleur du label dans lequel elle est placée
	 * @return	le label comportant l'image
	 */
	public JLabel create_picture(String link, String color) {																						
		JLabel image = new JLabel(new ImageIcon(link));
		image.setBackground(new Color(Colors.choose_color(color).get(0), Colors.choose_color(color).get(1), Colors.choose_color(color).get(2)));
		return(image);
	}
}
