import javax.swing.*;
public class factorial_for {

	public static void main(String[] args) {
		
		Long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Iintroduce un numero"));
		
		for(int i=numero; i>0; i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);

	}

}
