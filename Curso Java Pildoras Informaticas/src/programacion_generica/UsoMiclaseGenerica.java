package programacion_generica;

public class UsoMiclaseGenerica {

	public static void main(String[] args) {
		
		MiClaseGenerica<String> miObjeto1=new MiClaseGenerica<String>();
		
		miObjeto1.setObjeto("Juan");
		
		System.out.println(miObjeto1.getObjeto());
		
		
		
		MiClaseGenerica<Persona> miObjeto2= new MiClaseGenerica<Persona>();
		
		Persona ella=new Persona("Maria");
		
		miObjeto2.setObjeto(ella);
		
		System.out.println(miObjeto2.getObjeto());

	}

}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String toString() {
		
		return nombre;
	}
	
	private String nombre;
}