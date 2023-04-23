package ejercicios_libro_java;

import java.util.Scanner;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		
		/*Scanner obj=new Scanner(System.in);
		
		String espacio=" ", asterisco="*";
		
		int x=0;
		
		System.out.println("Nivel de la piramide: ");
		
		x=obj.nextInt();
		
		for (int i=1; i<=x; i++) {
		
			for(int espacios=x-i; espacios>0; espacios--)
				System.out.print(espacio);
		
			for(int lineas=1; lineas<2*i; lineas++)
				System.out.print(asterisco);
				System.out.println(" ");*/
				
				final int n = 5;
				 
		        // Hacer para cada fila
		        for (int i = 1; i <= n; i++)
		        {
		            // espacio de impresión
		            for (int j = i; j < n; j++) {
		                System.out.print(' ');
		            }
		 
		            // impresión '*'
		            for (int k = 1; k < 2*i; k++)
		            {
		                // imprime '*' para los límites
		                if (i == n || (k == 1 || k == 2*i - 1)) {
		                    System.out.print('*');
		                }
		                else {
		                    System.out.print(' ');
		                }
		            }
		 
		            // pasar a la siguiente linea
		            System.out.print(System.lineSeparator());
		        }		
		
		}

	}


