package lambda;

public class Empleado{
	
	private String nombre;
	private double salario;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/*@Override
	public int compareTo(Object o) {

		Empleado otroEmpleado = (Empleado)o;
		
		if(this.salario < otroEmpleado.salario) return -1;
		
		if(this.salario > otroEmpleado.salario) return 1;
		
		return 0;
	}*/
	
	

}
