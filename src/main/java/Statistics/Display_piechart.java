package Statistics;

import java.util.ArrayList;
import org.jfree.chart.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.data.general.*;
import org.jfree.util.*;
import Treatement.Tirage;

public class Display_piechart {
	
	private static final PieSectionLabelGenerator PieSelectionLabelGenerator = null;

	/**
	 * @author 	Ifuja
	 * 
	 * Affichage d'une pie chart quelconque
	 * @param	Base de donées type PieDataset et un titre type String
	 * @return 	PieChart type JFreeChart
	 */

	public static JFreeChart display_chart(ArrayList<Tirage> path,final int value, final String title){
		//Sélection de la bonne base
		PieDataset dataset=null;
		switch(value) {
			case 1 : 
				dataset =Data_piechart.result_round(path); 
				break;
			case 2 : 
				dataset =Data_piechart.result_star(path); 
				break;
			case 3 : 
				dataset =Data_piechart.result_winner_france_round(path); 
				break;
			case 4 : 
				dataset =Data_piechart.result_winner_europe_round(path); 
				break;
			case 5 : 
				dataset = Data_piechart.result_winner_france_star(path);
			default:
				break;
		}
		
		/*Choix du type de représentation et ses paramètres : 
				titre,données,légende,infosbulles,urls			*/
		JFreeChart chart = ChartFactory.createPieChart3D(title,dataset,true,true,false);
		
		//Caractéristiques du Pie Chart en 3D
		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(100); 													// Modification des angles du Pie Chart
		plot.setDirection(Rotation.CLOCKWISE); 
		plot.setForegroundAlpha(0.5f); 												//Remplissage des portions du Pie Chart (vide ou plein)
		plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}={2}"));	//Affichage des données du Pie Chart en pourcentage
		plot.setLabelGenerator(PieSelectionLabelGenerator);
		return(chart);
	}
 
}