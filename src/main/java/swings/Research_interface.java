package swings;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.*;
import library.*;
import research.Research;
import treatement.Tirage;

public class Research_interface {

	/**
	 * @author	Julie
	 * 
	 * Cr�ation d'une IHM permettant le lancement des recherches
	 * 
	 * @param	Tableau csv trait�
	 * @return	Ne retourne rien / Lancement de Research	
	 */
	
	public Research_interface(final ArrayList<Tirage> path){
		
		//Initialisation de la fen�tre
		final Windows window_research = new Windows("Team JIJI DRAUM : Eurodroo ",500,500);
		
		//Initialisation des panneaux
		Panels main_panel = new Panels(500,500,"blue");
		Panels display_panel = new Panels(470,69,"gold");
		Panels research_panel = new Panels(470,310,"red");
		Panels return_panel = new Panels(114,23,"gold");
		Panels research_button_panel = new Panels(114,23,"gold");
		
		//Initialisation des �tiquettes
		JLabel main_title = Labels.create_label("RECHERCHE DE TIRAGE", "Engravers MT", 18, "blue", "gold");
		JLabel display_title = Labels.create_label("Type d'affichage","Engravers MT",11,"gold","white");
		JLabel research_title = Labels.create_label("Criteres de recherches","Engravers MT",12,"red","white");
		JLabel draw_number_label = Labels.create_label("Num�ro de tirage : ","Tahoma",11,"red","white");
		JLabel date_label = Labels.create_label("Date :","Tahoma",11,"red","white");
		JLabel winners_label = Labels.create_label("Gagnant(s) :","Tahoma",11,"red","white");
		JLabel rang_round_label = Labels.create_label("Numero boule :","Tahoma",11,"red","white");
		JLabel number_winners_label = Labels.create_label("Nombre de gagnant :","Tahoma",11,"red","white");
		JLabel my_million_label = Labels.create_label("Num�ro My million : ","Tahoma",11,"red","white");
		JLabel star_label = Labels.create_label("Numero �toile :","Tahoma",11,"red","white");
		
		//Initialisation des zones de textes
		final JTextField draw_number_text = Labels.create_textfield("0");
		final JTextField my_million_text = Labels.create_textfield("0");
		final JTextField number_winners_text = Labels.create_textfield("0");
		
		//Initialisation des boutons
		JButton research_button = Buttons.create_buttons("Recherche");
		JButton return_button = Buttons.create_buttons("Retour");
		final JRadioButton panel_button = Buttons.create_radiobutton("Tableau","gold");
		final JRadioButton picture_button = Buttons.create_radiobutton("Sch�ma(s)","gold");
		final JComboBox<String> date_day_box = Buttons.create_ComboBox(new String[] { "Mardi", "Vendredi", "Inconnu" });
		final JComboBox<String> date_year_box = Buttons.create_ComboBox(new String[] { "2016", "2017", "2018", "Inconnue" });
		final JComboBox<String> date_month = Buttons.create_ComboBox(new String[] { "Janvier", "F�vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "D�cembre", "Inconnu" });
		final JCheckBox round_box = Buttons.create_checkbox("Boule");
		final JCheckBox star_box = Buttons.create_checkbox("Etoile");
		final JCheckBox unknown_box = Buttons.create_checkbox("Inconnu");
		final JSpinner date_number_day_spinner = Buttons.create_spinner(0,0,31,1);
		final JSpinner round_spinner = Buttons.create_spinner(0,0,50,1);
		final JSpinner star_spinner = Buttons.create_spinner(0,0,12,1);
		@SuppressWarnings("unused")
		ButtonGroup buttonGroup1 = Buttons.create_buttongroup2(round_box,star_box,unknown_box);
		@SuppressWarnings("unused")
		ButtonGroup buttonGroup2 = Buttons.create_buttongroup(panel_button,picture_button);
		
		//Positionnement g�n�ral
        GroupLayout display_panelLayout = new GroupLayout(display_panel);
        display_panel.setLayout(display_panelLayout);
        display_panelLayout.setHorizontalGroup(
        		display_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(display_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(panel_button)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(picture_button)
                .addGap(60, 60, 60)
                .addGap(59, 59, 59))
        		.addGroup(GroupLayout.Alignment.TRAILING, display_panelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(display_title,GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)));
        
        display_panelLayout.setVerticalGroup(
        		display_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(display_panelLayout.createSequentialGroup()
                .addComponent(display_title,GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(display_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(picture_button)
                .addComponent(panel_button))
                .addGap(0, 14, Short.MAX_VALUE)));     

        GroupLayout research_button_panelLayout = Positionings.create_grouplayout_since_button(research_button_panel,"short",research_button,114);
        research_button_panel.setLayout(research_button_panelLayout);

        GroupLayout return_panelLayout = Positionings.create_grouplayout_since_button(return_panel,"short",return_button,114);
        return_panel.setLayout( return_panelLayout);

        GroupLayout research_panelLayout = new GroupLayout(research_panel);
        research_panel.setLayout(research_panelLayout);
        research_panelLayout.setHorizontalGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(research_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(research_panelLayout.createSequentialGroup().addGap(11, 11, 11)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(draw_number_label).addGap(3, 3, 3))
                .addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(date_label,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)))
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(date_day_box,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addComponent(draw_number_text,GroupLayout.PREFERRED_SIZE, 60,GroupLayout.PREFERRED_SIZE)))
                .addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(winners_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(rang_round_label).addComponent(round_box))))
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addGap(44, 44, 44).addComponent(star_box)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unknown_box)).addGroup(research_panelLayout.createSequentialGroup().addGap(10, 10, 10)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(round_spinner,GroupLayout.PREFERRED_SIZE, 37,GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18).addComponent(star_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(star_spinner,GroupLayout.PREFERRED_SIZE, 37,GroupLayout.PREFERRED_SIZE))
                .addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(date_number_day_spinner,GroupLayout.PREFERRED_SIZE, 37,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_month,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_year_box, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))))))
                .addGroup(research_panelLayout.createSequentialGroup()
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addGap(149, 149, 149).addComponent(number_winners_label))
                .addGroup(research_panelLayout.createSequentialGroup().addComponent(my_million_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(my_million_text,GroupLayout.PREFERRED_SIZE, 82,GroupLayout.PREFERRED_SIZE))
                .addGroup(research_panelLayout.createSequentialGroup().addGap(107, 107, 107)
                .addComponent(research_button_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(number_winners_text,GroupLayout.PREFERRED_SIZE, 48,GroupLayout.PREFERRED_SIZE)
                .addComponent(return_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(GroupLayout.Alignment.TRAILING, research_panelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(research_title).addGap(136, 136, 136)));
        
        research_panelLayout.setVerticalGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(research_panelLayout.createSequentialGroup()
                .addComponent(research_title,GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(research_panelLayout.createSequentialGroup()
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(draw_number_label,GroupLayout.PREFERRED_SIZE, 27,GroupLayout.PREFERRED_SIZE)
                .addComponent(draw_number_text,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(date_label))
                .addGroup(GroupLayout.Alignment.TRAILING, research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(date_day_box,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addComponent(date_number_day_spinner, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(date_month,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addComponent(date_year_box,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18).addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(winners_label).addComponent(round_box).addComponent(star_box)
                .addComponent(unknown_box)).addGap(18, 18, 18)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(rang_round_label)
                .addComponent(round_spinner,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addComponent(star_label)
                .addComponent(star_spinner,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21).addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(number_winners_label)
                .addComponent(number_winners_text,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18).addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(my_million_label)
                .addComponent(my_million_text,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(research_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(research_button_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addComponent(return_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)));

        GroupLayout main_panelLayout = new GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(main_panelLayout.createSequentialGroup().addGap(68, 68, 68)
                .addComponent(main_title,GroupLayout.PREFERRED_SIZE, 384,GroupLayout.PREFERRED_SIZE))
                .addGroup(main_panelLayout.createSequentialGroup().addContainerGap()
                .addComponent(display_panel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(main_panelLayout.createSequentialGroup().addContainerGap()
                .addComponent(research_panel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        
        main_panelLayout.setVerticalGroup(main_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(main_panelLayout.createSequentialGroup().addContainerGap()
                .addComponent(main_title,GroupLayout.PREFERRED_SIZE, 46,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(research_panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        GroupLayout window_researchLayout = Positionings.create_grouplayout_since_panel (window_research, "complex", main_panel);
        window_research.setLayout(window_researchLayout);

        //Utilisation des composants
        
        //Retour � l'interface pr�c�dente
        return_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		window_research.dispose();
        		new Choice_interface(path);
        	}
        });
        
        //Lancement de la recherche
        research_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Integer draw_number = Integer.parseInt(draw_number_text.getText());
        		Integer my_million = Integer.parseInt(my_million_text.getText());
        		Integer number_winners = Integer.parseInt(number_winners_text.getText());
        		String date_day = date_day_box.getSelectedItem().toString();
        		String date_year = date_year_box.getSelectedItem().toString();
        		String date_year_choice = date_month.getSelectedItem().toString();
        		Integer date_number_day = Integer.parseInt(date_number_day_spinner.getValue().toString());
        		Integer rang_round = Integer.parseInt(round_spinner.getValue().toString());
        		Integer star = Integer.parseInt(star_spinner.getValue().toString());
        		String checkbox_result = null;
        		String representation = null;
        		if (round_box.isSelected()) {
        			checkbox_result = round_box.getText();}
        		if (star_box.isSelected()) {
        			checkbox_result = star_box.getText();}
        		if (unknown_box.isSelected()) {
        			checkbox_result = unknown_box.getText();}
        		if (panel_button.isSelected()) {
        			representation = panel_button.getText();}
        		if (picture_button.isSelected()) {
        			representation = picture_button.getText();}
        		//On lance le traitement des donn�es et du fichier csv
        		new Research(draw_number,my_million,number_winners,date_day,date_year,date_year_choice,date_number_day,rang_round,star,
    					checkbox_result,representation,path);
        	}
        }); 
        
	    }  

}
