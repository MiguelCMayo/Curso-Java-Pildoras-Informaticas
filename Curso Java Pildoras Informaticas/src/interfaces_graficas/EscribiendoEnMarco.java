package interfaces_graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoTexto miMarco=new MarcoTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(400,200,600,450);
		
		setTitle("Escritura en JFrame");
		
		setVisible(true);
		
		PrimerPanel milamina=new PrimerPanel();
		
		add (milamina);
		
	}
	
}

class PrimerPanel extends JPanel{     //PARA CREAR LA LAMINA
	
	public PrimerPanel() {
		
		setBackground(new Color(195));
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Color micolor=new Color (255,128,200);
		
		g.setColor(micolor);
		
		Font miletra=new Font("courier",3,30);
		
		g.setFont(miletra);
		
		g.drawString("Primer panel", 260, 200);
		
	}
	
}