package pildoras_tutorizado;

public class Vehiculos {
	
	public Vehiculos(int ruedas) {   //CONSTRUCTOR DE LA CLASE. MISMO NOMBRE QUE LA CLASE
		
		this.ruedas=ruedas;
		
		largo=2;
		
		ancho=1;
		
		peso=2;
		
		color="sin color";
		
	}
	
	public Vehiculos(int ruedas,int largo, double ancho, int peso) {
		
		this.ruedas=ruedas;
		
		this.largo=largo;
		
		this.ancho=ancho;
		
		this.peso=peso;
		
		color="sin color";
		
	}
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador=climatizador;
		
	}
	public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero) {
		
		this.climatizador=climatizador;
		
		this.gps=gps;
		
		this.tapiceria_cuero=tapiceria_cuero;
		
	}
	
	
	
	public String getExtra() {
		
		if(climatizador && gps==false && tapiceria_cuero==false) return "Tu vehiculo lleva el pack 1 de extras";
		else if (climatizador==true && gps==true && tapiceria_cuero==true) return "Tu vehiculo lleva el pack 2 de extras";
		else return "La combinacion escogida no se admite";
		
	}
	
	public void setColor(String color) {  //METODO SETTER QUE ESTABLECE VALOR DE PROPIEDAD
		
		this.color=color;
		
	}
	
	public String getColor() {   //METODO GETTER QUE DEVUELVE VALOR DE PROPIEDAD
		
		return color;
		
	}
	
	public String getDatosVehiculo() {
		
		return "El vehiculo tiene "+ ruedas+ " ruedas."+ " Ademas tiene "+ largo+ " metros de largo";
		
	}
	
	private int ruedas;
	
	private String color;
	
	private int largo;
	
	private double ancho;
	
	private int peso;	
	
	private boolean climatizador;
	
	private boolean tapiceria_cuero;
	
	private boolean gps;

}
