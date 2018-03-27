package Library;

import java.awt.*;
import javax.swing.*;

import Library.Colors;

public class Buttons {
	
	/**
	 * @author	Julie
	 * 
	 * Cr�ation d'un bouton 
	 * @param	Les crit�res du bouton
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
	
	public static ButtonGroup create_buttongroup(JRadioButton button1,JRadioButton button2,JRadioButton button3) {
		ButtonGroup component = new ButtonGroup();
		component.add(button1);
		component.add(button2);
		component.add(button3);
		return(component);
	}
	
	public static ButtonGroup create_buttongroup2(JCheckBox button1,JCheckBox button2,JCheckBox button3) {
		ButtonGroup component = new ButtonGroup();
		component.add(button1);
		component.add(button2);
		component.add(button3);
		return(component);
	}

}
