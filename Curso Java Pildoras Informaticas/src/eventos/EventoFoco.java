package eventos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class EventoFoco {

	public static void main(String[] args) {
		
		MarcoFoco mimarco=new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setBounds(300,150,400,300);
		
		add(new LaminaMarcoFoco());
		
	}
}

class LaminaMarcoFoco extends JPanel{
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		campoTexto1=new JTextField();
		
		campoTexto2=new JTextField();
		
		campoTexto3=new JTextField();
		
		etiq1= new JLabel("Usuario");
		
		etiq2= new JLabel("Contraseña");
		
		etiq3= new JLabel("Email");
		
		etiq1.setBounds(70, 10, 150, 20);
		
		etiq2.setBounds(47, 50, 150, 20);
		
		etiq3.setBounds(80, 90, 150, 20);
		
		add(etiq1);
		
		add(etiq2);
		
		add(etiq3);
		
		campoTexto1.setBounds(120, 10, 150, 20);
		
		campoTexto2.setBounds(120, 50, 150, 20);
		
		campoTexto3.setBounds(120, 90, 150, 20);
		
		add(campoTexto1);
		
		add(campoTexto2);
		
		add(campoTexto3);
		
		EventosDeFoco foco=new EventosDeFoco();
		
		campoTexto1.addFocusListener(foco);
		
		campoTexto2.addFocusListener(foco);
		
		campoTexto3.addFocusListener(foco);
	}
	
	class EventosDeFoco implements FocusListener{

		public void focusGained(FocusEvent e) {
			
			
		}

		public void focusLost(FocusEvent e) {
			
			if(e.getSource()==campoTexto1) {
				
				System.out.println("EL CUADRO 1 HA PERDIDO EL FOCO");
			}
			
			else {
				
				System.out.println("EL CUADRO 2 HA PERDIDO EL FOCO");
			}
		}
		
		
	}
	
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	
	private JLabel etiq1,etiq2,etiq3;
}

