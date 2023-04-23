package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		
		MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("MARCO IMAGEN");
		
		setBounds(100,50,1000,600);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
	}
	
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){
		
		try {
			
			imagen=ImageIO.read(new File("src\\graficos\\perro.jpg"));
			}
			catch(IOException e) {
				
				System.out.println("la imagen no se encuentra");
			}
		
	}
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<5;j++) {
				
				if(i+j>0) {
					
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
					
				}
				
			}
			
		}
		
	}

	private Image imagen;
}
