package pildoras_tutorizado;

import javax.swing.JOptionPane;

public class UsoContrase�as {

	public static void main(String[] args) {
		
		Contrase�as micontrase�a=new Contrase�as();
		
		micontrase�a.setContrase�a();

	}

}

class Contrase�as{
	
	public Contrase�as() {
		
		cantidadContrase�as=Integer.parseInt(JOptionPane.showInputDialog("�Cuantas contrase�as quieres?"));
		
		longitudContrase�a=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de caracteres de la contrase�a"));
	
	}
	
	public void setContrase�a() {
		
		for (int i=0; i<cantidadContrase�as; i++) {
		
			String contrase�a = ""; 
			
			for (int x=0; x<longitudContrase�a; x++){ 
				 
				int mayusMinus=((int) (Math.random()*3+1));
						
					if (mayusMinus==1) {
						
						char minusculas=(char) ((int) (Math.random()*(123-97)+97));
						
						contrase�a+=minusculas;
						
					}else if(mayusMinus==2) {
						
						char mayusculas=(char) ((int) (Math.random()*(91-65)+65));
						
						contrase�a+=mayusculas;
								
					}else {
						
						char numeros=(char) ((int)(Math.random()*(58-48)+48));
				
						contrase�a+=numeros;

						} 
	
				}		 
				 
				System.out.println("La contrase�a es: " + contrase�a + " y tiene " + longitudContrase�a + " caracteres.");
		}		 
				 
	}
	
	private int longitudContrase�a;
	
	private int cantidadContrase�as;
	
}