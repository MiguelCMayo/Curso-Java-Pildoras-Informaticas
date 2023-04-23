package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("MARCO CENTRAL");
		
		Image miIcono=miPantalla.getImage("ruta");
		
		setIconImage(miIcono);
	}
	
}