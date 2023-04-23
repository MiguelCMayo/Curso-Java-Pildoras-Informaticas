package eventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventoVentanaSimplificado {

	public static void main(String[] args) {
		
		MarcoEventoVentana2 mimarco=new MarcoEventoVentana2();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowListener(new EventoDeVentana2());

	}

}

class MarcoEventoVentana2 extends JFrame{
	
	public MarcoEventoVentana2() {
		
		setBounds(300,300,600,350);
		
		setVisible(true);
	}
}

class EventoDeVentana2 extends WindowAdapter{
	
	/*public void windowClosed(WindowEvent e) {
		
		System.out.println("GRACIAS POR TRABAJAR EN LA APP");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("BIENVENIDO A LA APP");
		
	}*/

}


