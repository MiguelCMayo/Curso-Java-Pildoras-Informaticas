package colecciones.Equals_hashcode;

import java.util.Objects;

public class Libro {
	
	private String autor;
	private String titulo;
	private int isbn;
	
	/*public boolean equals(Object obj) {
		
		//HACEMOS UN CASTING DE OBJECT A LIBRO. CONVERTIMOS obj EN LIBRO
		Libro otroLibro=(Libro)obj;
		
		if(obj instanceof Libro) {
			if(this.isbn == otroLibro.isbn) return true;
			else return false;
		}else return false;
	}*/
	
	
	public Libro(String autor, String titulo, int isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn + "]";
	}
	
	
	
	
	
	

}
