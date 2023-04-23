package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class EventoTeclado {

	public static void main(String[] args) {
		MarcoEventoTeclado mimarco=new MarcoEventoTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addKeyListener(new EventoDeTeclado());

	}

}

class MarcoEventoTeclado extends JFrame{
	
	public MarcoEventoTeclado() {
		
		setBounds(300,150,600,350);
		
		setVisible(true);
	}
	
}

class EventoDeTeclado implements KeyListener{

	public void keyTyped(KeyEvent e) {
		
		
		
	}

	public void keyPressed(KeyEvent e) {
		
		//System.out.println("HAS PRESIONADO LA TECLA: "+ e.getKeyChar());
		
		//if(e.getKeyCode()==KeyEvent.VK_J) System.out.println("HAS PRESIONADO LA TECLA J");
		
		System.out.println("HAS PULSADO LA TECLA: "+e.getKeyText(e.getKeyCode()));
	}

	public void keyReleased(KeyEvent e) {
		
		//System.out.println("HAS SOLTADO UNA TECLA");
	}
	
	
}