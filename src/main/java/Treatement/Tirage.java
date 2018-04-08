package Treatement;

import java.util.Date;

/**
	 * @author	Gabrielle
	 * 
	 * Interface getters et setters
	 * @param	Aucun
	 * @return	Aucun
	 */
public interface Tirage {
	
	Integer getNbTirage(); 				// Numéro de tirage (unique)
	String getMyMillion(); 				// Numéro My_million	
	Date getDate(); 					// Date du tirage format jj/mm/aaaa et jour de la semaine
	// Les 5 boules tirées
	Integer getBoule1();
	Integer getBoule2();
	Integer getBoule3();
	Integer getBoule4();
	Integer getBoule5();
	// Les 2 étoiles tirées
	Integer getEtoile1();
	Integer getEtoile2();
	String getNbTirageCycle();			// Nombre de tirage dans le cycle
	Date getDateForclusion();			// Date de forclusion
	String getWinBoulesASC();			// Boules gagnantes par ordre croissant
	String getWinStarASC();				//Etoiles gagnantes par ordre croissant
	Integer getWinRang1FR();			//Nombre de gagnants du Rang1 en France
	Integer getWinRang1EUR();			//Nombre de gagnants du Rang1 en Europe 
	double getRateRang1();				// Rapport du Rang1
	Integer getWinRang2FR();			//Nombre de gagnants du Rang2 en France
	Integer getWinRang2EUR();			//Nombre de gagnants du Rang2 en Europe
	double getRateRang2();				// Rapport du Rang2
	Integer getWinRang3FR();			//Nombre de gagnants du Rang3 en France
	Integer getWinRang3EUR();			//Nombre de gagnants du Rang3 en Europe
	double getRateRang3();				// Rapport du Rang3
	Integer getWinRang4FR();			//Nombre de gagnants du Rang4 en France
	Integer getWinRang4EUR();			//Nombre de gagnants du Rang4 en Europe
	double getRateRang4();				// Rapport du Rang4
	Integer getWinRang5FR();			//Nombre de gagnants du Rang5 en France
	Integer getWinRang5EUR();			//Nombre de gagnants du Rang5 en Europe
	double getRateRang5();				// Rapport du Rang5
	Integer getWinRang6FR();			//Nombre de gagnants du Rang6 en France
	Integer getWinRang6EUR();			//Nombre de gagnants du Rang6 en Europe
	double getRateRang6();				// Rapport du Rang6
	Integer getWinRang7FR();			//Nombre de gagnants du Rang7 en France
	Integer getWinRang7EUR();			//Nombre de gagnants du Rang7 en Europe
	double getRateRang7();				// Rapport du Rang7
	Integer getWinRang8FR();			//Nombre de gagnants du Rang8 en France
	Integer getWinRang8EUR();			//Nombre de gagnants du Rang8 en Europe
	double getRateRang8();				// Rapport du Rang8
	Integer getWinRang9FR();			//Nombre de gagnants du Rang9 en France
	Integer getWinRang9EUR();			//Nombre de gagnants du Rang9 en Europe
	double getRateRang9();				// Rapport du Rang9
	Integer getWinRang10FR();			//Nombre de gagnants du Rang10 en France
	Integer getWinRang10EUR();			//Nombre de gagnants du Rang10 en Europe
	double getRateRang10();				// Rapport du Rang10
	Integer getWinRang11FR();			//Nombre de gagnants du Rang11 en France
	Integer getWinRang11EUR();			//Nombre de gagnants du Rang11 en Europe
	double getRateRang11();				// Rapport du Rang11
	Integer getWinRang12FR();			//Nombre de gagnants du Rang12 en France
	Integer getWinRang12EUR();			//Nombre de gagnants du Rang12 en Europe
	double getRateRang12();				// Rapport du Rang12
	Integer getWinRang13FR();			//Nombre de gagnants du Rang13 en France
	Integer getWinRang13EUR();			//Nombre de gagnants du Rang13 en Europe
	double getRateRang13();				// Rapport du Rang13
	Integer getWinRang1Star();			//Nombre de gagnants du Rang1 Etoile+ 
	double getRateRang1Star();			// Rapport du Rang1 Etoile+
	Integer getWinRang2Star();			//Nombre de gagnants du Rang2 Etoile+ 
	double getRateRang2Star();			// Rapport du Rang2 Etoile+
	Integer getWinRang3Star();			//Nombre de gagnants du Rang3 Etoile+ 
	double getRateRang3Star();			// Rapport du Rang3 Etoile+
	Integer getWinRang4Star();			//Nombre de gagnants du Rang4 Etoile+ 
	double getRateRang4Star();			// Rapport du Rang4 Etoile+
	Integer getWinRang5Star();			//Nombre de gagnants du Rang5 Etoile+ 
	double getRateRang5Star();			// Rapport du Rang5 Etoile+
	Integer getWinRang6Star();			//Nombre de gagnants du Rang6 Etoile+
	double getRateRang6Star();			// Rapport du Rang6 Etoile+
	Integer getWinRang7Star();			//Nombre de gagnants du Rang7 Etoile+
	double getRateRang7Star();			// Rapport du Rang7 Etoile+
	Integer getWinRang8Star();			//Nombre de gagnants du Rang8 Etoile+
	double getRateRang8Star();			// Rapport du Rang8 Etoile+
	Integer getWinRang9Star();			//Nombre de gagnants du Rang9 Etoile+
	double getRateRang9Star();			// Rapport du Rang9 Etoile+
	Integer getWinRang10Star();			//Nombre de gagnants du Rang10 Etoile+
	double getRateRang10Star();			// Rapport du Rang10 Etoile+
	String[] getTirageEuroMillions();	// Numéro tirage exceptionnel Euromillions
	
}