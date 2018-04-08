package display_path;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import treatement.CsvTirageDao;
import treatement.Tirage;


public class TirageModelComplet extends AbstractTableModel {

	/**
	 * @author	Gabrielle
	 * 
	 * Formatage du conteneur et remplissage à partir des données
	 * @param	Aucun
	 * @return	Aucun
	 */
	
	private static final long serialVersionUID = 1L;
	// Exemple de liste de tirage
	private CsvTirageDao csv;
	// Entête des colonnes
	private final String[] entete = { "N° tirage", "Jour", "Date", "N° tirage_cycle", "Date_Forclusion", "Boule 1",
			"Boule 2", "Boule 3", "Boule 4", "Boule 5", "Etoile 1", "Etoile 2", "Boules_ordre_ASC", "Etoiles_ordre_ASC",
			"Gagnants_Rang1_FR", "Gagnants_Rang1_EUR", "Rapport_Rang1", "Gagnants_Rang2_FR", "Gagnants_Rang2_EUR",
			"Rapport_Rang2", "Gagnants_Rang3_FR", "Gagnants_Rang3_EUR", "Rapport_Rang3", "Gagnants_Rang4_FR",
			"Gagnants_Rang4_EUR", "Rapport_Rang4", "Gagnants_Rang5_FR", "Gagnants_Rang5_EUR", "Rapport_Rang5",
			"Gagnants_Rang6_FR", "Gagnants_Rang6_EUR", "Rapport_Rang6", "Gagnants_Rang7_FR", "Gagnants_Rang7_EUR",
			"Rapport_Rang7", "Gagnants_Rang8_FR", "Gagnants_Rang8_EUR", "Rapport_Rang8", "Gagnants_Rang9_FR",
			"Gagnants_Rang9_EUR", "Rapport_Rang9", "Gagnants_Rang10_FR", "Gagnants_Rang10_EUR", "Rapport_Rang10",
			"Gagnants_Rang11_FR", "Gagnants_Rang11_EUR", "Rapport_Rang11", "Gagnants_Rang12_FR", "Gagnants_Rang12_EUR",
			"Rapport_Rang12", "Gagnants_Rang13_FR", "Gagnants_Rang13_EUR", "Rapport_Rang13", "Gagnants_Rang1_Etoile+",
			"Rapport_Rang1_Etoile+", "Gagnants_Rang2_Etoile+", "Rapport_Rang2_Etoile+", "Gagnants_Rang3_Etoile+",
			"Rapport_Rang3_Etoile+", "Gagnants_Rang4_Etoile+", "Rapport_Rang4_Etoile+", "Gagnants_Rang5_Etoile+",
			"Rapport_Rang5_Etoile+", "Gagnants_Rang6_Etoile+", "Rapport_Rang6_Etoile+", "Gagnants_Rang7_Etoile+",
			"Rapport_Rang7_Etoile+", "Gagnants_Rang8_Etoile+", "Rapport_Rang8_Etoile+", "Gagnants_Rang9_Etoile+",
			"Rapport_Rang9_Etoile+", "Gagnants_Rang10_Etoile+", "Rapport_Rang10_Etoile+",
			"N° MyMillion"/* , "N° exceptionnel_Euromillions" */ };
	// Tableau de tirages
	private ArrayList<Tirage> listTirage;
	// Définition du mode d'affichage des dates
	SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEE");

	// Appel d'une instance de la liste DAO et récupération de la liste
	public TirageModelComplet() {
		super();
		csv = CsvTirageDao.getInstance();
		listTirage = csv.findAllTirages();
	}

	// Taille du tableau (nombre de colonnes)
	@Override
	public int getColumnCount() {
		return entete.length;
	}

	// Définition du nom des colonnes
	@Override
	public String getColumnName(int columnIndex) {
		return entete[columnIndex];
	}

	// Taille du tableau (nombre de lignes)
	@Override
	public int getRowCount() {
		return listTirage.size();
	}

