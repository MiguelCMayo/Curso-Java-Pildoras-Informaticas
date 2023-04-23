package pildoras_tutorizado;

import java.util.*;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*Empleados Antonio=new Empleados("Antonio", 2300.5,2005,07,15);
		
		Jefes Ana=new Jefes("Ana",2900,2008,8,9);
		
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());*/
		
		Jefes Juan=new Jefes("Juan", 8000,2013,8,5);
		
		Juan.setIncentivo(200);
		
		Empleados[] losEmpleados=new Empleados[6];
		
		losEmpleados[0]=new Empleados("Antonio",2300.5,2005,7,5);
		
		losEmpleados[1]=new Empleados("Carlos",5000.5,2007,6,5);
		
		losEmpleados[2]=new Empleados("Maria",2500.5,2006,11,7);
		
		losEmpleados[3]=new Empleados("Ana",7000,2009,5,3);
		
		losEmpleados[4]=Juan;    //PRINCIPIO DE SUSTITUCION
		
		losEmpleados[5]=new Jefes("Isabel",8000,2007,4,2);
		
		Jefes Isabel=(Jefes)losEmpleados[5];     //CASTING EXPLICITO
		
		Isabel.setIncentivo(500);
		
	
		
		
		
		/*Jefes Patricia=new Jefes("Patricia",2500,2007,5,6);   //CASTING IMPLICITO
		
		Empleados PatriciaSecretaria=Patricia;    //CASTING IMPLICITO
		
		Empleados Patricia=new Jefes("Patricia",2500,2007,5,6);  //CASTING EXPLICITO
		
		Jefes PatriciaDirectora=(Jefes)Patricia;  */        //CASTING EXPLICITO
		
		
		
		
		
		for (Empleados obj: losEmpleados) {   //BUCLE FOR EACH
			
			System.out.println(obj.getDatosEmpleados()+ " y un salario de: " + obj.getSueldo());
			
			
			
		}
		
		

	}

}


class Empleados{
	
	public Empleados (String nom, double sue,int agno,int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		calendario=new GregorianCalendar(agno,mes,dia);
		
		Id=IdSiguiente;
		
		IdSiguiente++;

	}
	
	public String getDatosEmpleados() {
		
		return "El empleado "+ nombre + " tiene el Id Nº "+ Id;
		
	}
	
	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public GregorianCalendar getFechaAlta() {
		
		return calendario;
		
	}
	
	public void setSubeSalario(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public static String getIdSiguiente() {
		
		return "El Id del siguiente empleado sera: " + IdSiguiente;
		
	}

	private final String nombre;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	private double sueldo;
	
	GregorianCalendar calendario;
	
}



class Jefes extends Empleados{

	public Jefes(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		
	}
	
	public void setIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double getSueldo() {
		
		double sueldoJefe=super.getSueldo();  //EL SUPER LLAMA AL METODO GETSUELDO DE LA SUPERCLASE
		
		return sueldoJefe + incentivo;
		
	}
	
	
	private double incentivo;

}
