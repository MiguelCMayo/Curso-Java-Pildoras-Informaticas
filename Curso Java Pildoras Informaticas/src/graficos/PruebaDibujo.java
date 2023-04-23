package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;


public class PruebaDibujo {

	public static void main(String[] args) {


	MarcoConDibujos mimarco=new MarcoConDibujos();
	
	mimarco.setVisible(true);
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("prueba dibujos");
		
		setSize(400,400);
		
		LaminaConFiguras milamina=new LaminaConFiguras();
		
		add(milamina);
		
		milamina.setBackground(Color.GREEN);
		
	}
	
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(109,172,59).brighter());
		
		g2.fill(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroEnX=rectangulo.getCenterX();
		
		double CentroEnY=rectangulo.getCenterX();
		
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);
		
		g2.draw(circulo);
		
		
		
		
		
		
		
		
		
		
	}
	
}