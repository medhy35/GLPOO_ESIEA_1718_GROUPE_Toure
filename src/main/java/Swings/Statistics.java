package Swings;

import java.util.ArrayList;
import javax.swing.JFrame;
import Library.Windows_save;
import Treatement.Tirage;

public class Statistics {

	public Statistics(final ArrayList<Tirage> path) {
		
		//Création d'une fenêtre
		final JFrame window = Windows_save.Windows_save_version2(path);
		window.setVisible(true);
		window.pack();
	}
}