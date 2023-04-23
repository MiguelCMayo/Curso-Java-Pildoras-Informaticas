package ejercicios_libres;

import pildoras_tutorizado.Alumno;

public class ArrayAnimales {

	public static void main(String[] args) {

		Animales[] array_animales=new Animales[5];
		
		array_animales[0]=new Animales("cebra");
		
		array_animales[1]=new Animales("leon");
		
		array_animales[2]=new Animales("mono");
		
		array_animales[3]=new Animales("jirafa");
		
		array_animales[4]=new Animales("tigre");
		
		
		for (int i=0; i<array_animales.length; i++) {
			
				array_animales[i].getAnimal();
				
		}
	}
}	
	
class Animales{
	
	public Animales(String nombre) {
		
		this.nombre=nombre;
		
		Id=numeroId;
		
		numeroId++;
		
	}
	
	public void getAnimal(){
        
		System.out.println("El animal es: " + nombre + ". Y su numero es: "+ Id);
    }
	
	private String nombre;
	
	private int Id;
	
	private static int numeroId=1;

}
