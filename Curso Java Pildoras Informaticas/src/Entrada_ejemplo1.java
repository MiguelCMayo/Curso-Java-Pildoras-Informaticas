import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("introduce edad");
		
		int edad=entrada.nextInt();
		
		System.out.println("hola " + nombre_usuario + ". El año que viene tendras " + edad + " años");

	}

}
