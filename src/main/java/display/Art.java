package display;



import javax.swing.JFrame;
import library.*;



public class Art extends JFrame {
	
	/**
	 * @author Iynthurisha
	 * 
	 * Fonction d'affichage
	 * @param	Le tableau avec une ligne
	 * @return 	Rien (affiche)
	 **/

	
	private static final long serialVersionUID = 1L;

	public Art() { 
		
		//On cr�e la fen�tre et le panneau
		JFrame window_research = Windows_save.Windows_save_version1();

		//On dessine la fractale
		PythagorasTree draw = new PythagorasTree();

		//On rajoute les �l�ments pour les faire appara�tre
		window_research.add(draw);
		

	}

}
