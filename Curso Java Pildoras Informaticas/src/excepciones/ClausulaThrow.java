package excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class ClausulaThrow {

	public static void main(String[] args) {
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		

			try {
				examinaMail(mail);
			} catch (longitudMailErroneo e) {
				
				System.out.println("La contraseña es corta");
				e.printStackTrace();
			}

		
	}
	
	static void examinaMail(String email) throws longitudMailErroneo{  //OBLIGA A UTILIZAR UN TRY/CATCH
		
		int arroba=0;
		
		boolean punto=false;
		
		if (email.length()<=3) {
			
			throw new longitudMailErroneo ("Mail con 3 o menos caracteres");

		}
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				
				arroba++;
			}
			if(email.charAt(i)=='.') {
				
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			
			System.out.println("Es correcto");
		}
		else {
			
			System.out.println("Es incorrecto");
			
		
		}
	}

}

class longitudMailErroneo extends Exception{
	
	public longitudMailErroneo() {}
	
	public longitudMailErroneo(String textoError) {
		
		super(textoError);
			
	}
}
