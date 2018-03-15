package Dao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvTirageDao {
	private final static String RESOURCES_PATH = "src/main/resources/";
    private final static String LOTO_FILE_NAME = "euromillions.csv";
	private String link= RESOURCES_PATH + LOTO_FILE_NAME;;

	public CsvTirageDao(String link) {
		this.link = link;
	}

	private List<String> lectureFichier() throws Exception {

		// Instance du fichier
		final File fichier = new File(link);

		final List<String> ligne = new ArrayList<String>();

		final FileReader fichier_read = new FileReader(fichier);
		final BufferedReader buffer_read = new BufferedReader(fichier_read);

		// met les lignes du buffer dans la liste de lignes de tirage
		for (String line =  buffer_read.readLine(); line != null; line =  buffer_read.readLine()) {
			ligne.add(line);
		}

		 buffer_read.close();
		 fichier_read.close();

		return ligne;
	}

	private Tirage lineToTirage(final String line) {
		final SimpleTirage tirage = new SimpleTirage();
		final String[] colonnes = line.split(";");

		// on recupere le tirage du fichier

		final String[] boulesValues = colonnes[12].split("-");
		tirage.setBoule1(new Integer(boulesValues[1]));
		tirage.setBoule2(new Integer(boulesValues[2]));
		tirage.setBoule3(new Integer(boulesValues[3]));
		tirage.setBoule4(new Integer(boulesValues[4]));
		tirage.setBoule5(new Integer(boulesValues[5]));

		// on recupere le tirage du fichier
		
		final String[] etoilesValues = colonnes[13].split("-");
		tirage.setEtoile1(new Integer(etoilesValues[1]));
		tirage.setEtoile2(new Integer(etoilesValues[2]));

		return tirage;

	}

	public List<Tirage> findAllTirages() {
		final List<Tirage> tirages = new ArrayList<Tirage>();

		
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