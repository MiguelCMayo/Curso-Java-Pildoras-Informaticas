package programacion_generica;

import java.util.*;

public class ArrayListEmpleados {

	public static void main(String[] args) {
		
		ArrayList <Empleado> listaEmpleados=new ArrayList <Empleado>();
		
		//listaEmpleados.ensureCapacity(12);  //PARA DECIR LA CAPACIDAD DEL ARRAYLIST
		
		listaEmpleados.add(new Empleado("Antonio",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Carlos",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Maria",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Ivan",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Francisco",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Vicente",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Paco",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Miguel",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Lola",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Ana",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Ramona",2300,2005,6,8));
		listaEmpleados.add(new Empleado("Sandra",2300,2005,6,8));
		
		//REEMPLAZAR ELEMENTOS: BORRA A CARLOS(1) E INSERTA A JORGE
		
		listaEmpleados.set(1, new Empleado("Jorge",2300,2005,6,8));
		
		//listaEmpleados.trimToSize();    //AJUSTA EL ARRAYLIST AL NUMERO DE ELEMENTOS
		
		System.out.println(listaEmpleados.size());   //TE DICE EL NUMERO DE ELEMENTOS
		
		
		/*for(Empleado obj: listaEmpleados) {
			
			System.out.println(obj.toString());
		}*/
		
		//System.out.println(listaEmpleados.get(3)); //PARA IMPRIMIR UNA POSICION DEL ARRAYLIST

		
		//PARA METER EL ARRAYLIST DENTRO DE UN ARRAY NORMAL
		
		/*Empleado EmpleadosArray[]=new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(EmpleadosArray);
		
		for (int i=0; i<EmpleadosArray.length;i++) {
			
			System.out.println(EmpleadosArray[i]);
		}*/
		
		//USO DE ITERADORES
		
		Iterator<Empleado> IteratorEmpleado=listaEmpleados.iterator();
		
		while (IteratorEmpleado.hasNext()) System.out.println(IteratorEmpleado.next()); //MIENTRAS SIGA HABIENDO ELEMENTOS MUESTRAME EL SIGUIENTE ELEMENTO
		
	}

}
class Empleado {

	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public String toString(){
		
		return "El Nombre es " + nombre + ",y su sueldo es " + sueldo + ", fecha de contrato " + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;
	
}