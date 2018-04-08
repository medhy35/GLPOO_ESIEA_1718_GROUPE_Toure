package Research;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Treatement.Tirage;

public class Research {

	/**
	 * @author	Julie
	 * 
	 * Analyse des exceptions et lancements conditionels des traitements
	 * 
	 * @param	Variables de l'interface et tableau csv traité
	 * @return	Ne retourne rien / Lancement de Research	
	 */
	
	public Research(Integer draw_number,Integer my_million,Integer number_winners,
					String date_day,String date_year,String date_year_choice,
					Integer date_number_day,Integer rang_round,Integer star,
					String checkbox_result,String representation,ArrayList<Tirage> path) {
		
		//Si on n'a pas choisi de représentation,inutile de faire le traitement
		if (representation==null) {
			JOptionPane.showMessageDialog(null, "Vous n'avez pas précisé le type d'affichage", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		//Si on a aucun critère de recherche, inutile de faire le traitement
		if(		draw_number==0||my_million==0||number_winners==0||date_number_day==0||rang_round==0||star==0||
				date_day=="Inconnu"||date_year=="Inconnu"||date_year_choice=="Inconnu"||checkbox_result==null||representation==null) {
			JOptionPane.showMessageDialog(null, "Vous n'aves pas choisi de critères de recherche\nMettez au moins un critère", "Erreur", JOptionPane.ERROR_MESSAGE);
			
		}
		//On fait le traitement des données que si on a choisit une représentation
		if(representation=="Tableau"||representation=="Schéma(s)") {
			//while(path.toArray()==0) {
				
			//}
			ArrayList<Tirage> official_list = new  ArrayList<Tirage>();
			//On commence par le traitement
			if(draw_number!=0) {
				//Traitement par numéro de tirage
				official_list = Tri.tri_numero_tirage(path,draw_number);
			}
			path=official_list;
		}
		
		//On lance les affichages
		if (representation=="Tableau") {
			//Afficher le résultat du tri sous forme de tableau
		}
		if (representation=="Schéma(s)") {
			//Afficher le résultat du tri sous forme de Schéma(s)
			System.out.println("ERROR");
		}
	}
}