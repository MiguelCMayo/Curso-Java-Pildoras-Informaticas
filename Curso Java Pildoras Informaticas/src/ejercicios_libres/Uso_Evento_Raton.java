package ejercicios_libres;

import java.awt.event.*;


import javax.swing.JFrame;

public class Uso_Evento_Raton {

	public static void main(String[] args) {

		MarcoEventoRaton2 mimarco=new MarcoEventoRaton2();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addMouseListener(new EventosDeRaton2());

	}

}

class MarcoEventoRaton2 extends JFrame{
	
	public MarcoEventoRaton2() {
		
		setBounds(300,150,600,300);
		
		setVisible(true);
		
	}

}

class EventosDeRaton2 implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Estas haciendo clic en el panel");
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	} 


	
}
