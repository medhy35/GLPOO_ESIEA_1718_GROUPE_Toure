package swings;

import java.util.ArrayList;
import javax.swing.JFrame;
import library.Windows_save;
import treatement.Tirage;

public class Statistics {

	public Statistics(final ArrayList<Tirage> path) {
		
		//Création d'une fenêtre
		final JFrame window = Windows_save.Windows_save_version2(path);
		window.setVisible(true);
		window.pack();
	}
}
