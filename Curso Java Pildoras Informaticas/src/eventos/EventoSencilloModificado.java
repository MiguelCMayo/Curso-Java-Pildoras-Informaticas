package eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoSencilloModificado {

public static void main(String[] args) {
		
		MarcoBotonesColores2 mimarco=new MarcoBotonesColores2();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotonesColores2 extends JFrame{
	
	public MarcoBotonesColores2() {
		
		setTitle ("Botones y Eventos");
		
		setBounds(500,300,500,300);
		
		LaminaBotonesColores milamina=new LaminaBotonesColores();
		
		add(milamina);

	}
	
}

class LaminaBotonesColores2 extends JPanel{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotonesColores2() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorDeFondo Azul=new ColorDeFondo(Color.BLUE);
		
		ColorDeFondo Amarillo=new ColorDeFondo(Color.YELLOW);
		
		ColorDeFondo Rojo=new ColorDeFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);

		botonAmarillo.addActionListener(Amarillo);
		
		botonRojo.addActionListener(Rojo);
		
	}
	
	private class ColorDeFondo implements ActionListener{
		
		public ColorDeFondo(Color c) {
			
			colorDeFondo=c;
			
		}

		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		
		}
		
		private Color colorDeFondo;
		
	}
		
	
}

