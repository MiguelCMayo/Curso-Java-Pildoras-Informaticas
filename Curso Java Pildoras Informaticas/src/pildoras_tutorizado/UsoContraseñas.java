package pildoras_tutorizado;

import javax.swing.JOptionPane;

public class UsoContraseñas {

	public static void main(String[] args) {
		
		Contraseñas micontraseña=new Contraseñas();
		
		micontraseña.setContraseña();

	}

}

class Contraseñas{
	
	public Contraseñas() {
		
		cantidadContraseñas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas contraseñas quieres?"));
		
		longitudContraseña=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de caracteres de la contraseña"));
	
	}
	
	public void setContraseña() {
		
		for (int i=0; i<cantidadContraseñas; i++) {
		
			String contraseña = ""; 
			
			for (int x=0; x<longitudContraseña; x++){ 
				 
				int mayusMinus=((int) (Math.random()*3+1));
						
					if (mayusMinus==1) {
						
						char minusculas=(char) ((int) (Math.random()*(123-97)+97));
						
						contraseña+=minusculas;
						
					}else if(mayusMinus==2) {
						
						char mayusculas=(char) ((int) (Math.random()*(91-65)+65));
						
						contraseña+=mayusculas;
								
					}else {
						
						char numeros=(char) ((int)(Math.random()*(58-48)+48));
				
						contraseña+=numeros;

						} 
	
				}		 
				 
				System.out.println("La contraseña es: " + contraseña + " y tiene " + longitudContraseña + " caracteres.");
		}		 
				 
	}
	
	private int longitudContraseña;
	
	private int cantidadContraseñas;
	
}