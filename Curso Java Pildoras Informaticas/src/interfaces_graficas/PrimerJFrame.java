package interfaces_graficas;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class PrimerJFrame {
	
	public static void main(String []args) {
		
		/*JFrame miVentana=new JFrame();
	
		miVentana.setSize(600,350);
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miVentana.setLocation(400, 250);
		
		miVentana.setVisible(true); //PONER SIEMPRE EN EL ULTIMO LUGAR*/
		
		MiJFrame miVentana=new MiJFrame();
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}

class MiJFrame extends JFrame{
	
	public MiJFrame() {
		
		//setSize(600,350);   //PARA PONERLE TAMAÑO

		//setLocationRelativeTo(null); //PARA QUE SALGA EN EL CENTRO DE LA PANTALLA
		
		setBounds(300,150,400,400);   //TE PIDE LOCALIZACION Y TAMAÑO

		//setResizable(false);   //PARA DECIDIR SI SE PUEDE MAXIMIZAR O NO
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);  //ABRE LA VENTANA A PANTALLA COMPLETA
		
		setTitle("Ventana de pruebas");  //LE DA UN TITULO A LA VENTANA
		
		Toolkit miSistema=Toolkit.getDefaultToolkit();   //PARA COLOCOAR EL ICONO
		
		Image miIcono=miSistema.getImage("src/interfaces_graficas/perro.jpg");//PARA COLOCOAR EL ICONO
		
		setIconImage(miIcono);//PARA COLOCOAR EL ICONO
		
		setVisible(true); //PONER SIEMPRE EN EL ULTIMO LUGAR*/
	}
	
}