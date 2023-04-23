package pildoras_tutorizado;

public class Uso_Sucursal_Y_Paquetes {

	public static void main(String[] args) {
		
		Sucursal datos_sucursal=new Sucursal();
		
		System.out.println(datos_sucursal.getCiudad());
		
		System.out.println(datos_sucursal.getDireccion());
		
		System.out.println(datos_sucursal.getNumeroSucursal());
		
		Paquete datos_paquete=new Paquete();
		
		System.out.println(datos_paquete.getReferenciaDni());
		
	}

}

class Sucursal{
	
	public Sucursal() {
		
		numeroSucursal=679;
		
		direccion="Calle atocha";
		
		ciudad="Albacete";
		
	}
	
	public String getNumeroSucursal() {
		
		return "El numero de sucursal es: " + numeroSucursal;
		
	}
	
	public String getCiudad() {
		
		return "La ciudad es: " + ciudad;
		
	}
	
	public String getDireccion() {
		
		return "La direccion es: " + direccion;
		
	}
	
	public double CalculaPrecio(Paquete t) {
		
		double precio;
		
		precio=t.getPeso();
		
		if (t.getPrioridad()==1) precio+=10;
		if (t.getPrioridad()==2) precio+=20;
		
		return precio;
			
		}
	
	private int numeroSucursal;
	
	private String direccion;
	
	private String ciudad;
}



class Paquete{
	
	public Paquete() {
		
		referencia_de_envio=968784;
		
		peso=0;
		
		dni="74578903k";
		
		prioridad=1;
	
		
	}
	
	public void setPeso(int peso) {
		
		this.peso=peso;
		
	}
	
	public double getPeso() {
		
		return peso;
		
	}
	
	public double getPrioridad() {
		
		return prioridad;
		
	}
	
	public String getReferenciaDni() {
		
		return "La referencia es: " + referencia_de_envio + ". Y el DNI es: "+ dni;
		
	}
	
	private int referencia_de_envio;
	
	private double peso;
	
	private String dni;
	
	private double prioridad;
	
}