package interfaces_graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TipoLetra {

	public static void main(String[] args) {
		
		MarcoFuente miMarco=new MarcoFuente();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoFuente extends JFrame{
	
	public MarcoFuente() {
		
		setBounds(400,200,600,450);
		
		LaminaFuente milamina=new LaminaFuente();
		
		add (milamina);
		
		setVisible(true);
	}
}

class LaminaFuente extends JPanel{
	
	public LaminaFuente() {
		
		fuenteElegida=JOptionPane.showInputDialog("Escribe la fuente que quieres utilizar");
		
		letraPresente=false;
		
		misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent (g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font miLetra;
		
		for(String nombreFuente:misFuentes) {
			
			if(nombreFuente.equals(fuenteElegida)) letraPresente=true;
		
		}
		
		if(letraPresente)miLetra=new Font(fuenteElegida,Font.BOLD,26);
		else {
			
			g2.setPaint(Color.RED);
			
			g2.drawString("NO SE ENCONTRO EL TIPO ESPECIFICADO",10,10);
			
			miLetra=new Font("Arial",Font.BOLD,26);
			
		}
		
		g2.setFont(miLetra);
		
		g2.setPaint(Color.BLUE);
		
		g2.drawString("HOLA ALUMNOS", 100, 100);
		
	}
	
	private String fuenteElegida;
	
	boolean letraPresente;
	
	String []misFuentes;
}
