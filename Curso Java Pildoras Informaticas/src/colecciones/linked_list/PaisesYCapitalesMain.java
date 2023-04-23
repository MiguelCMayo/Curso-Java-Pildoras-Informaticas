package colecciones.linked_list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PaisesYCapitalesMain {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<>();
		paises.add("España");
		paises.add("Francia");
		paises.add("Italia");
		paises.add("Alemania");
		
		LinkedList<String> capitales = new LinkedList<>();
		capitales.add("Madrid");
		capitales.add("Paris");
		capitales.add("Roma");
		capitales.add("Berlin");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> itPaises = paises.listIterator();
		ListIterator<String> itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) itPaises.next();
			itPaises.add(itCapitales.next());
		}
		
		System.out.println(paises);
		
		itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
			
		}
		
		System.out.println(capitales);
		
		

	}

}
