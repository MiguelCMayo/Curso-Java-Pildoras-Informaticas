package eventos;

import java.awt.event.*;

import javax.swing.*;

public class EventoRaton {

	public static void main(String[] args) {
		
		MarcoEventoRaton mimarco=new MarcoEventoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addMouseMotionListener(new EventosDeRaton());

	}

}

class MarcoEventoRaton extends JFrame{
	
	public MarcoEventoRaton() {
		
		setBounds(300,150,600,300);
		
		setVisible(true);
		
	}
}

/*class EventosDeRaton implements MouseListener{ //CON LA INTERFAZ TIENES QUE IMPLEMETAR TODOS LOS METODOS

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("HAS HECHO CLIC");
		
	}

	public void mousePressed(MouseEvent e) {
		
		System.out.println("HAS PRESINADO");
	}

	public void mouseReleased(MouseEvent e) {
		
		System.out.println("HAS SOLTADO");
	}

	public void mouseEntered(MouseEvent e) {
		
		System.out.println("HAS ENTRADO");
	}

	public void mouseExited(MouseEvent e) {
		
		System.out.println("HAS SALIDO");
	}	
}*/

/*class EventosDeRaton extends MouseAdapter{ //HEREDANDO SOLO LOS METODOS QUE QUIERES DE LA CLASE ADAPTORA
	
	public void mousePressed(MouseEvent e) {
		
		//System.out.println("x= "+e.getX()); //TE DICE LAS COORDENAS DONDE PULSAS
		
		//System.out.println("y= "+e.getY());
		
		if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) System.out.println("HAS PRESIONADO LA TECLA DERECHA");
		else if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("HAS PRESIONADO LA TECLA IZQUIERDA");
	}

}
*/
class EventosDeRaton implements MouseMotionListener{ 

	public void mouseDragged(MouseEvent e) {
		
		System.out.println("ESTAS ARRASTRANDO EL RATON");
	}

	public void mouseMoved(MouseEvent e) {
		
		System.out.println("ESTAS MOVIENDO EL RATON");
	}
	
	
}
