package library;

import java.awt.*;
import javax.swing.*;


public class Labels extends JLabel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author	Julie
	 * 
	 * Création d'un label
	 * @param	Le texte voulu, le type d'écriture, la taille du texte, les couleurs souhaitées
	 * @return 	Retourne le texte sous forme de label ou de JTextField
	 */

	public static JLabel create_label(String text, String writting_type, int size, String background, String foreground) {
		JLabel component = new JLabel();
		component.setText(text);
		component.setFont(new Font(writting_type, 1, size));
		component.setBackground(new Color(Colors.choose_color(background).get(0), Colors.choose_color(background).get(1), Colors.choose_color(background).get(2)));
		component.setForeground(new Color(Colors.choose_color(foreground).get(0), Colors.choose_color(foreground).get(1), Colors.choose_color(foreground).get(2)));
		component.setHorizontalAlignment(SwingConstants.CENTER);
		return(component);
	}
	
	public static JTextField create_textfield(String text) {
		JTextField component = new JTextField();
		component.setText(text);
		return(component);
	}
}
