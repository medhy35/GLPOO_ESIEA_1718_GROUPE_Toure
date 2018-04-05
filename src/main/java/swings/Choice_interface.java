package swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import library.*;
import treatement.Tirage;

public class Choice_interface {
	
	/**
	 * @author	Julie
	 * 
	 * Création d'une IHM permettant le choix entre statistiques et recherches
	 * 
	 * @param	string args
	 * @return	Ne retourne rien (méthode void)	
	 */

	public Choice_interface(final ArrayList<Tirage> path) {
		
		//Initialisation de la fenêtre
		final Windows window_choice = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
		
		//Initiatisation des panneaux
		Panels main_panel = new Panels(500,500,"blue");
		Panels research_draw = new Panels(10,25,"gold");
		Panels global_statistics = new Panels(10,25,"gold");
		Panels come_back = new Panels(10,25,"gold");
        
		//Initialisation des boutons
		JButton reserch_draw_button = Buttons.create_buttons("Rechercher un ou plusieurs tirage(s)");
		JButton global_statistics_button = Buttons.create_buttons("Statistiques générales");
		JButton come_back_button = Buttons.create_buttons("Retour");
		
		//Initialisation de l'image
		Pictures logo_bis2 = new Pictures();
        JLabel picture = logo_bis2.create_picture("src/main/resources/My_million_choice.jpg","blue");

        //Positionnement des éléments
        GroupLayout research_drawLayout =  Positionings.create_grouplayout_since_button(research_draw, "all", reserch_draw_button,0);
        research_draw.setLayout(research_drawLayout);
        
        GroupLayout global_statisticsLayout =  Positionings.create_grouplayout_since_button(global_statistics, "all_value",global_statistics_button,240);
        global_statistics.setLayout(global_statisticsLayout);

        GroupLayout come_backLayout =  Positionings.create_grouplayout_since_button(come_back, "short_all",come_back_button,0);
        come_back.setLayout(come_backLayout);

        GroupLayout main_panelLayout = new GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(main_panelLayout
        	.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addGroup(main_panelLayout.createSequentialGroup()
        	.addGroup(main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addGroup(main_panelLayout.createSequentialGroup().addGap(130, 130, 130)
        	.addGroup(main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
        	.addComponent(global_statistics, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        	.addComponent(research_draw, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        	.addComponent(come_back, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        	.addGroup(main_panelLayout.createSequentialGroup().addGap(95, 95, 95)
        	.addComponent(picture)))
        	.addContainerGap(109, Short.MAX_VALUE)));
        
        main_panelLayout.setVerticalGroup(
        main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addGroup(main_panelLayout.createSequentialGroup().addGap(76, 76, 76)
        	.addComponent(research_draw,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(55, 55, 55)
        	.addComponent(global_statistics, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(59, 59, 59)
        	.addComponent(come_back, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(53, 53, 53)
        	.addComponent(picture, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE).addGap(34, 34, 34)));
       
        GroupLayout window_choiceLayout = Positionings.create_grouplayout_since_panel (window_choice, "simple", main_panel);
        window_choice.setLayout(window_choiceLayout);

        //Interaction avec les boutons
        reserch_draw_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
            	window_choice.dispose();
            	new Research_interface(path);
            }});
        global_statistics_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
            	window_choice.dispose();
            	new Statistics(path);
            }});
        come_back_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
            	window_choice.dispose();
            	new Welcome_interface(path);
            }});
    	
       
	} 
}

