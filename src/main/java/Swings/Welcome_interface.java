package Swings;

import javax.swing.*;

public class Welcome_interface {
	
	/**
	 * @author	Julie
	 * 
	 * Création d'une IHM
	 * Classe de lancement de l'application
	 * @param	string args
	 * @return	Ne retourne rien (méthode void)	
	 */
	
	public static void main(String[] args) {
		
		//Initialisation de la fenêtre
		final Windows window_welcome = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
		
		//Initialisation des panneaux
		Panels main_panel = new Panels(500,500,"blue");
		Panels app_panel = new Panels(10,25,"gold");
		Panels exit_panel = new Panels(10,25,"gold");
		
		//Initialisation des textes
        Labels title = new Labels("EURODROO", "Engravers MT", 36, "blue", "gold");
        Labels subtitle = new Labels("L'application de l'EUROMILLION","Engravers MT", 10, "blue", "red");
        
        //Initialisation des boutons 
        Buttons exit = new Buttons("Quitter");
        Buttons app = new Buttons("Accéder à l'application");
        
		//Initialisation des images
        Pictures logo_bis = new Pictures();
        JLabel logo = logo_bis.create_picture("src/main/resources/Accueil.png","blue");
       


        GroupLayout app_panelLayout =  Positionings.create_grouplayout_since_button(app_panel, "all", app);
        app_panel.setLayout(app_panelLayout);
        
        GroupLayout exit_panelLayout = Positionings.create_grouplayout_since_button(exit_panel, "short_all", exit);
        exit_panel.setLayout(exit_panelLayout);
       
/******************************A TRIER **************************************/
        GroupLayout panneau_principalLayout = new GroupLayout(main_panel);
        main_panel.setLayout(panneau_principalLayout);
        panneau_principalLayout
        .setHorizontalGroup(panneau_principalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                .addContainerGap(56, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(window_welcome.getContentPane());
        window_welcome.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

	}
}
