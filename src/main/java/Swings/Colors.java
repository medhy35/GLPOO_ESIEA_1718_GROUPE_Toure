package Swings;

import java.util.ArrayList;

public class Colors {
	
	/**
	 * @author	Julie
	 * 
	 * Obtenir toutes les couleurs possibles 
	 * @param Le nom d'une couleur prédéfini
	 * @return	Le code RGB de la couleur sous la forme d'une liste de 3 entiers
	 */
	public static ArrayList<Integer> choose_color (String color_wanted){
		
		ArrayList<Integer> code_color = new ArrayList<Integer>();
		switch(color_wanted) {
			case "blue" : 
				code_color.add(0);
				code_color.add(76);
				code_color.add(153);
				break;
			case "gold" :
				code_color.add(255);
				code_color.add(215);
				code_color.add(0);
				break;
			case "red" :
				code_color.add(255);
				code_color.add(0);
				code_color.add(0);
			default :
				break;
		}
		return (code_color);
		
	}
}
