import javax.swing.*;
public class bucles1 {

	public static void main(String[] args) {
		
		String clave="Miguel";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contrase�a incorrecta");
				
			}
		}
		
		System.out.println("Contrase�a correcta");
	}	 

}
