package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariasFuentes {

	public static void main(String[] args) {
		
		MarcoBotonesColores3 mimarco=new MarcoBotonesColores3();
		
		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFuentes extends JFrame{
	
	public MarcoFuentes() {
		
		setBounds(500,250,500,350);
		
		add(new LaminaFuentes());
		
		setVisible(true);
	}
}

class LaminaFuentes extends JPanel{
	
	public LaminaFuentes() {
		
		
	}

}

class MarcoBotonesColores3 extends JFrame{
	
	public MarcoBotonesColores3() {
		
		setTitle ("Botones y Eventos");
		
		setBounds(500,300,500,300);
		
		LaminaBotonesColores3 milamina=new LaminaBotonesColores3();
		
		add(milamina);
		
	}
	
}

class LaminaBotonesColores3 extends JPanel{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotonesColores3() {
		
		ColorDeFondo colorAzul=new ColorDeFondo("Azul",Color.BLUE);
		
		ColorDeFondo colorRojo=new ColorDeFondo("Rojo",Color.RED);
		
		ColorDeFondo colorAmarillo=new ColorDeFondo("Amarillo",Color.YELLOW);
		
		add(new JButton(colorAzul));
		
		add(new JButton(colorRojo));
		
		add(new JButton(colorAmarillo));
		
		//DESDE AQUI ASIGNAMOS LAS ENTRADAS POR TECLADO
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl A");
		
		KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
		
		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl Y");
	
		mapaEntrada.put(teclaAzul, "fondo azul");
		
		mapaEntrada.put(teclaRojo, "fondo rojo");
		
		mapaEntrada.put(teclaAmarillo, "fondo amarillo");
		
		ActionMap mapaAction=getActionMap();
		
		mapaAction.put("fondo azul", colorAzul);
		
		mapaAction.put("fondo rojo", colorRojo);
		
		mapaAction.put("fondo amarillo", colorAmarillo);
	}
	
	private class ColorDeFondo extends AbstractAction{
		
		public ColorDeFondo(String nombre, Color color_fondo) {
			
			colorDeFondo=color_fondo;
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION,"ponme la lamina de color "+nombre);
			
			putValue("color_fondo_jpanel",color_fondo);
			
		}

		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color)getValue("color_fondo_jpanel");

			setBackground(c);
			
			System.out.println("Nombre "+getValue(Action.NAME)+" Descripcion "+getValue(Action.SHORT_DESCRIPTION));
		
		}
		
		private Color colorDeFondo;
		
	}
		
	
}