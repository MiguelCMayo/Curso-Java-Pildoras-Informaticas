package colecciones.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		/*TreeSet<String> ordenaGente = new TreeSet<>();
		
		ordenaGente.add("Oscar");
		ordenaGente.add("Maria");
		ordenaGente.add("Ana");
		
		for(String g: ordenaGente) {
			
			System.out.println(g);
		}*/
		
		System.out.println("Aqui estan ordenados segun el numero de producto");
		
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>();
		
		Productos pr3 = new Productos(3,"Tercer producto");
		Productos pr1 = new Productos(1,"Primer producto");
		Productos pr2 = new Productos(2,"Segundo Producto");
		
		ordenaProductos.add(pr3);
		ordenaProductos.add(pr1);
		ordenaProductos.add(pr2);
		
		for(Productos p: ordenaProductos) {
			System.out.println(p.getDescripcion());
		}
		
		System.out.println("Aqui estan ordenados segun el numero de caracteres de la descripcion");
		
		Productos comparadorPr = new Productos();
		TreeSet<Productos> ordenaProductos2 = new TreeSet<Productos>(comparadorPr);
		
		Productos pr6 = new Productos(3,"Tercer tercer producto");
		Productos pr4 = new Productos(1,"Primer");
		Productos pr5 = new Productos(2,"Segundo Producto");
		
		ordenaProductos2.add(pr6);
		ordenaProductos2.add(pr4);
		ordenaProductos2.add(pr5);
		
		for(Productos p: ordenaProductos2) {
			System.out.println(p.getDescripcion());
		}
		
		
		
	}	
}

class Productos implements Comparable<Productos>,Comparator<Productos>{

	private int nProducto;
	private String descripcion;
	
	public Productos() {
	}

	public Productos(int nProducto, String descripcion) {
		this.nProducto = nProducto;
		this.descripcion = descripcion;
	}

	public int getnProducto() {
		return nProducto;
	}

	public void setnProducto(int nProducto) {
		this.nProducto = nProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Productos pr) {
		return nProducto - pr.nProducto;
	}

	@Override
	public int compare(Productos o1, Productos o2) {
		int carac1 = o1.getDescripcion().length();
		int carac2 = o2.getDescripcion().length();
		if(carac1 < carac2) return -1;
		else if (carac1>carac2) return 1;
		else return 0;
	
	}
	
}