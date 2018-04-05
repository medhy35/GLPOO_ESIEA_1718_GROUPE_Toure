package display;


import java.util.*;

import javax.swing.JPanel;

import library.*;
import treatement.Simple_tirage;
import java.awt.*;

public class Picture extends JPanel {
	
	/**
	 * @author	Jacques-Olivier
	 * 
	 * Création d'une IHM permettant le choix entre statistiques et recherches
	 * 
	 * @param	string args
	 * @return	Ne retourne rien (méthode void)	
	 */

	private static final long serialVersionUID = 1L;

	private Picture(Graphics graph, ArrayList<Simple_tirage> path){
		//On crée une fenêtre
		@SuppressWarnings("unused")
		Windows window_picture = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
		Panels main_panel= new Panels(500,500,"white");
				//On parcours chaque ligne du tableau
		for (int i=0;i<path.toArray().length;i++) {
			//On dessine la forme
			choice_form(main_panel,path.get(i),graph);
		}
	}
	
	//Permet de choisir la forme que l'on souhaite
	private static void choice_form(JPanel main_panel,Simple_tirage simple_tirage, Graphics graph){
		if(simple_tirage.getEtoile2()==1 || simple_tirage.getEtoile2()==2){
			draw_round(main_panel,simple_tirage,graph);
		}
		if(simple_tirage.getEtoile2()==3 || simple_tirage.getEtoile2()==4){
			draw_hourglass(main_panel,simple_tirage,graph);
		}
		if(simple_tirage.getEtoile2()==5 || simple_tirage.getEtoile2()==6){
			draw_square(main_panel,simple_tirage,graph);
		}
		if(simple_tirage.getEtoile2()==7 ||simple_tirage.getEtoile2()==8 ||simple_tirage.getEtoile2()==9){
			draw_triangle(main_panel,simple_tirage,graph);
		}
		if(simple_tirage.getEtoile2()==10 ||simple_tirage.getEtoile2()==11 ||simple_tirage.getEtoile2()==12){
			draw_octogone(main_panel,simple_tirage,graph);
		}
	}
	
	private static Object draw_round(JPanel window,Simple_tirage simple_tirage,Graphics graph) {
		graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); 
		graph.fillOval(simple_tirage.getBoule4()*10,simple_tirage.getBoule5()*10,simple_tirage.getEtoile1()*41,simple_tirage.getEtoile1()*41);
		return null;
	}
	
	private static Object draw_octogone(JPanel main_panel,Simple_tirage simple_tirage,Graphics graph) {
		int boule4 = simple_tirage.getBoule4()*5;
		int boule5 = simple_tirage.getBoule5()*5;
		int etoile1 = simple_tirage.getEtoile1()*41;
		int etoile2 = simple_tirage.getEtoile2()*41;
		int[] x = {boule4,boule5,etoile1,etoile2,etoile2,etoile1,boule5,boule4};
		int[] y = {boule5,boule4,boule4,boule5,etoile1,etoile2,etoile2,etoile1};
		graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
		graph.fillPolygon(x,y,8);
		return null;
	}
	
	private static Object draw_hourglass(JPanel main_panel,Simple_tirage simple_tirage,Graphics graph) {
		int boule4 = simple_tirage.getBoule4()*5;
		int boule5 = simple_tirage.getBoule5()*5;
		int etoile1 = simple_tirage.getEtoile1()*41;
		int[] x = {boule4,boule4,boule5,boule5,boule4};
		int[] y = {boule5,etoile1,boule5,etoile1,boule5};
		graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
		graph.fillPolygon(x,y,5);
		return null;
	}
	
	private static Object draw_square(JPanel main_panel,Simple_tirage simple_tirage,Graphics graph) {
		graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
		graph.fillRect(simple_tirage.getBoule4()*10,simple_tirage.getBoule5()*10,simple_tirage.getEtoile1()*41,simple_tirage.getEtoile1()*41);
		return null;
	}
	
	private static Object draw_triangle(JPanel main_panel,Simple_tirage simple_tirage,Graphics graph) {
		int boule4 = simple_tirage.getBoule4()*5;
		int boule5 = simple_tirage.getBoule5()*5;
		int etoile1 = simple_tirage.getEtoile1()*41;
		int[] x = {boule4,boule5,etoile1};
		int[] y = {boule4,boule5,boule5};
		graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
		graph.fillPolygon(x,y,5);
		return null;
	}
	
}


		
