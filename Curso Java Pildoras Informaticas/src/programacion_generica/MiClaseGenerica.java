package programacion_generica;

public class MiClaseGenerica<T> {
	
	private T objeto;
	
	
	public MiClaseGenerica() {
		
		objeto=null;
			
	}
	
	public void setObjeto(T nuevoValor) {
		
		objeto=nuevoValor;
	}
	
	public T getObjeto() {
		
		return objeto;
	}

}
