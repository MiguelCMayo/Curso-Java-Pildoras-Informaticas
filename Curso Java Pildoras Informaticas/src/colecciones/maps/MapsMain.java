package colecciones.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsMain {

	public static void main(String[] args) {
		
		HashMap <String,Empleado> listaEmpleados = new HashMap<String,Empleado>();
		
		listaEmpleados.put("04", new Empleado("Miguel"));
		listaEmpleados.put("01", new Empleado("Ana"));
		listaEmpleados.put("22", new Empleado("Paco"));
		
		System.out.println(listaEmpleados);
		
		
		for(Map.Entry<String, Empleado> personaEmpleado: listaEmpleados.entrySet()) {
			String clave = personaEmpleado.getKey();
			Empleado valor = personaEmpleado.getValue();
			
			System.out.println("La clave del empleado es " + personaEmpleado.getKey() + " y su descripcion es " + personaEmpleado.getValue());
		}


	}

}

class Empleado{
	
	private String nombre;
	private double salario;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		salario = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
	
	
	
}