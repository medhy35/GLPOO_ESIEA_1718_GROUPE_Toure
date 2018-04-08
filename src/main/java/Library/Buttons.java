package Library;

import java.awt.*;
import javax.swing.*;

public class Buttons {

	/**
	 * @author	Julie, Arnaud
	 * 
	 * Création d'un bouton 
	 * @param	Les critères du bouton
	 * @return	Il retourne le composant
	 */
	
	public static JButton create_buttons(String text) {
		JButton component = new JButton();
        component.setText(text);
        component.setBorderPainted(false);
        component.setContentAreaFilled(false);
        return(component);
	}
	
	public static JRadioButton create_radiobutton(String text,String color) {
		JRadioButton component = new JRadioButton();
		component.setText(text);
		component.setBackground(new Color(Colors.choose_color(color).get(0), Colors.choose_color(color).get(1), Colors.choose_color(color).get(2)));
		return(component);
	}
	
	public static JComboBox<String> create_ComboBox(String[] list){
		JComboBox<String> component = new JComboBox<String>();
		for(int i=0;i<list.length;i++) {
			component.addItem(list[i]);
		}
		return (component);		
	}
	
	public static JCheckBox create_checkbox(String text) {
		JCheckBox component = new JCheckBox(text);
		return(component);
	}
	
	public static JSpinner create_spinner(int value,int minimum,int maximum,int stepsize) {
		JSpinner component = new JSpinner();
		component.setModel(new SpinnerNumberModel(value, minimum, maximum, stepsize));
		return(component);
	}
	
	public static ButtonGroup create_buttongroup(JRadioButton button1,JRadioButton button2) {
		ButtonGroup component = new ButtonGroup();
		component.add(button1);
		component.add(button2);
		return(component);
	}
	
	public static ButtonGroup create_buttongroup2(JCheckBox button1,JCheckBox button2,JCheckBox button3) {
		ButtonGroup component = new ButtonGroup();
		component.add(button1);
		component.add(button2);
		component.add(button3);
		return(component);
	}
	
	public static JMenuBar create_menubar(JMenuItem Item1,JMenuItem Item2){
		JMenuBar main_bar = new JMenuBar();
		JMenu acces_button = new JMenu("Ficher");
		acces_button.add(Item1);
		acces_button.add(Item2);
		main_bar.add(acces_button);
		return (main_bar);
	}
	
	public static JMenuBar create_menubar_bis(JMenuItem Item1,JMenuItem Item2,JMenuItem Item3,JMenuItem Item4,JMenuItem Item5,JMenuItem Item6,JMenuItem Item7,JMenuItem Item8){
		JMenuBar main_bar = new JMenuBar();
		JMenu acces_button = new JMenu("Ficher");
		JMenu acces_button_bis = new JMenu("Catégories");
		acces_button.add(Item1);
		acces_button.add(Item2);
		acces_button_bis.add(Item3);
		acces_button_bis.add(Item4);
		acces_button_bis.add(Item5);
		acces_button_bis.add(Item6);
		acces_button_bis.add(Item7);
		acces_button_bis.add(Item8);
		main_bar.add(acces_button);
		main_bar.add(acces_button_bis);
		return (main_bar);
	}
	
	
}