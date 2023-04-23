package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class EventoVentana {

	public static void main(String[] args) {
		
		MarcoEventoVentana mimarco=new MarcoEventoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowListener(new EventosDeVentana());
		

	}

}

class MarcoEventoVentana extends JFrame{
	
	public MarcoEventoVentana() {
		
		setBounds(300,300,600,350);
		
		setVisible(true);
	}
}

class EventosDeVentana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {

		System.out.println("VENTANA ABIERTA");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("CERRANDO VENTANA");
	}

	@Override
	public void windowClosed(WindowEvent e) {	
		
		System.out.println("VENTANA CERRADA");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("VENTANA MINIMIZADA");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {

		System.out.println("VENTANA RESTAURADA TRAS MINIMIZAR");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("VENTANA ACTIVA");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("VENTANA EN SEGUNDO PLANO");
	}
	
	
}