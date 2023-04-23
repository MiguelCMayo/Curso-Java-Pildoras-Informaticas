package acceso_ficheros;

import java.io.*;

public class AccesoLecturaFichero {

	public static void main(String[] args) {
		
		LeerFichero acceso_externo=new LeerFichero();
		
		acceso_externo.LeeDatos();

	}

}

class LeerFichero{
	
	public void LeeDatos() {
		
		try {
			FileReader entrada=new FileReader("C:\\Users\\Miguel\\Desktop\\primerFichero.txt");
			
			int caracter=entrada.read();
			
			char letra=(char)caracter;
			
			while(caracter!=-1) {
				
				System.out.print(letra);
				
				caracter=entrada.read();
				
				letra=(char)caracter;
			}
			
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
		}
	
	}
}