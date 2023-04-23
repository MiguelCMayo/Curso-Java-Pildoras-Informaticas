package excepciones;

import javax.swing.JOptionPane;

public class Ejercicio_Excepciones2 {

	public static void main(String[] args) {
		
		int numero=0;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 100"));
		
		try {
		
			examinaRango(numero);

		}
		catch(NumeroFueraDeRango e){
			
			JOptionPane.showMessageDialog(null,"El valor no esta entre 1 y 100");
			
			e.printStackTrace();
		}
	}
	
	static void examinaRango(int num) throws NumeroFueraDeRango{

		if(num<1||num>100) {
		
			throw new NumeroFueraDeRango ("VALOR FUERA DE RANGO");
		}
		else {
			
			System.out.println("Valor correcto");
		}

	}
	
}

class NumeroFueraDeRango extends Exception{
	
	public NumeroFueraDeRango() {}
	
	public NumeroFueraDeRango(String MensajeError) {
		
		super(MensajeError);
	}
}
