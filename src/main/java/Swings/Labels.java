package Swings;

import java.awt.*;
import javax.swing.*;


public class Labels extends JLabel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author	Julie
	 * 
	 * Création d'un label
	 * @param	Le texte voulu, le type d'écriture, la taille du texte, les couleurs souhaitées
	 * @return 	Ne retourne rien (constructeur)
	 */

	public Labels(String text, String writting_type, int size, String background, String foreground) {
		this.setText(text);
		this.setFont(new Font(writting_type, 1, size));
		this.setBackground(new Color(Colors.choose_color(background).get(0), Colors.choose_color(background).get(1), Colors.choose_color(background).get(2)));
        this.setForeground(new Color(Colors.choose_color(foreground).get(0), Colors.choose_color(foreground).get(1), Colors.choose_color(foreground).get(2)));
        this.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
