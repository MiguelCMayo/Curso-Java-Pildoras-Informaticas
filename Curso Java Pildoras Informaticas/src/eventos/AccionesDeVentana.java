package eventos;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.JFrame;

public class AccionesDeVentana {

	public static void main(String[] args) {

		MarcoEventoVentana3 mimarco=new MarcoEventoVentana3();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowStateListener(new EventoDeVentana3());

	}

}

class MarcoEventoVentana3 extends JFrame{
	
	public MarcoEventoVentana3() {
		
		setBounds(300,300,600,350);
		
		setVisible(true);
	}
}

class EventoDeVentana3 implements WindowStateListener{

	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("LA VENTANA HA CAMBIADO DE ESTADO");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("HAS MAXIMIZADO LA VENTANA");
		
		else if (e.getNewState()==Frame.ICONIFIED) System.out.println("HAS MINIMIZADO LA VENTANA");
		
		else System.out.println("HAS HECHO UN CAMBIO SIN ESPECIFICAR");
	}

}


