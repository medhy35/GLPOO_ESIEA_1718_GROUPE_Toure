package launcher;

import java.util.ArrayList;
import swings.Welcome_interface;
import treatement.CsvTirageDao;
import treatement.Tirage;

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
