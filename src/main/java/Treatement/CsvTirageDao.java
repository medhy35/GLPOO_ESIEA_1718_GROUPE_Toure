package Treatement;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class CsvTirageDao {
	
	/**
	 * @author	Medhy35
	 * @author	Gabrielle
	 * 
	 * Traitement du csv
	 * @param	fichier csv
	 * @return	retourne le fichier transformé en objet java
	 */
	
	//Lien d'accès vers le fichier csv
	private final static String RESOURCES_PATH = "src/main/resources/";
    private final static String LOTO_FILE_NAME = "euromillions.csv";
	private String link= RESOURCES_PATH + LOTO_FILE_NAME;
	
	public CsvTirageDao(String link) {
		this.link = link;
	}
	//private String link = "src/main/resources/euromillions_4.csv";
	private static CsvTirageDao instance;
	
	//Création de l'instance
	public CsvTirageDao() {
		super();
	}

	public static synchronized CsvTirageDao getInstance() {
		if (instance == null) {
			instance = new CsvTirageDao();
		}
		return instance;
	}

	//Lecture du fichier
	private List<String> lectureFichier() throws Exception {

		// Instance du fichier
		final File fichier = new File(link);
		final BufferedReader buffer_read = new BufferedReader(new FileReader(fichier));
		
		//Creation du conteneur du tableau
		final List<String> ligne = new ArrayList<String>();

		//Rajout de chaque ligne du buffer dans notre conteneur
		for (String line = buffer_read.readLine(); line != null; line = buffer_read.readLine()) {
			ligne.add(line);
		}
		buffer_read.close();
		return ligne;
	}

	private Tirage lineToTirage(final String line) throws ParseException {
		final Simple_tirage tirage = new Simple_tirage();
		final String[] colonnes = line.split(";");

		/*
		 * On recupere le tirage du fichier par attributs de la
		 * classe. On compte les lignes après chaque ";". Pour les variables de type
		 * "double", on doit adapter la décimale ('.' au lieu de ',')
		 */

		tirage.setNbtirage(new Integer(colonnes[0])); // N° de tirage
		tirage.setDate(colonnes[2]); // Date de tirage
		tirage.setNbTirageCycle(colonnes[3]); // N° tirage dans le cycle
		tirage.setDateForclusion(colonnes[4]); // Date de forclusion
		tirage.setBoule1(new Integer(colonnes[5])); // Boule 1
		tirage.setBoule2(new Integer(colonnes[6])); // Boule 2
		tirage.setBoule3(new Integer(colonnes[7])); // Boule 3
		tirage.setBoule4(new Integer(colonnes[8])); // Boule 4
		tirage.setBoule5(new Integer(colonnes[9])); // Boule 5
		tirage.setEtoile1(new Integer(colonnes[10])); // Etoile 1
		tirage.setEtoile2(new Integer(colonnes[11])); // Etoile 2
		tirage.setWinBoulesASC(colonnes[12]);// Ordre croissant des boules
		tirage.setWinStarASC(colonnes[13]);// Ordre croissant des étoiles

		// Gagnants des boules par rang en France,en Europe et rapport
		tirage.setWinRang1FR(new Integer(colonnes[14]));
		tirage.setWinRang1EUR(new Integer(colonnes[15]));
		tirage.setRateRang1(new Double(colonnes[16]));
		tirage.setWinRang2FR(new Integer(colonnes[17]));
		tirage.setWinRang2EUR(new Integer(colonnes[18]));
		tirage.setRateRang2(new Double(colonnes[19].replace(',', '.')));
		tirage.setWinRang3FR(new Integer(colonnes[20]));
		tirage.setWinRang3EUR(new Integer(colonnes[21]));
		tirage.setRateRang3(new Double(colonnes[22].replace(',', '.')));
		tirage.setWinRang4FR(new Integer(colonnes[23]));
		tirage.setWinRang4EUR(new Integer(colonnes[24]));
		tirage.setRateRang4(new Double(colonnes[25].replace(',', '.')));
		tirage.setWinRang5FR(new Integer(colonnes[26]));
		tirage.setWinRang5EUR(new Integer(colonnes[27]));
		tirage.setRateRang5(new Double(colonnes[28].replace(',', '.')));
		tirage.setWinRang6FR(new Integer(colonnes[29]));
		tirage.setWinRang6EUR(new Integer(colonnes[30]));
		tirage.setRateRang6(new Double(colonnes[31].replace(',', '.')));
		tirage.setWinRang7FR(new Integer(colonnes[32]));
		tirage.setWinRang7EUR(new Integer(colonnes[33]));
		tirage.setRateRang7(new Double(colonnes[34].replace(',', '.')));
		tirage.setWinRang8FR(new Integer(colonnes[35]));
		tirage.setWinRang8EUR(new Integer(colonnes[36]));
		tirage.setRateRang8(new Double(colonnes[37].replace(',', '.')));
		tirage.setWinRang9FR(new Integer(colonnes[38]));
		tirage.setWinRang9EUR(new Integer(colonnes[39]));
		tirage.setRateRang9(new Double(colonnes[40].replace(',', '.')));
		tirage.setWinRang10FR(new Integer(colonnes[41]));
		tirage.setWinRang10EUR(new Integer(colonnes[42]));
		tirage.setRateRang10(new Double(colonnes[43].replace(',', '.')));
		tirage.setWinRang11FR(new Integer(colonnes[44]));
		tirage.setWinRang11EUR(new Integer(colonnes[45]));
		tirage.setRateRang11(new Double(colonnes[46].replace(',', '.')));
		tirage.setWinRang12FR(new Integer(colonnes[47]));
		tirage.setWinRang12EUR(new Integer(colonnes[48]));
		tirage.setRateRang12(new Double(colonnes[49].replace(',', '.')));
		tirage.setWinRang13FR(new Integer(colonnes[50]));
		tirage.setWinRang13EUR(new Integer(colonnes[51]));
		tirage.setRateRang13(new Double(colonnes[52].replace(',', '.')));

		// Gagnants Etoile+ par rang et rapport
		tirage.setWinRang1Star(new Integer(colonnes[53]));
		tirage.setRateRang1Star(new Double(colonnes[54].replace(',', '.')));
		tirage.setWinRang2Star(new Integer(colonnes[55]));
		tirage.setRateRang2Star(new Double(colonnes[56].replace(',', '.')));
		tirage.setWinRang3Star(new Integer(colonnes[57]));
		tirage.setRateRang3Star(new Double(colonnes[58].replace(',', '.')));
		tirage.setWinRang4Star(new Integer(colonnes[59]));
		tirage.setRateRang4Star(new Double(colonnes[60].replace(',', '.')));
		tirage.setWinRang5Star(new Integer(colonnes[61]));
		tirage.setRateRang5Star(new Double(colonnes[62].replace(',', '.')));
		tirage.setWinRang6Star(new Integer(colonnes[63]));
		tirage.setRateRang6Star(new Double(colonnes[64].replace(',', '.')));
		tirage.setWinRang7Star(new Integer(colonnes[65]));
		tirage.setRateRang7Star(new Double(colonnes[66].replace(',', '.')));
		tirage.setWinRang8Star(new Integer(colonnes[67]));
		tirage.setRateRang8Star(new Double(colonnes[68].replace(',', '.')));
		tirage.setWinRang9Star(new Integer(colonnes[69]));
		tirage.setRateRang9Star(new Double(colonnes[70].replace(',', '.')));
		tirage.setWinRang10Star(new Integer(colonnes[71]));
		tirage.setRateRang10Star(new Double(colonnes[72].replace(',', '.')));
		tirage.setMyMillion(colonnes[73]); // N° myMillion
		
		return tirage;
	}

	public ArrayList<Tirage> findAllTirages() {
		//Contient tous les tirages
		final ArrayList<Tirage> tirages = new ArrayList<Tirage>();
		List<String> ligne;
		
		try {
			ligne = lectureFichier();
			boolean isFirst = true;
			for (final String line : ligne) {
				if (line.trim().isEmpty() || line.startsWith("#")) {
					continue;
				}
				if (isFirst) {
					isFirst = false;
					continue;
				}
				final Tirage tirage = lineToTirage(line);
				tirages.add(tirage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tirages;
	}
}