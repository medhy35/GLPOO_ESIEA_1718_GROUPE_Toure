package research;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Iterator;
import treatement.Tirage;


public class Sorting {

	/**
	 * @author	Ulrich
	 * 
	 * Recherches en fonction des paramètres
	 * 
	 * @param	Variables de l'interface et tableau csv traité
	 * @return	Retourne les lignes correspondantes dans un tableau
	 */
	
	private static Tirage tir;
	
	//Tri selon le numéro de tirage
	public static ArrayList<Tirage> sorting_number(ArrayList<Tirage> arrayList, int num) {
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		Iterator<Tirage> ite = arrayList.iterator();

		while (ite.hasNext()) {
			tir = ite.next();
			if (tir.getNbTirage() == num) {
				result_liste_tir.add(tir);
			}
			
		}
		result_liste_tir.trimToSize();
		return result_liste_tir;
	}
	
	//Tri selon le numéro My_million
	public static ArrayList<Tirage> sorting_number_mymillion(ArrayList<Tirage> path, String num) {
		//On utilise la méthode itérator
		Iterator<Tirage> iterator = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		//On parcours notre liste et on ajoute la ligne correspondante à notre variable
		while (iterator.hasNext()) {
			Tirage tri = iterator.next();
			if (tri.getMyMillion().equalsIgnoreCase(num)) {
				result_liste_tir.add(tri);
			}
		}
		result_liste_tir.trimToSize();
		return result_liste_tir;
		}
	
	//Tri selon le nombre de gagnant sur tout les rangs
	public static ArrayList<Tirage> sorting_number_winner(ArrayList<Tirage> path, float num,String checkbox) {
		//On utilise la méthode itérator
		Iterator<Tirage> iterator = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		//On parcours notre liste et on ajoute la ligne correspondante à notre variable
		while (iterator.hasNext()) {
			Tirage tri = iterator.next();
			if (checkbox.equalsIgnoreCase("Boule")||checkbox.equalsIgnoreCase("Inconnu")) {
				if (tri.getWinRang1FR()==num||tri.getWinRang2FR()==num||tri.getWinRang3FR()==num||tri.getWinRang4FR()==num||tri.getWinRang5FR()==num||
					tri.getWinRang6FR()==num||tri.getWinRang7FR()==num||tri.getWinRang8FR()==num||tri.getWinRang9FR()==num||tri.getWinRang10FR()==num||
					tri.getWinRang11FR()==num||tri.getWinRang12FR()==num||tri.getWinRang13FR()==num||tri.getWinRang1EUR()==num||tri.getWinRang2EUR()==num||
					tri.getWinRang3EUR()==num||tri.getWinRang4EUR()==num||tri.getWinRang5EUR()==num||tri.getWinRang6EUR()==num||tri.getWinRang7EUR()==num||
					tri.getWinRang8EUR()==num||tri.getWinRang9EUR()==num||tri.getWinRang10EUR()==num||tri.getWinRang11EUR()==num||tri.getWinRang12EUR()==num||
					tri.getWinRang1EUR()==num) {
						result_liste_tir.add(tri);
				}
			if (checkbox.equalsIgnoreCase("Etoile")||checkbox.equalsIgnoreCase("Inconnu")) {
				if(tri.getWinRang1Star()==num||tri.getWinRang2Star()==num||tri.getWinRang3Star()==num||tri.getWinRang4Star()==num||tri.getWinRang5Star()==num
				||tri.getWinRang6Star()==num||tri.getWinRang7Star()==num||tri.getWinRang8Star()==num||tri.getWinRang9Star()==num||tri.getWinRang10Star()==num) {
					result_liste_tir.add(tri);
				}
			}
			}
			
		}
		result_liste_tir.trimToSize();
		return result_liste_tir;
		}
	
	//Tri selon le jour
	public static ArrayList<Tirage> sorting_day(ArrayList<Tirage> path, String day) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEE");
		Iterator <Tirage> ite = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		Tirage tri = null;
		while(ite.hasNext()){
			tri = ite.next();
			if(dateFormat.format(tri.getDate()).equalsIgnoreCase(day)) {
				result_liste_tir.add(tri);
				}
			}
			result_liste_tir.trimToSize();
			return result_liste_tir;
	}
	
	//Tri selon le numéro du jour
		public static ArrayList<Tirage> sorting_number_day(ArrayList<Tirage> path, String number_day) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
			Iterator <Tirage> ite = path.iterator();
			ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
			Tirage tri = null;
			while(ite.hasNext()){
				tri = ite.next();
				if(dateFormat.format(tri.getDate()).equalsIgnoreCase(number_day)) {
					result_liste_tir.add(tri);
					}
				}
				result_liste_tir.trimToSize();
				return result_liste_tir;
			}
	
	//Tri selon le mois
	public static ArrayList<Tirage> sorting_month(ArrayList<Tirage> path, String month) {
		SimpleDateFormat  dateFormat= new SimpleDateFormat("MMMMMMMMM");
		Iterator <Tirage> ite = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		Tirage tri = null;
		while(ite.hasNext()){
			tri = ite.next();
			if(dateFormat.format(tri.getDate()).equalsIgnoreCase(month)) {
				result_liste_tir.add(tri);
			}
			 	
		}
		result_liste_tir.trimToSize();
		return result_liste_tir;
	}
	
	//Tri selon l'année
		public static ArrayList<Tirage> sorting_year(ArrayList<Tirage> path, String year) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
			Iterator <Tirage> ite = path.iterator();
			ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
			Tirage tri = null;
			while(ite.hasNext()){
				tri = ite.next();
				if(dateFormat.format(tri.getDate()).equals(year)) {
					result_liste_tir.add(tri);
				}
				 	
			}
			result_liste_tir.trimToSize();
			return result_liste_tir;
		}
	
	//Tri selon le numéro de la boule
	public static ArrayList <Tirage> tri_number_round(ArrayList<Tirage> path ,String choice, int number ){
		Iterator<Tirage> ite = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		while (ite.hasNext()) {
			Tirage tri = ite.next();
			if(choice.equalsIgnoreCase("Boule 1")) {
				if(tri.getBoule1()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Boule 2")) {
				if(tri.getBoule2()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Boule 3")) {
				if(tri.getBoule3()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Boule 4")) {
				if(tri.getBoule4()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Boule 5")) {
				if(tri.getBoule5()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Toutes")) {
				if(tri.getBoule1()==number||tri.getBoule2()==number||tri.getBoule3()==number||tri.getBoule4()==number||tri.getBoule5()==number) {
					result_liste_tir.add(tri);
				}
			}
			
		}
		result_liste_tir.trimToSize();
		return result_liste_tir; 
	}

	public static ArrayList <Tirage> tri_number_star(ArrayList<Tirage> path ,String choice, int number){
		Iterator<Tirage> ite = path.iterator();
		ArrayList<Tirage> result_liste_tir = new ArrayList<Tirage>();
		while (ite.hasNext()) {
			Tirage tri = ite.next();
			if(choice.equalsIgnoreCase("Etoile 1")) {
				if(tri.getEtoile1()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Etoile 2")) {
				if(tri.getEtoile2()== number) {
					result_liste_tir.add(tri);
				}
			}
			if(choice.equalsIgnoreCase("Toutes")) {
				if(tri.getEtoile1()==number||tri.getEtoile2()==number) {
					result_liste_tir.add(tri);
				}
			}
			
		}
		result_liste_tir.trimToSize();
		return result_liste_tir; 
			}

	
	}

