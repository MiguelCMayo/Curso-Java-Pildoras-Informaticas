package poo_abstractas;

import java.util.Arrays;
import java.util.Date;

public class Uso_Personas {

	public static void main(String[] args) {
		
		/*Empleados Juan=new Empleados ("Juan", new Date(546545),2500);
		
		System.out.println(Juan.getNombre());
		System.out.println(Juan.getDescripcion());
		
		Jefes Ana=new Jefes("Ana", new Date(654546), 3500);
		
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion());
		
		Alumnos Maria=new Alumnos("Maria", "Dibujo", "Aula 5");
		
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescripcion());
		
		Jefes David=new Jefes("David", new Date (63739),4800);
		David.setCargo("Director de RRHH");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion()+David.getCargo());*/
		
		Empleados losEmpleados[]=new Empleados[5];
		
		losEmpleados[0]=new Empleados("Juan",new Date(8736793),2500);		
		losEmpleados[1]=new Empleados("Maria",new Date(8736793),1500);	
		losEmpleados[2]=new Empleados("Ana",new Date(8736793),3500);	
		losEmpleados[3]=new Empleados("Sandra",new Date(8736793),6000);	
		losEmpleados[4]=new Empleados("Antonio",new Date(8736793),2100);
		
		Arrays.sort(losEmpleados);
		
		for(Empleados e:losEmpleados) {
			
			System.out.println(e.getDescripcion());	
		}
		
		Jefes Manuel=new Jefes("Manuel", new Date(737383),5000);
		
		Empleados Sonia=new Empleados("Sonia",new Date (837346),3000);
		
		System.out.println("El trabajador "+ Sonia.getNombre()+ " tiene un bonus de "
							+ Sonia.setBonus(500));
		
		
	}
}