	/*
	 * Récupération des tirages et des attributs de chaque tirage. On place chaque
	 * élément dans la liste et la colonne qui lui correspond.
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		switch (columnIndex) {

		case 0:
			return listTirage.get(rowIndex).getNbTirage() + "  ";
		case 1:
			return dateFormat.format(listTirage.get(rowIndex).getDate());
		case 2:
			return listTirage.get(rowIndex).getDate();
		case 3:
			return listTirage.get(rowIndex).getNbTirageCycle() + "  ";
		case 4:
			return listTirage.get(rowIndex).getDateForclusion();
		case 5:
			return listTirage.get(rowIndex).getBoule1() + "  ";
		case 6:
			return listTirage.get(rowIndex).getBoule2() + "  ";
		case 7:
			return listTirage.get(rowIndex).getBoule3() + "  ";
		case 8:
			return listTirage.get(rowIndex).getBoule4() + "  ";
		case 9:
			return listTirage.get(rowIndex).getBoule5() + "  ";
		case 10:
			return listTirage.get(rowIndex).getEtoile1() + "  ";
		case 11:
			return listTirage.get(rowIndex).getEtoile2() + "  ";
		case 12:
			return listTirage.get(rowIndex).getWinBoulesASC() + "  ";
		case 13:
			return listTirage.get(rowIndex).getWinStarASC() + "  ";
		case 14:
			return listTirage.get(rowIndex).getWinRang1FR() + "  ";
		case 15:
			return listTirage.get(rowIndex).getWinRang1EUR() + "  ";
		case 16:
			return listTirage.get(rowIndex).getRateRang1() + "  ";
		case 17:
			return listTirage.get(rowIndex).getWinRang2FR() + "  ";
		case 18:
			return listTirage.get(rowIndex).getWinRang2EUR() + "  ";
		case 19:
			return listTirage.get(rowIndex).getRateRang2() + "  ";
		case 20:
			return listTirage.get(rowIndex).getWinRang3FR() + "  ";
		case 21:
			return listTirage.get(rowIndex).getWinRang3EUR() + "  ";
		case 22:
			return listTirage.get(rowIndex).getRateRang3() + "  ";
		case 23:
			return listTirage.get(rowIndex).getWinRang4FR() + "  ";
		case 24:
			return listTirage.get(rowIndex).getWinRang4EUR() + "  ";
		case 25:
			return listTirage.get(rowIndex).getRateRang4() + "  ";
		case 26:
			return listTirage.get(rowIndex).getWinRang5FR() + "  ";
		case 27:
			return listTirage.get(rowIndex).getWinRang5EUR() + "  ";
		case 28:
			return listTirage.get(rowIndex).getRateRang5() + "  ";
		case 29:
			return listTirage.get(rowIndex).getWinRang6FR() + "  ";
		case 30:
			return listTirage.get(rowIndex).getWinRang6EUR() + "  ";
		case 31:
			return listTirage.get(rowIndex).getRateRang6() + "  ";
		case 32:
			return listTirage.get(rowIndex).getWinRang7FR() + "  ";
		case 33:
			return listTirage.get(rowIndex).getWinRang7EUR() + "  ";
		case 34:
			return listTirage.get(rowIndex).getRateRang7() + "  ";
		case 35:
			return listTirage.get(rowIndex).getWinRang8FR() + "  ";
		case 36:
			return listTirage.get(rowIndex).getWinRang8EUR() + "  ";
		case 37:
			return listTirage.get(rowIndex).getRateRang8() + "  ";
		case 38:
			return listTirage.get(rowIndex).getWinRang9FR() + "  ";
		case 39:
			return listTirage.get(rowIndex).getWinRang9EUR() + "  ";
		case 40:
			return listTirage.get(rowIndex).getRateRang9() + "  ";
		case 41:
			return listTirage.get(rowIndex).getWinRang10FR() + "  ";
		case 42:
			return listTirage.get(rowIndex).getWinRang10EUR() + "  ";
		case 43:
			return listTirage.get(rowIndex).getRateRang10() + "  ";
		case 44:
			return listTirage.get(rowIndex).getWinRang11FR() + "  ";
		case 45:
			return listTirage.get(rowIndex).getWinRang11EUR() + "  ";
		case 46:
			return listTirage.get(rowIndex).getRateRang11() + "  ";
		case 47:
			return listTirage.get(rowIndex).getWinRang12FR() + "  ";
		case 48:
			return listTirage.get(rowIndex).getWinRang12EUR() + "  ";
		case 49:
			return listTirage.get(rowIndex).getRateRang12() + "  ";
		case 50:
			return listTirage.get(rowIndex).getWinRang13FR() + "  ";
		case 51:
			return listTirage.get(rowIndex).getWinRang13EUR() + "  ";
		case 52:
			return listTirage.get(rowIndex).getRateRang13() + "  ";
		case 53:
			return listTirage.get(rowIndex).getWinRang1Star() + "  ";
		case 54:
			return listTirage.get(rowIndex).getRateRang1Star() + "  ";
		case 55:
			return listTirage.get(rowIndex).getWinRang2Star() + "  ";
		case 56:
			return listTirage.get(rowIndex).getRateRang2Star() + "  ";
		case 57:
			return listTirage.get(rowIndex).getWinRang3Star() + "  ";
		case 58:
			return listTirage.get(rowIndex).getRateRang3Star() + "  ";
		case 59:
			return listTirage.get(rowIndex).getWinRang4Star() + "  ";
		case 60:
			return listTirage.get(rowIndex).getRateRang4Star() + "  ";
		case 61:
			return listTirage.get(rowIndex).getWinRang5Star() + "  ";
		case 62:
			return listTirage.get(rowIndex).getRateRang5Star() + "  ";
		case 63:
			return listTirage.get(rowIndex).getWinRang6Star() + "  ";
		case 64:
			return listTirage.get(rowIndex).getRateRang6Star() + "  ";
		case 65:
			return listTirage.get(rowIndex).getWinRang7Star() + "  ";
		case 66:
			return listTirage.get(rowIndex).getRateRang7Star() + "  ";
		case 67:
			return listTirage.get(rowIndex).getWinRang8Star() + "  ";
		case 68:
			return listTirage.get(rowIndex).getRateRang8Star() + "  ";
		case 69:
			return listTirage.get(rowIndex).getWinRang9Star() + "  ";
		case 70:
			return listTirage.get(rowIndex).getRateRang9Star() + "  ";
		case 71:
			return listTirage.get(rowIndex).getWinRang10Star() + "  ";
		case 72:
			return listTirage.get(rowIndex).getRateRang10Star() + "  ";
		case 73:
			return listTirage.get(rowIndex).getMyMillion();

		default:
			throw new IllegalArgumentException();
		}
	}

	// Vérification des types de variables
	public Class<?> getColumnClass(int columnIndex) {

		switch (columnIndex) {

		case 0:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 14:
		case 15:
		case 17:
		case 18:
		case 20:
		case 21:
		case 23:
		case 24:
		case 26:
		case 27:
		case 29:
		case 30:
		case 32:
		case 33:
		case 35:
		case 36:
		case 38:
		case 39:
		case 41:
		case 42:
		case 44:
		case 45:
		case 47:
		case 48:
		case 50:
		case 51:
		case 53:
		case 55:
		case 57:
		case 59:
		case 61:
		case 63:
		case 65:
		case 67:
		case 69:
		case 71:
			return Integer.class;
		case 16:
		case 19:
		case 22:
		case 25:
		case 28:
		case 31:
		case 34:
		case 37:
		case 40:
		case 43:
		case 46:
		case 49:
		case 52:
		case 54:
		case 56:
		case 58:
		case 60:
		case 62:
		case 64:
		case 66:
		case 68:
		case 70:
		case 72:
			return double.class;
		case 1:
		case 3:
		case 12:
		case 13:
		case 73:
			return String.class;
		case 2:
		case 4:
			return Date.class;

		default:
			throw new IllegalArgumentException();
		}
	}

	// Getteur et Setteur de listTirage pour pouvoir la réutiliser

	public ArrayList<Tirage> getListTirage() {
		return listTirage;
	}

	public void setListTirage(ArrayList<Tirage> listTirage) {
		this.listTirage = listTirage;
	}

}
