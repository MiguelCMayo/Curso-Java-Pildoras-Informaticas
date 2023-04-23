package interfaces_graficas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManejoImagenes {

	public static void main(String[] args) {
		
		MarcoImagenes mimarco=new MarcoImagenes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagenes extends JFrame{
	
	public MarcoImagenes() {
		
		setBounds(300,300,800,450);
		
		LaminaImagenes milamina=new LaminaImagenes();
		
		add (milamina);
		
		setVisible(true);
		
	}

}

class LaminaImagenes extends JPanel{
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent (g);
		
		File miImagen=new File("src/interfaces_graficas/perro.jpg");
		
		try {								//INTENTA ESTA INSTRUCCION
			
			imagen=ImageIO.read(miImagen);
			
		} catch (IOException e) {			//EN EL CASO DE FALLAR CAPTURA EL ERROR PARA EJECUTAR LO SIGUIENTE
			
			System.out.println("LA IMAGEN NO SE HA ENCONTRADO");
		}
		
		int anchuraImagen=imagen.getWidth(this);
		
		int alturaImagen= imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<800;i++) {
			
			for(int j=0;j<450;j++) {
				
			g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j); //PARA COPIAR LA IMAGEN
				
			}
			
		}
		
		
	}
	
	private Image imagen;
	
	
}