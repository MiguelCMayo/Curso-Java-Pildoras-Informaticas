package ejercicios_libres;

public class Coche implements Vehiculo{
	
	private int velocidad_inicial;
	
	public Coche() {
		
		velocidad_inicial=80;
		
	}

	public String getPlazas() {
		
		return "Este coche tiene 5 plazas.";
	}
	
	public void setAcelerar(int acelerar) {
		
		velocidad_inicial+=acelerar;
		
	}
	
	public String getAcelerar() {
		
		if (velocidad_inicial<=0)return " El coche esta parado";
		if(velocidad_inicial<=velocidad_maxima)return " El coche ha acelerado y la velocidad actual es "  + velocidad_inicial;
		else return " El coche ha acelerado y la velocidad ha sido sobrepasada";
		
	}
	
	public void setFrenar(int frenar) {
		
		velocidad_inicial-=frenar;
		
	}
	
	public String getFrenar() {
		
		if (velocidad_inicial<=0)return " El coche ha frenado y esta parado";
		if(velocidad_inicial<=velocidad_maxima)return " El coche ha frenado y la velocidad actual es "  + velocidad_inicial;
		else return " El coche ha frenado y la velocidad sigue sobrepasada";
		
	}

}


class Moto implements Vehiculo{
	
	private int velocidad_inicial;
	
	public Moto() {
		
		velocidad_inicial=40;
		
	}
	
	public String getPlazas() {
		
		return "Esta moto tiene 2 plazas.";
	}
	
	public void setAcelerar(int acelerar) {
		
		velocidad_inicial+=acelerar;
		
	}
	
	public String getAcelerar() {
		
		if (velocidad_inicial<=0)return " La moto a frenado y esta parada";
		if(velocidad_inicial<=velocidad_maxima)return " La moto a acelerado y la velocidad actual es "  + velocidad_inicial;
		else return " La moto a acelerado y la velocidad ha sido sobrepasada";
	}
	
	public void setFrenar(int frenar) {
	
		velocidad_inicial-=frenar;
	}
	
	public String getFrenar() {
		
		if (velocidad_inicial<=0)return " La moto ha frenado y esta parada";
		if(velocidad_inicial<=velocidad_maxima)return " La moto a acelerado y la velocidad actual es "  + velocidad_inicial;
		else return " La moto a acelerado y la velocidad ha sido sobrepasada";
	}
	
	
	
}
