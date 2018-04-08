package statistics;

import java.util.ArrayList;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import treatement.Tirage;


public class Data_piechart {


	public static PieDataset result_round(ArrayList<Tirage> path){
		//Initialisation de la base
		DefaultPieDataset dataset = new DefaultPieDataset();
		//Initialisation du nombre d'apparition
		int compteur = 0;
		//Parcours tous les numéros de boules possibles
		for(int i=1;i<51;i++) {
			//Parcours toutes les lignes du tableau
			for(int j=0;j<path.toArray().length;j++) {
				//Si l'élément apparaît on incrémente le compteur
				if(	path.get(j).getBoule1()==i||path.get(j).getBoule2()==i||
					path.get(j).getBoule3()==i||path.get(j).getBoule4()==i||
					path.get(j).getBoule5()==i){
					
					compteur = compteur + 1;
					
				}
			}
			//Rajout des informations à la base
			dataset.setValue("Boule "+i, compteur);
			//Remise à 0 du compteur
			compteur=0;
		}
		return(dataset);
	}
	
	public static PieDataset result_star(ArrayList<Tirage> path){
		//Initialisation de la base
		DefaultPieDataset dataset = new DefaultPieDataset();
		//Initialisation du nombre d'apparition
		int compteur = 0;
		//Parcours tous les numéros de boules possibles
		for(int i=1;i<13;i++) {
			//Parcours toutes les lignes du tableau
			for(int j=0;j<path.toArray().length;j++) {
				//Si l'élément apparaît on incrémente le compteur
				if(	path.get(j).getEtoile1()==i||path.get(j).getEtoile2()==i) {
					compteur = compteur + 1;
				}
			}
			//Rajout des informations à la base
			dataset.setValue("Etoile "+i, compteur);
			//Remise à 0 du compteur
			compteur=0;
		}
		return(dataset);
	}
	
	public static PieDataset result_winner_france_round(ArrayList<Tirage> path){
		DefaultPieDataset dataset = new DefaultPieDataset();
		int somme=0;
		for(int i=1;i<14;i++) {
			for(int j=0;j<path.toArray().length;j++) {
				switch(i) {
					case 1 : somme+=path.get(j).getWinRang1FR();
						break;
					case 2 : somme+=path.get(j).getWinRang2FR();
						break;
					case 3 : somme+=path.get(j).getWinRang3FR();
						break;
					case 4 : somme+=path.get(j).getWinRang4FR();
						break;
					case 5 : somme+=path.get(j).getWinRang5FR();
						break;
					case 6 : somme+=path.get(j).getWinRang6FR();
						break;
					case 7 : somme+=path.get(j).getWinRang7FR();
						break;
					case 8 : somme+=path.get(j).getWinRang8FR();
						break;
					case 9 : somme+=path.get(j).getWinRang9FR();
						break;
					case 10 : somme+=path.get(j).getWinRang10FR();
						break;
					case 11 : somme+=path.get(j).getWinRang11FR();
						break;
					case 12 : somme+=path.get(j).getWinRang12FR();
						break;
					case 13 :somme+=path.get(j).getWinRang13FR();
						break;
					default:break;
				}
			}
			dataset.setValue("Rang "+i, somme);
		}
		return(dataset);
	}
	
	public static PieDataset result_winner_europe_round(ArrayList<Tirage> path){
		DefaultPieDataset dataset = new DefaultPieDataset();
		int somme=0;
		for(int i=1;i<14;i++) {
			for(int j=0;j<path.toArray().length;j++) {
				switch(i) {
					case 1 : somme+=path.get(j).getWinRang1EUR();
						break;
					case 2 : somme+=path.get(j).getWinRang2EUR();
						break;
					case 3 : somme+=path.get(j).getWinRang3EUR();
						break;
					case 4 : somme+=path.get(j).getWinRang4EUR();
						break;
					case 5 : somme+=path.get(j).getWinRang5EUR();
						break;
					case 6 : somme+=path.get(j).getWinRang6EUR();
						break;
					case 7 : somme+=path.get(j).getWinRang7EUR();
						break;
					case 8 : somme+=path.get(j).getWinRang8EUR();
						break;
					case 9 : somme+=path.get(j).getWinRang9EUR();
						break;
					case 10 : somme+=path.get(j).getWinRang10EUR();
						break;
					case 11 : somme+=path.get(j).getWinRang11EUR();
						break;
					case 12 : somme+=path.get(j).getWinRang12EUR();
						break;
					case 13 :somme+=path.get(j).getWinRang13EUR();
						break;
					default:break;
				}
			}
			dataset.setValue("Rang "+i, somme);
		}
		return(dataset);
	}
	
	public static PieDataset result_winner_france_star(ArrayList<Tirage> path){
		DefaultPieDataset dataset = new DefaultPieDataset();
		int somme=0;
		for(int i=1;i<11;i++) {
			for(int j=0;j<path.toArray().length;j++) {
				switch(i) {
					case 1 : somme+=path.get(j).getWinRang1Star();
						break;
					case 2 : somme+=path.get(j).getWinRang2Star();
						break;
					case 3 : somme+=path.get(j).getWinRang3Star();
						break;
					case 4 : somme+=path.get(j).getWinRang4Star();
						break;
					case 5 : somme+=path.get(j).getWinRang5Star();
						break;
					case 6 : somme+=path.get(j).getWinRang6Star();
						break;
					case 7 : somme+=path.get(j).getWinRang7Star();
						break;
					case 8 : somme+=path.get(j).getWinRang8Star();
						break;
					case 9 : somme+=path.get(j).getWinRang9Star();
						break;
					case 10 : somme+=path.get(j).getWinRang10Star();
						break;
					default:break;
				}
			}
			dataset.setValue("Rang "+i, somme);
		}
		return(dataset);
	}
	
}
