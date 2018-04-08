package research;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import display.Art;
import display.Pictur;

import display_path.TirageJFrame;
import treatement.Tirage;

public class Research {

	private static boolean False;
	
	/**
	 * @author	Julie
	 * 
	 * Analyse des exceptions et lancements conditionels des traitements
	 * 
	 * @param	Variables de l'interface et tableau csv traité
	 * @return	Ne retourne rien / Lancement des recherches	
	 */
	
	static ArrayList<Tirage> path_sorting = new ArrayList<Tirage>();
	
	public static void research_result(int draw_number,String my_million,int number_winners,
					String date_day,String date_month,String date_year_choice,
					String date_number_day,int rang_round,int star,
					String checkbox_result,String representation,ArrayList<Tirage> path) {
		
		//Si on n'a pas choisi de représentation,inutile de faire le traitement
		if (representation==null) {
			JOptionPane.showMessageDialog(null, "Vous n'avez pas précisé le type d'affichage", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		//Si on a aucun critère de recherche, inutile de faire le traitement
		if(		draw_number==0 && my_million.equalsIgnoreCase("0")&& number_winners==00 && date_number_day.equalsIgnoreCase("0") && rang_round==0 && star==0 &&
				date_day.equalsIgnoreCase("Inconnu") && date_month.equalsIgnoreCase("Inconnu") && date_year_choice.equals("Inconnue")&& checkbox_result==null && representation==null) {
			JOptionPane.showMessageDialog(null, "Vous n'aves pas choisi de critères de recherche\nMettez au moins un critère", "Erreur", JOptionPane.ERROR_MESSAGE);
			
		}
		
		//On fait le traitement des données que si on a choisit une représentation
		if(representation=="Tableau"||representation=="Schéma(s)") {
			//On crée une variable intermédiaire
			if(path!=null) {
				if(		draw_number==0 && my_million.equalsIgnoreCase("0")&& number_winners==00 && date_number_day.equalsIgnoreCase("0") && rang_round==0 && star==0 &&
						date_day.equalsIgnoreCase("Inconnu") && date_month.equalsIgnoreCase("Inconnu") && date_year_choice.equals("Inconnue")) {
					JOptionPane.showMessageDialog(null, "Vous n'aves pas choisi de critères de recherche\nMettez au moins un critère", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				else {
				
				//On commence par le traitement
				if(draw_number!=0) {
					//Traitement par numéro de tirage
					path=Sorting.sorting_number(path,draw_number);
					path_sorting=path;
				}
				if(my_million.equalsIgnoreCase("0")==False) {
					//Traitement par numéro my_million
					path = Sorting.sorting_number_mymillion(path,my_million);
					path_sorting=path;
				}
				if(number_winners!=0) {
					//Tri par nombre de gagnant pour tous les rangs des boules, étoiles ou les 2 si inconnu
					path=Sorting.sorting_number_winner(path,number_winners,checkbox_result);
					path_sorting=path;
				}
				if(date_day.equalsIgnoreCase("Inconnu")==False) {
					path=Sorting.sorting_day(path,date_day);
					path_sorting=path;
				}
				if(date_number_day.equalsIgnoreCase("0")==False){
					path=Sorting.sorting_number_day(path, date_number_day);
					path_sorting=path;
				}
				if(date_month.equalsIgnoreCase("Inconnu")==False) {
					path=Sorting.sorting_month(path, date_month);
					path_sorting=path;
				}
				if(date_year_choice.equalsIgnoreCase("Inconnue")==False) {
					path=Sorting.sorting_year(path,date_year_choice);
					path_sorting=path;
				}
				if(rang_round!=0) {
					String choice=JOptionPane.showInputDialog(null, "Choisir entre :\nBoule 1,\nBoule 2,\nBoule 3,\nBoule 4 ,\nBoule 5,\nToutes", "Choix de la boule", JOptionPane.QUESTION_MESSAGE);
					path=Sorting.tri_number_round(path,choice,rang_round);
					path_sorting=path;
				}
				if(star!=0) {
					String choice=JOptionPane.showInputDialog(null, "Choisir entre :\nEtoile 1,\nEtoile 2,\nToutes", "Choix de la boule", JOptionPane.QUESTION_MESSAGE);
					path=Sorting.tri_number_star(path,choice,star);
					path_sorting=path;
				}
				
			if(path.size()==0){
				JOptionPane.showMessageDialog(null, "Il n'y a pas de résultat ", "Résultat de la recherche", JOptionPane.WARNING_MESSAGE);
			}
			//On lance les affichages
		if (representation=="Tableau"&&path.size()!=0) {
			new TirageJFrame(3,path);
		}
		if (representation=="Schéma(s)"&&path.size()!=0) {
			if (path.size()==1) {
				new Art();
			}
			else {
				
			}
		}
	}
	}
		}
	}
	public static ArrayList<Tirage> getPath() {
		return path_sorting;
	}
}
