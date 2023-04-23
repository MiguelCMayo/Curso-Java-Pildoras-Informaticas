package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class UsoBorderLayout {

	public static void main(String[] args) {

		MarcoConBorderLayout miMarco=new MarcoConBorderLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoConBorderLayout extends JFrame{
	
	
	public MarcoConBorderLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		PanelconBorderLayout lamina=new PanelconBorderLayout();
		
		PanelconBorderLayout2 lamina2=new PanelconBorderLayout2();
		
		add(lamina,BorderLayout.NORTH);
		
		add(lamina2,BorderLayout.SOUTH);
	
	}
	
}

class PanelconBorderLayout extends JPanel{
	
		public PanelconBorderLayout(){
			
			setLayout(new FlowLayout(FlowLayout.LEFT));
			
			add(new JButton("Amarillo"));
			
			add(new JButton("Rojo"));	

		
	}

}

class PanelconBorderLayout2 extends JPanel{
	
	public PanelconBorderLayout2(){

		setLayout(new BorderLayout(10,10));
		
		add(new JButton("Azul"),BorderLayout.EAST);	
		
		add(new JButton("Verde"),BorderLayout.WEST);	
		
		add(new JButton("Morado"),BorderLayout.CENTER);	
	
}

}
