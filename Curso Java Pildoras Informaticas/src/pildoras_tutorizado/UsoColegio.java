package pildoras_tutorizado;

public class UsoColegio {

	public static void main(String[] args) {
		
		Colegio SanJavier=new Colegio("San Javier", 200);
		
		Colegio Cervantes=new Colegio("Cervantes", 300);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		
		SanJavier.nuevoAlumno("Sara", 9);
		
		Cervantes.nuevoAlumno("Ana", 5);
		
		Cervantes.nuevoAlumno("Antonio", 7);
		
		Cervantes.nuevoAlumno( "Mar�a", 3);
		
		Cervantes.expulsaAlumno("Antonio");
		
		Cervantes.setNotaMedia("Mar�a", 9);

		//Cervantes.getTodosAlumnos();
		
		Cervantes.getDatosAlumno("Ana");


	}

}
