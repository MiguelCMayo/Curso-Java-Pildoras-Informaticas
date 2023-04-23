import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String Nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre por favor");
		
		String edad=JOptionPane.showInputDialog("intruduce la edad");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("hola " + Nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años");

	}

}
