package ejercicios_libres;

import java.util.Calendar;

public abstract class Empleados2 {
	
	public Empleados2 (String nombre, String apellidos, String dni, int anyoAlta){
		
		this.nombre=nombre;
		
		this.apellidos=apellidos;
		
		this.dni=dni;
		
		this.anyoAlta=anyoAlta;

	}
	
	public Empleados2 () {
		
		nombre="";
		
		apellidos="";
		
		dni="";
		
		anyoAlta=0;
		
	}
	
	public abstract double getSalario();
	
	
	public void imprimir() {
		
		System.out.print(nombre+apellidos+". DNI: "+dni+ ", año de alta: "+anyoAlta);
		
		System.out.println();
		
	}
	
	public void setDni(String dni) {
		
		this.dni=dni;
		
	}
	
	public String getDni () {
		
		return dni;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setApellidos(String apellidos) {
		
		this.apellidos=apellidos;
		
	}
	
	public String getApellidos() {
		
		return apellidos;
		
	}
	
	public void setAnyoAlta(int anyoAlta) {
		
		this.anyoAlta=anyoAlta;
		
	}
	
	public int getAnyoAlta() {
		
		return anyoAlta;
		
	}
	
	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private int anyoAlta;

}


class EmpleadoAsalariado extends Empleados2{
	
	public EmpleadoAsalariado() {
		
		super();
		
		salario=0;
		
	}
	
	public EmpleadoAsalariado(String nombre, String apellidos, String dni, int anyoAlta,double salario) {
		super(nombre, apellidos, dni, anyoAlta);
		
		this.salario=salario;
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		
		System.out.print("Salario: "+ getSalario()+"\n");
		
		System.out.println();
		
	}
	
	public void setSalario(double salario) {
		
		this.salario=salario;
		
	}
	
	public double getsalarioBase() {
		
		return salario;
	
	}

	public double getSalario() {
		
		int anyo=2022;
		
		int anyosTrabajados;
				
		anyosTrabajados=anyo-getAnyoAlta();
		
		if(anyosTrabajados<0) {
			
			System.out.println("Los años trabajados no pueden ser negativos");
			
		}
		
		if(anyosTrabajados<2) return salario;
		else if(anyosTrabajados>=2 && anyosTrabajados<=3) return salario+(salario*0.07);
		else if(anyosTrabajados>=4 && anyosTrabajados<=8) return salario+(salario*0.11);
		else return salario+(salario*0.77);
		
	}
	
	
	private double salario;
}





class EmpleadoComision extends Empleados2{
	
	public EmpleadoComision() {
		
		comision=0;
		
		clientes=0;
		
	}	
	
	public EmpleadoComision(String nombre,String apellidos, String dni, 
							int anyoAlta, int clientes, double comision) {
		super(nombre, apellidos, dni, anyoAlta);
		this.comision=comision;
		this.clientes=clientes;
	}
	
	public void imprimir() {
		
		super.imprimir();
		
	System.out.println(clientes + " clientes captados a "+ comision+ " euros cada uno.");
	System.out.println("Salario: "+this.getSalario());
	System.out.println();			
	}
	
	public double getSalario() {
		
		double salarioFijo=950;
		
		if(comision*clientes<salarioFijo) return salarioFijo;
		
		else return comision*clientes;
		
	}
	
	private double comision;
	
	private int clientes;
	
}