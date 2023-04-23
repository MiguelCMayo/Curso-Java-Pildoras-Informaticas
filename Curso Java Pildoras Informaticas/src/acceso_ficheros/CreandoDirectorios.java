package acceso_ficheros;

import java.io.*;

public class CreandoDirectorios {

	public static void main(String[] args) {
		
		//CREA UNA CARPETA
		
		File directorio=new File("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\datoseconomicos");

		directorio.mkdir();
		
		//CREA UN ARCHIVO EN LA CARPETA
		
		File archivo=new File("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\datoseconomicos\\balance.txt");
		
		try {
			
			archivo.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
