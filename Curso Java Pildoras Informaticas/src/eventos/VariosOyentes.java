package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {
		
		Marco_Principal mimarco=new Marco_Principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal(){
		
		setTitle("Múltiples oyentes");
		
		setBounds(600,100,300,200);
		
		Lamina_Principal lamina=new Lamina_Principal();
		
		add(lamina);
	}	
	
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal(){
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar todo");
		
		add(boton_cerrar);	
		
		boton_nuevo.addActionListener(new CreaMarco());
				
		
		}	
	
	private class CreaMarco implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			MarcoNuevo mimarco=new MarcoNuevo(boton_cerrar);
			
			mimarco.setVisible(true);
		}
		
		
	}
		JButton boton_cerrar;
	}

class MarcoNuevo extends JFrame{
	
	public MarcoNuevo(JButton boton) {
		
		contador++;
		
		setTitle("ventana "+contador);
		
		setBounds(50*contador,50*contador,350,200);
		
		boton.addActionListener(new CierraTodos());
	
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose();
		}
		
		
	}
	
	private static int contador=0;
}
		
	





