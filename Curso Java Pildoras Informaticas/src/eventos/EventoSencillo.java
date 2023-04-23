package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventoSencillo {

	public static void main(String[] args) {
		
		MarcoBotonesColores mimarco=new MarcoBotonesColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotonesColores extends JFrame{
	
	public MarcoBotonesColores() {
		
		setTitle ("Botones y Eventos");
		
		setBounds(500,300,500,300);
		
		LaminaBotonesColores milamina=new LaminaBotonesColores();
		
		add(milamina);
		
	}
	
}

class LaminaBotonesColores extends JPanel implements ActionListener{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotonesColores() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		
		botonAmarillo.addActionListener(this);

		botonRojo.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul)setBackground(Color.BLUE);
		
		else if(botonPulsado==botonRojo)setBackground(Color.RED);
		
		else setBackground(Color.YELLOW);
	
	}
	
}