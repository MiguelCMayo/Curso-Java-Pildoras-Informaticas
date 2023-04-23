package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones mimarco=new MarcoBotones ();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(400,200,500,300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
		
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul); 							//OBJETO FUENTE: botonAzul
		
		add(botonAmarillo); 
		
		add(botonRojo); 
		
		botonAzul.addActionListener(this); 	
			
		botonAmarillo.addActionListener(this); 
		
		botonRojo.addActionListener(this); 			//OBJETO EVENTO: adActionListener
	}
													//OBJETO LISTENER: this
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();	
		
		if(botonPulsado==botonAzul) {
			
			setBackground(Color.BLUE);
			
		}
		else if(botonPulsado==botonAmarillo) {
			
			setBackground(Color.YELLOW);
			
		}
		else {
			
			setBackground(Color.RED);
			
		}
		
	}
}