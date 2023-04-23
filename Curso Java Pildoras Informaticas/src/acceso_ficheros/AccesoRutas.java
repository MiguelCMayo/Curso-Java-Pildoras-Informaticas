package acceso_ficheros;

import java.io.*;


public class AccesoRutas {

	public static void main(String[] args) {
		
		File directorio=new File("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras");
		
		System.out.println(directorio.getAbsolutePath());
		
		System.out.println(directorio.exists());
		
		String [] nombres=directorio.list();
		
		for(int i=0;i<nombres.length;i++) {
			
			System.out.println(nombres[i]);
			
			File f=new File(directorio.getAbsoluteFile(),nombres[i]);
			
			if(f.isDirectory()) {  //PARA IMPRIMIR LOS ARCHIVOS DE LAS SUBCARPETAS
				
				String[] archivos_subcarpeta=f.list();
				
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					
					System.out.println(archivos_subcarpeta[j]);
				}
			}
		}


	}

}
