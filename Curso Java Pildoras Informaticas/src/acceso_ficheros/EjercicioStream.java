package acceso_ficheros;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class EjercicioStream {

	public static void main(String[] args) {
		
		MarcoStream mimarco=new MarcoStream();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoStream extends JFrame{
	
	public MarcoStream() {
		
		setTitle ("Crea un fichero para añadir texto");
		
		setBounds(500,300,500,300);
		
		LaminaStream milamina=new LaminaStream();
		
		add(milamina,BorderLayout.SOUTH);
		
		zonaTexto=new JTextArea();
		
		add(zonaTexto, BorderLayout.CENTER);
		
	}
	class LaminaStream extends JPanel{

		public LaminaStream() {
			
			JButton botonEscribir=new JButton("Escribir");
		
			JButton botonBorrar=new JButton("Borrar");
		
			JButton botonLeer=new JButton("Leer");
			
			add(botonEscribir);
			
			add(botonBorrar);
			
			add(botonLeer);
			
			botonEscribir.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					String texto=zonaTexto.getText();
					
					escribiendoFichero(texto);
				}
	
			});
			botonBorrar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					zonaTexto.setText("");
				}
	
			});
			botonLeer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					leyendoFichero();
				}
	
			});
	
		}
		
		public void escribiendoFichero(String texto) {
			
			FileWriter fichero=null;
			
			try {
				
				fichero=new FileWriter("C:\\Users\\Miguel\\Desktop\\fichero_escritura.txt");
				
				fichero.write(texto);
				
				fichero.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			
			}
		}
		
		public void leyendoFichero() {
			
			try {
				FileReader entrada=new FileReader("C:\\Users\\Miguel\\Desktop\\fichero_escritura.txt");
				
				BufferedReader miBuffer=new BufferedReader(entrada);
				
				String linea="";
				
				while(linea!=null) {
					
					linea=miBuffer.readLine();
					
					if(linea!=null)zonaTexto.setText(linea);
				}
			} catch (IOException e) {
				
				System.out.println("No se ha encontrado el archivo");
			}
			
			
		}
			
			
	}
	
	
	private JTextArea zonaTexto;
}




