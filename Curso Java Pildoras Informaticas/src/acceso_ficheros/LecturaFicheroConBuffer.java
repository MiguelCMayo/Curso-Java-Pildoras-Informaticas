package acceso_ficheros;

import java.io.*;

public class LecturaFicheroConBuffer {

	public static void main(String[] args) {
		
		LeerFicheroConBuffer lectura= new LeerFicheroConBuffer();
		
		lectura.LeerTexto();

	}

}

class LeerFicheroConBuffer{
	
	public void LeerTexto() {
		
		try {
			FileReader entrada=new FileReader("C:\\Users\\Miguel\\Desktop\\fichero_escritura.txt");
			
			BufferedReader miBuffer=new BufferedReader(entrada);
			
			String linea="";
			
			while(linea!=null) {
				
				linea=miBuffer.readLine();
				
				if(linea!=null) System.out.println(linea);
			}
			
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
		}
	}
}