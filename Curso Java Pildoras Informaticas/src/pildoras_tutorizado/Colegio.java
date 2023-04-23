package pildoras_tutorizado;

public class Colegio {
	
	public Colegio(String nombre, int numAlumnos) {
		
		this.nombre=nombre;
		
		arrayAlumnos=new Alumno[numAlumnos];	
	}
	
	public String getNombreColegio() {
		
		return nombre;
		
	}
	
	public Alumno getAlumno(int nAlumno) {
		
		return arrayAlumnos[nAlumno];   //PARA SABER LA POSICION QUE ESTA EL ALUMNO EN EL ARRAY
		
	}
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		
		Alumno nuevoAlumno=new Alumno(this,nombreAlumno,notaAlumno); //THIS HACE REFERENCIA A ESTA CLASE
		
		arrayAlumnos[posicionArray]=nuevoAlumno;
		
		posicionArray++;
		
	}
	
	public void expulsaAlumno(String nombreAlumno) {
		
		for (int i=0; i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) { //EVALUA SI EN LA POSICION DEL ARRAY EXISTE UN ALUMNO
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) { //EVALUA SI COINCIDE EL NOMBRE DEL ALUMNO CON EL NOMBRE DEL ARRAY
					
					arrayAlumnos[i]=null;  // ELIMINA EL OBJETO ALMACENADO EN ESA POSICION
					
				}
				
			}
			
		}
		
	}
	
	public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		
		for (int i=0;i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
					
				}
				
			}
			
		}
		
	}
	
	public void getTodosAlumnos() {
		
		for (int i=0; i<arrayAlumnos.length; i++) {
			
			if(this.getAlumno(i)!=null) {
				
				System.out.println(this.getAlumno(i)); //IMPRIME LOS NOMBRES QUE SE ENCUENTRA EN ARRAY
				System.out.println();
				
			}
			
		}
		
	}
	
	public void getDatosAlumno(String nombreAlumno) {
		
		for (int i=0; i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					System.out.println(this.getAlumno(i));
					System.out.println();
					
				}
				
			}
			
		}
		
	}
	
	
	
	private String nombre;
	
	private Alumno arrayAlumnos[];    //ARRAY PARA ALMACENAR LOS ALUMNOS
	
	private int posicionArray=0;


}
