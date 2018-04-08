package library;

import java.awt.*;



import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import display_path.*;
import statistics.Display_piechart;
import swings.Choice_interface;
import treatement.Tirage;

	/**
	 * @author	Arnaud
	 * 
	 * Creation d'une fenetre d'enregistrement
	 * Classe de lancement de l'application
	 * @param	string args
	 * @return	Ne retourne rien (methode void)	
	 */


public class Windows_save {
	
    public static JFrame Windows_save_version1(){
    	
    	//Création de la fenêtre
        final JFrame window = new Windows("Team JIJI DRAUM : Eurodroo ",700,700);
        window.setResizable(true);
                        
        //Création des Items
        JMenuItem save = new JMenuItem("Enregistrer");
        JMenuItem close = new JMenuItem("Retour");
        
        //Création de la barre de menu et ajout à la fenêtre
        JMenuBar main_bar = Buttons.create_menubar(save,close);
        window.add(main_bar,BorderLayout.NORTH);
        window.setVisible(true);
        
        //Action des boutons 

        save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		final JFileChooser filechooser = new JFileChooser();
        		int val_retour = filechooser.showSaveDialog(window);
                if (val_retour == JFileChooser.APPROVE_OPTION) {
                	filechooser.getSelectedFile();
                	JOptionPane.showMessageDialog(window, "Votre fichier est bien enregistré", "ATTENTION",JOptionPane.WARNING_MESSAGE);
                }
        	}
        });
        close.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		window.dispose();
        	}
       }); 
       return(window);
    }

	protected static Component chartPanel;
    
    public static JFrame Windows_save_version2(final ArrayList<Tirage> path){
    	
    	//Création de la fenêtre
        final Windows window = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
        final Panels main_panel = new Panels(500,500,"blue");
        window.add(main_panel);
                
        //Création des Items
        JMenuItem save = new JMenuItem("Enregistrer");
        JMenuItem close = new JMenuItem("Retour");
        JMenuItem chart1 = new JMenuItem("Boules");
        JMenuItem chart2 = new JMenuItem("Etoiles");
        JMenuItem chart3 = new JMenuItem("Gagnants boules France");
        JMenuItem chart4 = new JMenuItem("Gagnats boules Europe");
        JMenuItem chart5 = new JMenuItem("Gagnants étoiles France");
        JMenuItem access_path = new JMenuItem("Tableau général");
        JMenuItem access_path2 = new JMenuItem("Tableau réduit");
        
        //Création de la barre de menu et ajout à la fenêtre
        final JMenuBar main_bar = Buttons.create_menubar_bis(save,close,chart1,chart2,chart3,chart4,chart5,access_path,access_path2);
        window.add(main_bar,BorderLayout.NORTH);
        window.setVisible(true);
        
        //Action des boutons 
        
        save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		final JFileChooser filechooser = new JFileChooser();
        		int val_retour = filechooser.showSaveDialog(window);
                if (val_retour == JFileChooser.APPROVE_OPTION) {
                	filechooser.getSelectedFile();
                	JOptionPane.showMessageDialog(window, "Votre fichier est bien enregistré", "ATTENTION",JOptionPane.WARNING_MESSAGE);
                }
        	}
		});
        close.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		window.dispose();
        		new Choice_interface(path);
        	}
        });
        chart1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFreeChart chart = Display_piechart.display_chart(path, 1, "Pourcentage d'apparition des boules");
        		chartPanel = new ChartPanel(chart);
        		chartPanel.setPreferredSize(new Dimension(500,500));
        		window.add(chartPanel,BorderLayout.SOUTH);
        		window.add(main_bar,BorderLayout.NORTH);
        		window.setVisible(true);
        	}
       });  
       chart2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFreeChart chart = Display_piechart.display_chart(path, 2, "Pourcentage d'apparition des étoiles");
        		chartPanel = new ChartPanel(chart);       		
        		chartPanel.setPreferredSize(new Dimension(500,500));
        		window.add(chartPanel,BorderLayout.SOUTH);
        		window.add(main_bar,BorderLayout.NORTH);
        		window.setVisible(true);
        	}
       });
       chart3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFreeChart chart = Display_piechart.display_chart(path, 3, "Pourcentage des gagnants français par rang");
        		ChartPanel chartPanel = new ChartPanel(chart);       		
        		chartPanel.setPreferredSize(new Dimension(500,500));
        		window.add(chartPanel,BorderLayout.SOUTH);
        		window.add(main_bar,BorderLayout.NORTH);
        		window.setVisible(true);
        	}
       });
       chart4.addActionListener(new ActionListener() {
       		public void actionPerformed(ActionEvent e) {
       			JFreeChart chart = Display_piechart.display_chart(path, 4, "Pourcentage des gagnants européens par rang");
       			ChartPanel chartPanel = new ChartPanel(chart);       		
       			chartPanel.setPreferredSize(new Dimension(500,500));
       			window.add(chartPanel,BorderLayout.SOUTH);
       			window.add(main_bar,BorderLayout.NORTH);
       			window.setVisible(true);
       	}
      });
      chart5.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JFreeChart chart = Display_piechart.display_chart(path, 5, "Pourcentage des gagnants français par rang");
          		ChartPanel chartPanel = new ChartPanel(chart);       		
          		chartPanel.setPreferredSize(new Dimension(500,500));
          		window.add(chartPanel,BorderLayout.SOUTH);
          		window.add(main_bar,BorderLayout.NORTH);
          		window.setVisible(true);
          	}
      });
      access_path.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		new TirageJFrame(1,path);
          	}
         });
      access_path2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new TirageJFrame(2,path);
        	}
       });
      return(window);
    }

}







