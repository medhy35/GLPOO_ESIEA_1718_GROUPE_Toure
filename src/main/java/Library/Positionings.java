package Library;

import javax.swing.*;

import Library.Windows;

public class Positionings {
	
	/**
	 * @author	Julie
	 * 
	 * Positionnement d'�l�ments
	 * @param	le panneau de support, le mot cl� d'orientation et l'�l�ment sur le panneau
	 * @return	un objet de classe GroupLayout
	 */
	
	public static GroupLayout create_grouplayout_since_button (JPanel panel, String orientation, JButton button,int value) {
		GroupLayout panel_layout = new GroupLayout(panel);
		if (orientation=="all") {
			panel_layout
			.setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addGroup(GroupLayout.Alignment.TRAILING, panel_layout.createSequentialGroup()
		    .addGap(0, 0, Short.MAX_VALUE)
		    .addComponent(button)));
			panel_layout
			.setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addGroup(GroupLayout.Alignment.TRAILING, panel_layout.createSequentialGroup()
		    .addGap(0, 0, Short.MAX_VALUE)
		    .addComponent(button)));
		}
		
		if (orientation=="short") {
			panel_layout
			.setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(button,GroupLayout.DEFAULT_SIZE, value, Short.MAX_VALUE));
			panel_layout
			.setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        .addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		}
		
		if (orientation=="short_all") {
			panel_layout
		    .setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addComponent(button, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			panel_layout
		    .setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addGroup(GroupLayout.Alignment.TRAILING, panel_layout.createSequentialGroup()
		    .addGap(0, 0, Short.MAX_VALUE)
		    .addComponent(button)));
		}
		
		if (orientation=="all_value") {
			panel_layout
			.setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addGroup(GroupLayout.Alignment.TRAILING, panel_layout.createSequentialGroup()
		    .addGap(0, 0, Short.MAX_VALUE)
		    .addComponent(button,GroupLayout.PREFERRED_SIZE, value,GroupLayout.PREFERRED_SIZE)));
			panel_layout
			.setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addGroup(GroupLayout.Alignment.TRAILING, panel_layout.createSequentialGroup()
		    .addGap(0, 0, Short.MAX_VALUE)
		    .addComponent(button)));
		}
		return (panel_layout);
	}
	
	/**
	 * @author	Julie
	 * 
	 * Positionnement d'�l�ments
	 * @param	la fen�tre principale, le mot cl� d'orientation et le panneau de la fen�tre
	 * @return	un objet de classe GroupLayout
	 */
	
	public static GroupLayout create_grouplayout_since_panel (Windows window, String orientation, JPanel panel) {
		GroupLayout panel_layout = new GroupLayout(window.getContentPane());
		if (orientation=="simple") {
			panel_layout
			.setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addComponent(panel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			panel_layout
			.setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		}
		
		if (orientation=="complex") {
			panel_layout
			.setHorizontalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
			panel_layout
			.setVerticalGroup(panel_layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		    .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		}
		return (panel_layout);
		
	}

}
