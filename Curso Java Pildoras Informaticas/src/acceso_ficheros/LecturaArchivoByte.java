package acceso_ficheros;

import java.io.*;

public class LecturaArchivoByte {

	public static void main(String[] args) {
		
		int contador=0;
		
		int bytesImagen[]=new int[98232];
		
		try {
			
			FileInputStream lectura_archivo=new FileInputStream("C:/Users/Miguel/Documents/Curso de Java/pildoras/perro.jpg");
			
			boolean final_archivo=false;
			
			while(!final_archivo) {
				
				int byteImagenEntrada=lectura_archivo.read();
				
				if(byteImagenEntrada!=-1) bytesImagen[contador]=byteImagenEntrada;
				
				else final_archivo=true;
				
				System.out.println(bytesImagen[contador]);
				
				contador++;
				
			}
			
			lectura_archivo.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("El numero de bytes es: " + contador);
		
		CreaFichero(bytesImagen);

	}
	
	static void CreaFichero(int arrayExterno[]){
		
		try {
			
			FileOutputStream ficheroExterno = new FileOutputStream("C:/Users/Miguel/Documents/Curso de Java/pildoras/copiaperro.jpg");
		
			for(int i=0;i<arrayExterno.length;i++) {
				
				ficheroExterno.write(arrayExterno[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
