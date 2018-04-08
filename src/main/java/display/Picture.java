package display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


import library.Panels;
import library.Windows_save;
import research.Research;
import treatement.Simple_tirage;
import treatement.Tirage;

	public class Picture {
		
		/**
		 * @author Jacque-Olivier
		 * 
		 * 
		 * @param	
		 * @return 	
		 **/

		ArrayList<Tirage> path=Research.getPath();
		JPanel main_panel=new Panels(500,500,"white");
		Tirage simple_tirage=new Simple_tirage();
		
		public Picture(){
			JFrame window_graph=Windows_save.Windows_save_version1();
			for (int i=0;i<path.toArray().length;i++) {
				simple_tirage=path.get(i);
				if(simple_tirage.getEtoile2()==1 || simple_tirage.getEtoile2()==2){
					System.out.println("dans la boucle");
					JComponent component=new Draw_round();
					main_panel.add(component);
				}
				if(simple_tirage.getEtoile2()==3 || simple_tirage.getEtoile2()==4){
					Draw_hourglass component=new Draw_hourglass();
					main_panel.add(component);
				}
				if(simple_tirage.getEtoile2()==5 || simple_tirage.getEtoile2()==6){
					Draw_square component=new Draw_square();
					main_panel.add(component);
				}
				if(simple_tirage.getEtoile2()==7 ||simple_tirage.getEtoile2()==8 ||simple_tirage.getEtoile2()==9){
					Draw_triangle component=new Draw_triangle();
					main_panel.add(component);
				}
				if(simple_tirage.getEtoile2()==10 ||path.get(i).getEtoile2()==11 ||simple_tirage.getEtoile2()==12){
					Draw_octogone component=new Draw_octogone();
					main_panel.add(component);
				}
			}
			window_graph.add(main_panel);
		}
		
		public class Draw_round extends JComponent { 
			private static final long serialVersionUID = 1L;
			public void paintComponent (Graphics graph){
				  graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); 
				  graph.fillOval(simple_tirage.getBoule4()*10,simple_tirage.getBoule5()*10,simple_tirage.getEtoile1()*41,simple_tirage.getEtoile1()*41);
			}
			
		}
		//Permet de choisir la forme que l'on souhaite
	
		public class Draw_octogone extends JComponent { 
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics graph){
				int boule4 = simple_tirage.getBoule4()*5;
				int boule5 = simple_tirage.getBoule5()*5;
				int etoile1 = simple_tirage.getEtoile1()*41;
				int etoile2 = simple_tirage.getEtoile2()*41;
				int[] x = {boule4,boule5,etoile1,etoile2,etoile2,etoile1,boule5,boule4};
				int[] y = {boule5,boule4,boule4,boule5,etoile1,etoile2,etoile2,etoile1};
				graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
				graph.fillPolygon(x,y,8);
			}
		}
		
		public class Draw_hourglass extends JComponent { 
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics graph){
				int boule4 = simple_tirage.getBoule4()*5;
				int boule5 = simple_tirage.getBoule5()*5;
				int etoile1 = simple_tirage.getEtoile1()*41;
				int[] x = {boule4,boule4,boule5,boule5,boule4};
				int[] y = {boule5,etoile1,boule5,etoile1,boule5};
				graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
				graph.fillPolygon(x,y,5);
			}
		}
		
		public class Draw_square extends JComponent { 
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics graph){
				graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
				graph.fillRect(simple_tirage.getBoule4()*10,simple_tirage.getBoule5()*10,simple_tirage.getEtoile1()*41,simple_tirage.getEtoile1()*41);
			}
		}
		
		public class Draw_triangle extends JComponent { 
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics graph){
				int boule4 = simple_tirage.getBoule4()*5;
				int boule5 = simple_tirage.getBoule5()*5;
				int etoile1 = simple_tirage.getEtoile1()*41;
				int[] x = {boule4,boule5,etoile1};
				int[] y = {boule4,boule5,boule5};
				graph.setColor(new Color(simple_tirage.getBoule1()*5,simple_tirage.getBoule2()*5,simple_tirage.getBoule3()*5)); // couleur rectangle
				graph.fillPolygon(x,y,5);
			}
		}
}
