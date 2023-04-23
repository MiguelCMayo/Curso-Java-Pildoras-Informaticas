package layout;

import java.awt.FlowLayout;

import javax.swing.*;

public class UsoLayouts {

	public static void main(String[] args) {

		MarcoConLayout miMarco=new MarcoConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoConLayout extends JFrame{
	
	
	public MarcoConLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(400,250,600,300);
		
		PanelconLayout lamina=new PanelconLayout();
		
		//AQUI COLOCAMOS LOS BOTONES A LA DERECHA CON FLOWLAYOUT
		
		//FlowLayout disposicion=new FlowLayout(FlowLayout.RIGHT);
		
		//lamina.setLayout(disposicion);
		
		//AQUI HACIENDOLO EN SOLO UNA LINEA
		
		//lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(lamina);
	
	}
	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
			
			//CON ESTA LINEA PONEMOS LOS BOTONES DONDE QUERAMOS
			
			setLayout(new FlowLayout(FlowLayout.CENTER,50,150));
			
			add(new JButton("Amarillo"));
			
			add(new JButton("Rojo"));	
			
			add(new JButton("Azul"));	
			
			
		}
}

