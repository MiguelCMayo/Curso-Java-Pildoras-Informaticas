package poo_abstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		//Temporizador oyente=new Temporizador();
		
		Timer miTemporizador=new Timer(3000,new ActionListener() {    //CLASE INTERNA ANONIMA

			public void actionPerformed(ActionEvent e) {
				
				Date horaActual=new Date();
				
				System.out.println(horaActual);
				
			}   
			
		});
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa para detener");

	}


/*class Temporizador implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		Date horaActual=new Date();
		
		System.out.println(horaActual);
		
	}*/
	
}