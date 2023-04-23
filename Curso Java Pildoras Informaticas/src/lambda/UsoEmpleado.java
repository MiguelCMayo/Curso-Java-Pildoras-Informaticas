package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		ArrayList <Empleado> misEmpleados = new ArrayList<>();
		
		misEmpleados.add(new Empleado("juan", 2500));
		misEmpleados.add(new Empleado("maria", 1500));
		misEmpleados.add(new Empleado("ana", 4500));
		misEmpleados.add(new Empleado("antonio", 500));
		
		//Collections.sort(misEmpleados);
		
		//EXPRESION LAMBDA	
		//Collections.sort(misEmpleados, (Empleado e1, Empleado e2)->e1.getSalario().compareTo(e2.getSalario()));
		
		misEmpleados
			.stream()
			.sorted((e1,e2) -> e1.getSalario().compareTo(e2.getSalario()))
			.filter((Empleado e) -> e.getSalario()<=4000)
			.forEach((Empleado) -> System.out.println(Empleado.getSalario()));
		
		//for(Empleado e: misEmpleados) System.out.println(e.getNombre() + " Salario: " + e.getSalario());
		
		//misEmpleados.forEach((Empleado) -> System.out.println(Empleado.getSalario()));

	}

}
