package ejercicios_libres;

import javax.swing.*;

public class Uso_Ventanas {
	
	public static void main(String []args) {
	
	Crear3Ventanas miVentana1=new Crear3Ventanas("VENTANA 1",100,100,400,400);

	Crear3Ventanas miVentana2=new Crear3Ventanas("VENTANA 2",200,200,400,400);
	
	Crear3Ventanas miVentana3=new Crear3Ventanas("VENTANA 3",300,300,400,400);

	}

}

class Crear3Ventanas extends JFrame{
	
	public Crear3Ventanas(String titulo,int posicionX, int posicionY, int alto,int ancho) {
		
		setBounds(posicionX,posicionY,alto,ancho);
		
		setTitle(titulo);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
}