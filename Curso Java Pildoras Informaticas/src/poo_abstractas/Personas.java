package poo_abstractas;

import java.util.Date; 

abstract class Personas {
	
	public Personas(String nom) {
		
		nombre=nom;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public abstract String getDescripcion();
	
	
	private String nombre;

}

class Empleados extends Personas implements Comparable, ParaTrabajadores{

	public Empleados(String nom, Date fechaAlta, double sueldo) {
		super(nom);
		
		this.fechaAlta=fechaAlta;
		
		this.sueldo=sueldo;
		
	}

	public String getDescripcion() {
		
		return "El empleado "+ this.getNombre() + " tiene un sueldo de: " + sueldo + 
				" €. Y entro a trabajar en " + fechaAlta;
	}
	
	public int compareTo(Object o) {
		
		Empleados otroEmpleado=(Empleados)o;   //CASTING
		
		if (this.sueldo<otroEmpleado.sueldo)return -1;
		if (this.sueldo>otroEmpleado.sueldo)return 1;
		return 0;
	}
	
	public double setBonus(double gratificacion) {
		
		return ParaTrabajadores.bonus+gratificacion;
	}
	
	private double sueldo;
	
	private Date fechaAlta;
	
}

class Jefes extends Empleados implements ParaJefes{

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);
		
	}
	public void setIncentivo(double incentivo) {
		
		this.incentivo=incentivo;
		
	}
	

	public void setCargo(String cargo) {
		
		this.cargo=cargo;
	}

	public String getCargo() {
		
		return "\nAdemas tiene el cargo de: "+ cargo;
	}
	
	public double setBonus(double gratificacion) {
		
		double prima=2000;
		return prima+gratificacion+ParaTrabajadores.bonus;
	}
	
	private double incentivo;
	
	private String cargo;
	
}	

class Alumnos extends Personas{

	public Alumnos(String nom, String optativas,String aula) {
		super(nom);
		
		a_optativas=optativas;
		
		this.aula=aula;
		
	}
	
	public String getDescripcion() {
		
		return "El alumno "+this.getNombre() + " esta en el aula: " + aula + 
				" y ha escogido la asignatura " + a_optativas;
	
	}
	private String a_optativas;
	
	private String aula;
	
}


