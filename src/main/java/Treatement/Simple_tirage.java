package Treatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Simple_tirage implements Tirage{
	
	/**
	 * @author	Gabrielle
	 * 
	 * Accès aux données
	 * @param	Aucun
	 * @return	Constructeur,getters,setters
	 */
	private Integer nbTirage,boule1,boule2,boule3,boule4,boule5,etoile1,etoile2;
	private String myMillion,date,nbTirageCycle,dateForclusion,winBoulesASC,winStarASC;
	private String[] tirageEuroMillions;
	
	//Déclaration variables boules
	private Integer winRang1FR,winRang2FR,winRang3FR,winRang4FR,winRang5FR,winRang6FR,winRang7FR,winRang8FR,winRang9FR,winRang10FR,winRang11FR,winRang12FR,winRang13FR;
	private Integer winRang1EUR,winRang2EUR,winRang3EUR,winRang4EUR,winRang5EUR,winRang6EUR,winRang7EUR,winRang8EUR,winRang9EUR,winRang10EUR,winRang11EUR,winRang12EUR,winRang13EUR;
	private double rateRang1,rateRang2,rateRang3,rateRang4,rateRang5,rateRang6,rateRang7,rateRang8,rateRang9,rateRang10,rateRang11,rateRang12,rateRang13;
	
	//Déclaration variables étoiles
	private Integer winRang1Star,winRang2Star,winRang3Star,winRang4Star,winRang5Star,winRang6Star,winRang7Star,winRang8Star,winRang9Star,winRang10Star;
	private double rateRang1Star,rateRang2Star,rateRang3Star,rateRang4Star,rateRang5Star,rateRang6Star,rateRang7Star,rateRang8Star,rateRang9Star,rateRang10Star;
	
	// Format d'entrée défini pour les dates
	private SimpleDateFormat dateFormatEntry = new SimpleDateFormat("dd/MM/yyyy");

	// Constructeur
	public Simple_tirage(Integer nbTirage, String myMillion, String date, Integer boule1, Integer boule2, Integer boule3,
			Integer boule4, Integer boule5, Integer etoile1, Integer etoile2) {
		this.nbTirage = nbTirage;
		this.myMillion = myMillion;
		this.date = date;
		this.boule1 = boule1;
		this.boule2 = boule2;
		this.boule3 = boule3;
		this.boule4 = boule4;
		this.boule5 = boule5;
		this.etoile1 = etoile1;
		this.etoile2 = etoile2;
	}

	public Simple_tirage() {
	}

	//Getters et Setters des attributs
	 
	public Integer getNbTirage() {
		return nbTirage;}

	public void setNbtirage(Integer nbTirage) {
		this.nbTirage = nbTirage;}

	public Date getDate() {
		// Réseau horaire
		dateFormatEntry.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		// Date
		Date newDate = new Date();
		try {
			newDate = dateFormatEntry.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate;}

	public void setDate(String date) {
		this.date = date;}

	public Integer getBoule1() {
		return boule1;}

	public void setBoule1(Integer boule1) {
		this.boule1 = boule1;}

	public Integer getBoule2() {
		return boule2;}

	public void setBoule2(Integer boule2) {
		this.boule2 = boule2;}

	public Integer getBoule3() {
		return boule3;}

	public void setBoule3(Integer boule3) {
		this.boule3 = boule3;}

	public Integer getBoule4() {
		return boule4;}

	public void setBoule4(Integer boule4) {
		this.boule4 = boule4;}

	public Integer getBoule5() {
		return boule5;}

	public void setBoule5(Integer boule5) {
		this.boule5 = boule5;}

	public Integer getEtoile1() {
		return etoile1;}

	public void setEtoile1(Integer etoile1) {
		this.etoile1 = etoile1;}

	public Integer getEtoile2() {
		return etoile2;}

	public void setEtoile2(Integer etoile2) {
		this.etoile2 = etoile2;}

	public String getMyMillion() {
		return myMillion;}

	public void setMyMillion(String myMillion) {
		this.myMillion = myMillion;}

	public String getNbTirageCycle() {
		return nbTirageCycle;}

	public void setNbTirageCycle(String nbTirageCycle) {
		this.nbTirageCycle = nbTirageCycle;}
	
	public Date getDateForclusion() {
		dateFormatEntry.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		Date newDate = new Date();
		try {
			newDate = dateFormatEntry.parse(dateForclusion);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate;}

	public void setDateForclusion(String dateForclusion) {
		this.dateForclusion = dateForclusion;}

	public String getWinBoulesASC() {
		return winBoulesASC;}

	public void setWinBoulesASC(String winBoulesASC) {
		this.winBoulesASC = winBoulesASC;}

	public String getWinStarASC() {
		return winStarASC;}

	public void setWinStarASC(String winStarASC) {
		this.winStarASC = winStarASC;}

	public Integer getWinRang1FR() {
		return winRang1FR;}

	public void setWinRang1FR(Integer winRang1FR) {
		this.winRang1FR = winRang1FR;
	}

	public Integer getWinRang1EUR() {
		return winRang1EUR;}

	public void setWinRang1EUR(Integer winRang1EUR) {
		this.winRang1EUR = winRang1EUR;}

	public double getRateRang1() {
		return rateRang1;}

	public void setRateRang1(double rateRang1) {
		this.rateRang1 = rateRang1;}

	public Integer getWinRang2FR() {
		return winRang2FR;}

	public void setWinRang2FR(Integer winRang2FR) {
		this.winRang2FR = winRang2FR;}

	public Integer getWinRang2EUR() {
		return winRang2EUR;}

	public void setWinRang2EUR(Integer winRang2EUR) {
		this.winRang2EUR = winRang2EUR;}

	public double getRateRang2() {
		return rateRang2;}

	public void setRateRang2(double rateRang2) {
		this.rateRang2 = rateRang2;}

	public Integer getWinRang3FR() {
		return winRang3FR;}

	public void setWinRang3FR(Integer winRang3FR) {
		this.winRang3FR = winRang3FR;}

	public Integer getWinRang3EUR() {
		return winRang3EUR;}

	public void setWinRang3EUR(Integer winRang3EUR) {
		this.winRang3EUR = winRang3EUR;}
	
	public double getRateRang3() {
		return rateRang3;}

	public void setRateRang3(double rateRang3) {
		this.rateRang3 = rateRang3;}

	public Integer getWinRang4FR() {
		return winRang4FR;}

	public void setWinRang4FR(Integer winRang4FR) {
		this.winRang4FR = winRang4FR;}

	public Integer getWinRang4EUR() {
		return winRang4EUR;}

	public void setWinRang4EUR(Integer winRang4EUR) {
		this.winRang4EUR = winRang4EUR;}

	public double getRateRang4() {
		return rateRang4;}

	public void setRateRang4(double rateRang4) {
		this.rateRang4 = rateRang4;}

	public Integer getWinRang5FR() {
		return winRang5FR;}

	public void setWinRang5FR(Integer winRang5FR) {
		this.winRang5FR = winRang5FR;}

	public Integer getWinRang5EUR() {
		return winRang5EUR;}

	public void setWinRang5EUR(Integer winRang5EUR) {
		this.winRang5EUR = winRang5EUR;
	}

	public double getRateRang5() {
		return rateRang5;}

	public void setRateRang5(double rateRang5) {
		this.rateRang5 = rateRang5;}

	public Integer getWinRang6FR() {
		return winRang6FR;}

	public void setWinRang6FR(Integer winRang6FR) {
		this.winRang6FR = winRang6FR;}

	public Integer getWinRang6EUR() {
		return winRang6EUR;}

	public void setWinRang6EUR(Integer winRang6EUR) {
		this.winRang6EUR = winRang6EUR;}

	public double getRateRang6() {
		return rateRang6;}

	public void setRateRang6(double rateRang6) {
		this.rateRang6 = rateRang6;}

	public Integer getWinRang7FR() {
		return winRang7FR;}

	public void setWinRang7FR(Integer winRang7FR) {
		this.winRang7FR = winRang7FR;}

	public Integer getWinRang7EUR() {
		return winRang7EUR;}

	public void setWinRang7EUR(Integer winRang7EUR) {
		this.winRang7EUR = winRang7EUR;}

	public double getRateRang7() {
		return rateRang7;}

	public void setRateRang7(double rateRang7) {
		this.rateRang7 = rateRang7;}

	public Integer getWinRang8FR() {
		return winRang8FR;}

	public void setWinRang8FR(Integer winRang8FR) {
		this.winRang8FR = winRang8FR;}

	public Integer getWinRang8EUR() {
		return winRang8EUR;}

	public void setWinRang8EUR(Integer winRang8EUR) {
		this.winRang8EUR = winRang8EUR;}

	public double getRateRang8() {
		return rateRang8;}

	public void setRateRang8(double rateRang8) {
		this.rateRang8 = rateRang8;}

	public Integer getWinRang9FR() {
		return winRang9FR;}

	public void setWinRang9FR(Integer winRang9FR) {
		this.winRang9FR = winRang9FR;}

	public Integer getWinRang9EUR() {
		return winRang9EUR;}

	public void setWinRang9EUR(Integer winRang9EUR) {
		this.winRang9EUR = winRang9EUR;}

	public double getRateRang9() {
		return rateRang9;}

	public void setRateRang9(double rateRang9) {
		this.rateRang9 = rateRang9;}

	public Integer getWinRang10FR() {
		return winRang10FR;}

	public void setWinRang10FR(Integer winRang10FR) {
		this.winRang10FR = winRang10FR;}

	public Integer getWinRang10EUR() {
		return winRang10EUR;}

	public void setWinRang10EUR(Integer winRang10EUR) {
		this.winRang10EUR = winRang10EUR;}

	public double getRateRang10() {
		return rateRang10;}

	public void setRateRang10(double rateRang10) {
		this.rateRang10 = rateRang10;}

	public Integer getWinRang11FR() {
		return winRang11FR;}

	public void setWinRang11FR(Integer winRang11FR) {
		this.winRang11FR = winRang11FR;}

	public Integer getWinRang11EUR() {
		return winRang11EUR;}

	public void setWinRang11EUR(Integer winRang11EUR) {
		this.winRang11EUR = winRang11EUR;}

	public double getRateRang11() {
		return rateRang11;}

	public void setRateRang11(double rateRang11) {
		this.rateRang11 = rateRang11;}

	public Integer getWinRang12FR() {
		return winRang12FR;}

	public void setWinRang12FR(Integer winRang12FR) {
		this.winRang12FR = winRang12FR;}

	public Integer getWinRang12EUR() {
		return winRang12EUR;}

	public void setWinRang12EUR(Integer winRang12EUR) {
		this.winRang12EUR = winRang12EUR;}

	public double getRateRang12() {
		return rateRang12;}

	public void setRateRang12(double rateRang12) {
		this.rateRang12 = rateRang12;}

	public Integer getWinRang13FR() {
		return winRang13FR;}

	public void setWinRang13FR(Integer winRang13FR) {
		this.winRang13FR = winRang13FR;}

	public Integer getWinRang13EUR() {
		return winRang13EUR;}

	public void setWinRang13EUR(Integer winRang13EUR) {
		this.winRang13EUR = winRang13EUR;}

	public double getRateRang13() {
		return rateRang13;}

	public void setRateRang13(double rateRang13) {
		this.rateRang13 = rateRang13;}

	public Integer getWinRang1Star() {
		return winRang1Star;}

	public void setWinRang1Star(Integer winRang1Star) {
		this.winRang1Star = winRang1Star;}

	public double getRateRang1Star() {
		return rateRang1Star;}

	public void setRateRang1Star(double rateRang1Star) {
		this.rateRang1Star = rateRang1Star;}
	
	public Integer getWinRang2Star() {
		return winRang2Star;}

	public void setWinRang2Star(Integer winRang2Star) {
		this.winRang2Star = winRang2Star;}

	public double getRateRang2Star() {
		return rateRang2Star;}

	public void setRateRang2Star(double rateRang2Star) {
		this.rateRang2Star = rateRang2Star;}

	public Integer getWinRang3Star() {
		return winRang3Star;}

	public void setWinRang3Star(Integer winRang3Star) {
		this.winRang3Star = winRang3Star;}

	public double getRateRang3Star() {
		return rateRang3Star;}

	public void setRateRang3Star(double rateRang3Star) {
		this.rateRang3Star = rateRang3Star;}

	public Integer getWinRang4Star() {
		return winRang4Star;}

	public void setWinRang4Star(Integer winRang4Star) {
		this.winRang4Star = winRang4Star;}

	public double getRateRang4Star() {
		return rateRang4Star;}

	public void setRateRang4Star(double rateRang4Star) {
		this.rateRang4Star = rateRang4Star;}

	public Integer getWinRang5Star() {
		return winRang5Star;}

	public void setWinRang5Star(Integer winRang5Star) {
		this.winRang5Star = winRang5Star;}

	public double getRateRang5Star() {
		return rateRang5Star;}

	public void setRateRang5Star(double rateRang5Star) {
		this.rateRang5Star = rateRang5Star;}

	public Integer getWinRang6Star() {
		return winRang6Star;}

	public void setWinRang6Star(Integer winRang6Star) {
		this.winRang6Star = winRang6Star;}

	public double getRateRang6Star() {
		return rateRang6Star;}

	public void setRateRang6Star(double rateRang6Star) {
		this.rateRang6Star = rateRang6Star;}

	public Integer getWinRang7Star() {
		return winRang7Star;}

	public void setWinRang7Star(Integer winRang7Star) {
		this.winRang7Star = winRang7Star;}

	public double getRateRang7Star() {
		return rateRang7Star;}

	public void setRateRang7Star(double rateRang7Star) {
		this.rateRang7Star = rateRang7Star;}

	public Integer getWinRang8Star() {
		return winRang8Star;}

	public void setWinRang8Star(Integer winRang8Star) {
		this.winRang8Star = winRang8Star;}

	public double getRateRang8Star() {
		return rateRang8Star;}

	public void setRateRang8Star(double rateRang8Star) {
		this.rateRang8Star = rateRang8Star;}

	public Integer getWinRang9Star() {
		return winRang9Star;}

	public void setWinRang9Star(Integer winRang9Star) {
		this.winRang9Star = winRang9Star;}

	public double getRateRang9Star() {
		return rateRang9Star;}

	public void setRateRang9Star(double rateRang9Star) {
		this.rateRang9Star = rateRang9Star;}

	public Integer getWinRang10Star() {
		return winRang10Star;}

	public void setWinRang10Star(Integer winRang10Star) {
		this.winRang10Star = winRang10Star;}

	public double getRateRang10Star() {
		return rateRang10Star;}

	public void setRateRang10Star(double rateRang10Star) {
		this.rateRang10Star = rateRang10Star;}

	public String[] getTirageEuroMillions() {
		return tirageEuroMillions;}

	public void setTirageEuroMillions(String[] tirageEuroMillions) {
		this.tirageEuroMillions = tirageEuroMillions;}

	// Méthode d'affichage dans la console
	@Override
	public String toString() {
		return "SimpleTirage [nbTirage=" + nbTirage + ", myMillion=" + myMillion + ", date=" + date + ", boule1="
				+ boule1 + ", boule2=" + boule2 + ", boule3=" + boule3 + ", boule4=" + boule4 + ", boule5=" + boule5
				+ ", etoile1=" + etoile1 + ", etoile2=" + etoile2 + "]";
	}

}