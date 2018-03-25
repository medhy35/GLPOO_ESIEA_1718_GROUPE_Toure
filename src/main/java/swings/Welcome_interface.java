package swings;

import javax.swing.*;
import java.awt.event.*;
import library.*;

public class Welcome_interface {
	
	/**
	 * @author	Julie
	 * 
	 * Création d'une IHM d'accueil
	 * @param	string args
	 * @return	Ne retourne rien (méthode void)	
	 */
	
	public  Welcome_interface() {
		
		//Initialisation de la fenêtre
		final Windows window_welcome = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
		
		//Initialisation des panneaux
		Panels main_panel = new Panels(500,500,"blue");
		Panels app_panel = new Panels(10,25,"gold");
		Panels exit_panel = new Panels(10,25,"gold");
		
		//Initialisation des textes
        JLabel title = Labels.create_label("EURODROO", "Engravers MT", 36, "blue", "gold");
        JLabel subtitle = Labels.create_label("L'application de l'EUROMILLION","Engravers MT", 10, "blue", "red");
        
        //Initialisation des boutons 
        JButton exit = Buttons.create_buttons("Quitter");    
        JButton app = Buttons.create_buttons("Accéder à l'application");
        
		//Initialisation des images
        Pictures logo_bis = new Pictures();
        JLabel logo = logo_bis.create_picture("src/main/resources/Accueil.png","blue");
       
        //Positionnement des éléments
        GroupLayout app_panelLayout =  Positionings.create_grouplayout_since_button(app_panel, "all", app,0);
        app_panel.setLayout(app_panelLayout);
        
        GroupLayout exit_panelLayout = Positionings.create_grouplayout_since_button(exit_panel, "short_all", exit,0);
        exit_panel.setLayout(exit_panelLayout);

        //Positionnement général
        GroupLayout panneau_principalLayout = new GroupLayout(main_panel);
        main_panel.setLayout(panneau_principalLayout);
        panneau_principalLayout.setHorizontalGroup(panneau_principalLayout
        		.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(panneau_principalLayout.createSequentialGroup()
        		.addGroup(panneau_principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(panneau_principalLayout.createSequentialGroup()
        		.addContainerGap()
        		.addComponent(title, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(panneau_principalLayout.createSequentialGroup()
        		.addGap(109, 109, 109)
        		.addComponent(subtitle, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
        		.addGap(0, 94, Short.MAX_VALUE)))
        		.addContainerGap())
        		.addGroup(GroupLayout.Alignment.TRAILING, panneau_principalLayout.createSequentialGroup()
        		.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(panneau_principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(GroupLayout.Alignment.TRAILING, panneau_principalLayout.createSequentialGroup()
        		.addGroup(panneau_principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
        		.addComponent(app_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addComponent(exit_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGap(176, 176, 176))
        		.addGroup(GroupLayout.Alignment.TRAILING, panneau_principalLayout.createSequentialGroup()
        		.addComponent(logo)
        		.addGap(151, 151, 151)))));
        
        panneau_principalLayout.setVerticalGroup(
        panneau_principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(panneau_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(app_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logo, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE)));

        GroupLayout window_welcomeLayout = Positionings.create_grouplayout_since_panel (window_welcome, "simple", main_panel);
        window_welcome.setLayout(window_welcomeLayout);
	
	//Interaction boutons 
	exit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
        	window_welcome.dispose();
        }});
	
	app.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
        	window_welcome.dispose();
        	new Choice_interface();
        }});
	
	}
}
