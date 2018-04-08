package Launcher;

import java.util.ArrayList;
import Swings.Welcome_interface;
import Treatement.CsvTirageDao;
import Treatement.Tirage;

public class Launcher {
	
	/**
	 * @author	Julie
	 * 
	 * Classe de lancement de l'application
	 * @param	string args
	 * @return	Ne retourne rien (méthode void)	
	 */

	public static void main(String[] args) {
		
		ArrayList<Tirage> path = new ArrayList<>();
		path = CsvTirageDao.getInstance().findAllTirages();
		new Welcome_interface(path);
	}

}