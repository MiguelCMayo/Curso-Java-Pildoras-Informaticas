package acceso_ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		
		Escritura creaEscribeFichero=new Escritura();
		
		creaEscribeFichero.escribiendo();

	}

}

class Escritura{
	
	public void escribiendo() {
		
		String texto=". Esta es la segunda frase.";
		
		try {
			//SIN "TRUE" SE CREA UN FICHERO NUEVO, CON "TRUE" SE AÑADE TEXTO A UN FICHERO EXISTENTE
			
			FileWriter escritura= new FileWriter("C:\\Users\\Miguel\\Desktop\\streamNuevo.txt",true);
			
			for(int i=0;i<texto.length();i++) {
				
				escritura.write(texto.charAt(i));
				
			}
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}