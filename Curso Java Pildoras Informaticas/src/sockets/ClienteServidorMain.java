package sockets;

import javax.swing.JFrame;

public class ClienteServidorMain {

	public static void main(String[] args) {
		
		Cliente ventanaCliente = new Cliente();
		ventanaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoServidor ventanaServidor = new MarcoServidor();
		ventanaServidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
