package colecciones.Equals_hashcode;

import java.util.*;

public class ClientesMain {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Antonio Lopez","0001",25000);
		Cliente cliente2 = new Cliente("Ana Lopez","0002",15000);
		Cliente cliente3 = new Cliente("Paco Lopez","0003",200000);		
		Cliente cliente4 = new Cliente("Miguel Lopez","0004",20);
		
		Cliente cliente5 = new Cliente("Antonio Lopez","0001",40000);
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();
		
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		clientesDelBanco.add(cliente5);
		
		//BORRAR UN CLIENTE CON UN ITERADOR:
		Iterator<Cliente> it = clientesDelBanco.iterator();
		while(it.hasNext()) {
			String nombreCliente = it.next().getNombre();
			if(nombreCliente.equals("Ana Lopez")) it.remove();
			//System.out.println(nombreCliente);
		}
		
		
		for(Cliente datos: clientesDelBanco) {
			System.out.println(datos.getNombre() + " " + datos.getnCuenta() + " " + datos.getSaldo());
		}
		
		/*Iterator<Cliente> it = clientesDelBanco.iterator();
		while(it.hasNext()) {
			String nombreCliente = it.next().getNombre();
			System.out.println(nombreCliente);
		}*/

	}

}
