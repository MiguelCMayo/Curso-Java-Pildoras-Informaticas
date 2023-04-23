package excepciones;

import javax.swing.JOptionPane;

public class Ejercicio_Excepciones {

	public static void main(String[] args) {
		
		int numero=0;
		
		try {
		
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

		}
		catch(NumberFormatException e){
			
			JOptionPane.showMessageDialog(null,"El valor introducido no es numerico");
			
			System.exit(0);
		}
	
		if(numero % 2 == 0) {
		
			JOptionPane.showMessageDialog(null,"El numero es par");
		}
		else {
		
			JOptionPane.showMessageDialog(null,"El numero es impar");
		}
		
	}

}
