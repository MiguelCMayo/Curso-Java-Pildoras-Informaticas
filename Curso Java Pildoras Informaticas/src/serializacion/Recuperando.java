package serializacion;

import java.io.*;

public class Recuperando {

	public static void main(String[] args) {
		
		try {
			
			ObjectInputStream flujoEntrada= new ObjectInputStream (new FileInputStream("C:\\Users\\Miguel\\Documents\\Curso de Java\\pildoras\\miObjetoSerializado"));
			
			Empleado[] entradaObjeto=(Empleado[])flujoEntrada.readObject();
			
			flujoEntrada.close();
			
			for(Empleado e: entradaObjeto) {
				
				System.out.println(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
