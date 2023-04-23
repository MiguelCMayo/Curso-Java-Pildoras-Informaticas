package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco=new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("PRIMER TEXTO");
		
		Lamina milamina=new Lamina();
		
		add(milamina);
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("estamos aprendiendo swing", 100, 100);
		
	}
	
}