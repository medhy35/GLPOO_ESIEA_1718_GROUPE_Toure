/*
 * Author: Gabrielle
 * Modèle utilisant les valeurs récupéreées dans le fichier CSV
 * 
 */

package display_path;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;

import treatement.CsvTirageDao;
import treatement.Tirage;


public class TirageModelFirst extends AbstractTableModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3485841928763403781L;
	// Exemple de liste de tirage
	private CsvTirageDao csv;
	// Entête des colonnes
	private final String[] entete = { "N° tirage", "N° MyMillion", "Jour", "Date", "Boule 1", "Boule 2", "Boule 3",
			"Boule 4", "Boule 5", "Etoile 1", "Etoile 2" };
	// Tableau de tirages
	private ArrayList<Tirage> listTirage;
	// Définition du mode d'affichage des dates
	SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEE");

	// Appel d'une instance de la liste DAO et récupération de la liste
	public TirageModelFirst() {
		super();
		// dao = BidonTirageDao.getInstance();
		// listTirage = dao.findTiragesDao();
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
			return listTirage.get(rowIndex).getMyMillion();
		case 2:
			return dateFormat.format(listTirage.get(rowIndex).getDate());
		case 3:
			return listTirage.get(rowIndex).getDate();
		case 4:
			return listTirage.get(rowIndex).getBoule1() + "  ";
		case 5:
			return listTirage.get(rowIndex).getBoule2() + "  ";
		case 6:
			return listTirage.get(rowIndex).getBoule3() + "  ";
		case 7:
			return listTirage.get(rowIndex).getBoule4() + "  ";
		case 8:
			return listTirage.get(rowIndex).getBoule5() + "  ";
		case 9:
			return listTirage.get(rowIndex).getEtoile1() + "  ";
		case 10:
			return listTirage.get(rowIndex).getEtoile2() + "  ";

		default:
			throw new IllegalArgumentException();
		}
	}

	// Vérification des types de variables
	public Class<?> getColumnClass(int columnIndex) {

		switch (columnIndex) {

		case 0:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			return Integer.class;
		case 1:
		case 2:
			return String.class;
		case 3:
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
