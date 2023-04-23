package programacion_generica;

import java.util.*;

public class EjercicioArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> array=entradaDatos();
		
		double suma=calcularSuma(array);
		
		double media=suma/array.size();
		
		mostrarResultados(array,suma,media);

	}
	
	public static ArrayList<Integer> entradaDatos(){
		
		ArrayList<Integer> datos=new ArrayList();
		
		Scanner entrada=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un entero o 0 para salir");
		
		num=entrada.nextInt();
		
		while(num !=0) {
			
			datos.add(num);
			
			System.out.println("Introduce el numero 0 para salir: ");
			
			num=entrada.nextInt();
		}
		return datos;
	}
	
	public static double calcularSuma(ArrayList<Integer> valores) {
		
		double suma=0;
		
		Iterator it=valores.iterator();
		
		while(it.hasNext()) {
			
			suma=suma+(Integer) it.next();
			
		}
		return suma;
	}
	
	public static void mostrarResultados(ArrayList<Integer> valores, double suma,double media) {
		
		int contador=0;
		
		System.out.println("Valores introducidos: ");
		System.out.println(valores);
		System.out.println("Suma: "+suma);
		System.out.printf("Media: %.2f %n",media);
		
		for (Integer i:valores) {
			if(i>media) {
				contador++;
			}
		}
		System.out.println(contador+" valores superiores a la media");
	}

}

