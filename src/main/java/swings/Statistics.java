package swings;

import java.util.ArrayList;
import javax.swing.JFrame;
import library.Windows_save;
import treatement.Tirage;

public class Statistics {
	
	/**
	 * @author 	Ifuja
	 * 
	 * Creation de la fenetre statistique
	 * @param	path
	 * @return 	rien
	 */

	public Statistics(final ArrayList<Tirage> path) {
		
		//Cr�ation d'une fen�tre
		final JFrame window = Windows_save.Windows_save_version2(path);
		window.setVisible(true);
		window.pack();
	}
}
