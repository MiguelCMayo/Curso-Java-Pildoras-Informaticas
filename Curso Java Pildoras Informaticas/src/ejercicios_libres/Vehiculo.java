package ejercicios_libres;

public interface Vehiculo {
	
	int velocidad_maxima=120;
	
	public abstract String getPlazas();
	
	public abstract void setAcelerar(int acelerar);
	
	public abstract String getAcelerar();

	public abstract void setFrenar(int frenar);
	
	public abstract String getFrenar();

}
