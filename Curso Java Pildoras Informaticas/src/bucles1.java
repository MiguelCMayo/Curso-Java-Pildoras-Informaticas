import javax.swing.*;
public class bucles1 {

	public static void main(String[] args) {
		
		String clave="Miguel";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseņa incorrecta");
				
			}
		}
		
		System.out.println("Contraseņa correcta");
	}	 

}
