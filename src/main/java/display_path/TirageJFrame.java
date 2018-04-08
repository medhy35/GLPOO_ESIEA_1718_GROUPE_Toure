package display_path;

import java.util.ArrayList;

import javax.swing.*;

import library.Windows_save;
import treatement.Tirage;

public class TirageJFrame extends JFrame {
	
	/**
	 * @author	Gabrielle
	 * 
	 * Affichage d'un tableau complet et entier
	 * @param	Aucun
	 * @return	Aucun
	 */

	private static final long serialVersionUID = 1L;

	public TirageJFrame(int choix,ArrayList<Tirage> path) {
		
		//On cr�� la fen�tre avec la Menu Bar		
		JFrame window_path = Windows_save.Windows_save_version1();
		//On cr�e les panneaux
		JScrollPane scrollPane = new JScrollPane();
		//On cr�e le mod�le que l'on souhaite
		TirageModelComplet modele = new TirageModelComplet();
		TirageModelFirst modele_bis = new TirageModelFirst();
		TirageModelTri modele_tris = new TirageModelTri(path);
		//On cr�e le conteneur du mod�le
		JTable table = null;
		if(choix==1) {
			table = new JTable(modele);
		}
		if (choix==2) {
			table = new JTable(modele_bis);
		}
		if (choix==3) {
			table = new JTable(modele_tris);
		}
		

		//On lie le tableau au panneau
		scrollPane.setViewportView(table); // Le tableau est li� au panneau d�roulant
		
		//On rajoute les �l�ments � la fen�tre
		window_path.add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		for (int i=0; i<table.getColumnCount(); i++)
			table.getColumnModel().getColumn(i).setPreferredWidth(100);
		


	}
}
