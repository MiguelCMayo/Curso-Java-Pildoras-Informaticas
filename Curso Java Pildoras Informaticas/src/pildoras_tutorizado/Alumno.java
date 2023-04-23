package pildoras_tutorizado;

public class Alumno {
	
	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
		
		this.nombreColegio=nombreColegio;
		
		this.nombreAlumno=nombreAlumno;
		
		this.notaMedia=notaMedia;
		
		nAlumno=numeroAlumno;
		
		numeroAlumno++;
	}
	
	public void setNotaMedia(double notaMedia) {
		
		this.notaMedia=notaMedia;
		
	}
	
	public String toString() {   //LE DICE AL PROGRAMA QUE INFORMACION TIENE QUE MOSTRAR CUANDO LE DECIMOS QUE IMPRIMA UN OBJETO		
		return "Nombre Alumno: " + nombreAlumno + "\nColegio: " +
		this.getNombreColegioAlumno()+ "\nNº Alumno: " + nAlumno +
		"\nNota media: "+ notaMedia;
	
	}
	
	private String getNombreColegioAlumno() { 
		
		return this.nombreColegio.getNombreColegio();
		
	}
	
	public String getNombreAlumno() {
		
		return nombreAlumno;
		
	}
	
	
	
	
	private Colegio nombreColegio;
	
	private String nombreAlumno;
	
	private double notaMedia;
	
	private static int numeroAlumno=1;   //STATIC SIGNIFICA QUE PERTENECE A LA CLASE Y NO A NINGUN OBJETO
	
	private int nAlumno;

}
