package colecciones.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<>();
		
		personas.add("Ana");
		personas.add("Paco");
		personas.add("Miguel");
		personas.add("Maria");
		
		System.out.println(personas);
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		it.next();
		it.add("Antonio");

		System.out.println(personas);

	}

}
