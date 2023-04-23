package sockets;

import java.awt.BorderLayout;
import java.awt.Button;
import java.io.DataInputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MarcoServidor extends JFrame implements Runnable{
	
	private JTextArea areaTexto;
	
	public MarcoServidor()  {
		
		setBounds(600,100,250,325);				
		setTitle("Servidor");
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areaTexto=new JTextArea();
		
		milamina.add(areaTexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true); 
		
		Thread miHilo = new Thread(this);
		miHilo.start();
		
	}

	@Override
	public void run() {
		
		try {
			ServerSocket miServidor = new ServerSocket(8080); //puerto a la escucha
			
			String nick, ip, mensaje;
			
			ArrayList<String>listaIpConectados = new ArrayList<String>();
			
			EnvioPaqueteDatos paqueteRecibido;
			
			while(true) {
				Socket miSocket = miServidor.accept(); //acepta todas las conexiones que viajan por el socket
				
				
				
				
				
				
				//flujo entrada de datos
				ObjectInputStream flujoEntradaPaquete = new ObjectInputStream(miSocket.getInputStream());
				paqueteRecibido = (EnvioPaqueteDatos)flujoEntradaPaquete.readObject();
				
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
				mensaje = paqueteRecibido.getTextoCliente();

				//flujo entrada de datos
				/*DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
			
				String mensajeTexto = flujoEntrada.readUTF();
				areaTexto.append("\n" + mensajeTexto);
			
				miSocket.close();*/
				
				
				if(!mensaje.equals(" online")) {
					
					areaTexto.append("\n" + "nick" + " : " + nick + " Mensaje: " + mensaje + " Ip: " + ip);
				
					Socket reenvioDestinatario = new Socket(ip,8080);
					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(reenvioDestinatario.getOutputStream());
					paqueteReenvio.writeObject(paqueteRecibido);
					reenvioDestinatario.close();
				
					miSocket.close();
				}else {
					//DETECTAR LA IP DEL CLIENTE
					InetAddress dirClientes = miSocket.getInetAddress();
					String ipClientesConectados = dirClientes.getHostAddress();
					System.out.println("Direccion remota conestada: " + ipClientesConectados);
					
					listaIpConectados.add(ipClientesConectados);
					paqueteRecibido.setIPs(listaIpConectados);
					
					for(String ipC: listaIpConectados) {
						System.out.println(ipC);
						
						Socket reenvioDestinatario = new Socket(ipC,8080);
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(reenvioDestinatario.getOutputStream());
						paqueteReenvio.writeObject(paqueteRecibido);
						reenvioDestinatario.close();
					
						miSocket.close();
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
class LaminaServidor extends JPanel {
	
	private JTextArea areaTexto;
	
	public LaminaServidor () {
		
		setBounds(1200,300,280,350);				
		
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areaTexto=new JTextArea();
		
		milamina.add(areaTexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		

	}

}