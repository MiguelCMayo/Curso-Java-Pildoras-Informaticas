package interfaces_graficas;

import java.awt.GraphicsEnvironment;

public class LetrasEnLocal {

	public static void main(String[] args) {
		
		String [] misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for(String nombreFuente:misFuentes) {
			
			System.out.println(nombreFuente);
		}
	}

}
