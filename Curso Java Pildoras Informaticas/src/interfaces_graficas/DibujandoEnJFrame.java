package interfaces_graficas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
		
		MarcoDibujos mimarco=new MarcoDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoDibujos extends JFrame{
	
	public MarcoDibujos() {
		
		setBounds(300,200,800,450);
		
		LaminaDibujos milamina=new LaminaDibujos();
		
		milamina.setBackground(Color.YELLOW); //ESTABLECE EL COLOR DE LA LAMINA
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class LaminaDibujos extends JPanel{
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent (g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		float midash[]= {10.0f};

		BasicStroke milapiz=new BasicStroke(4,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,10,midash,0);
		
		g2.setPaint(Color.BLUE);  //ESTABLECE UN COLOR A LA LINEA
		
		g2.setStroke(milapiz);
		
		g2.draw(rectangulo);
		
		//Color miColor=new Color (125,188,230);  //ESTABLECE UN COLOR DE RELLENO CON R,G,B
		
		g2.setPaint(new Color (125,188,230)); //ESTABLECE EL COLOR DE RELLENO INSTANCIANDO EN LAS PARAMETROS
		
		g2.fill(rectangulo); //MANDA RELLENAR EL RECTANGULO
		

	}
	
}