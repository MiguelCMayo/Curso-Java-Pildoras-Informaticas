package acceso_ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EjercicioCrearCarpetas {

	public static void main(String[] args) {

		//CREAR UN PROGRAMA QUE TE PIDA EN UNA VENTANA JOPTIONPANE EL NOMBRE DE UN NUEVO DIRECTORIO
		//Y DESPUES SALDRA OTRO JOPTIONPANE PREGUNTANDO QUE NOMBRE LE DA AL UN ARCHIVO TXT QUE VA A CREAR
		//Y EN UN TERCER JOPTION PANE SE INTRODUCIRA UNA FRASE EN EL ARCHIVO TXT
		
		String directorioEntrada=JOptionPane.showInputDialog("Introduce el nombre del directorio");
		
		String archivoEntrada=JOptionPane.showInputDialog("Introduce el nombre del archivo");
		
		String fraseEntrada=JOptionPane.showInputDialog("Introduce una frase");
		
		
		
		
		File directorio=new File("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\"+directorioEntrada);

		directorio.mkdir();
		
		
		
		
		File archivo=new File("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\"+directorioEntrada+"\\"+archivoEntrada+".txt");
		
		try {
			
			archivo.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		try {

			FileWriter escritura= new FileWriter("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\"+directorioEntrada+"\\"+archivoEntrada+".txt");
			
			for(int i=0;i<fraseEntrada.length();i++) {
				
				escritura.write(fraseEntrada.charAt(i));
				
			}
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
