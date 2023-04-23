package sockets;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente extends JFrame{

	public Cliente() {
				
		setBounds(150,100,250,325); 	
		setTitle("Cliente");
		
		LaminaCliente laminaCliente=new LaminaCliente();
		add(laminaCliente);
		setVisible(true);
		
		estableceConexionServidor();
		
	}
	
	void estableceConexionServidor() {
		
		try {
			Socket miSocket = new Socket("192.168.1.44",8080);
			EnvioPaqueteDatos datos = new EnvioPaqueteDatos();
			ObjectOutputStream flujoSalidaPaquete = new ObjectOutputStream(miSocket.getOutputStream());
			datos.setTextoCliente(" OnLine");
			flujoSalidaPaquete.writeObject(datos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

class LaminaCliente extends JPanel implements Runnable{
	
	private JTextField campoTexto;
	private JComboBox ip;
	private JLabel nick;
	private Button botonEnviar;
	private JTextArea areaChat;
	
	
	public LaminaCliente () {
		
		nick = new JLabel();
		nick.setText(JOptionPane.showInputDialog("Nick"));
		add(nick);
		
		JLabel cliente = new JLabel("<<OnLine>>");
		add(cliente);
		
		ip = new JComboBox();
		add(ip);
		
		areaChat = new JTextArea(12,20);
		add(areaChat);
		
		campoTexto = new JTextField(20);
		add(campoTexto);

		botonEnviar = new Button("Enviar");
		botonEnviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(campoTexto.getText());
				
				try {
					//creacion del socket (via de comunicacion)
					Socket miSocket = new Socket("192.168.1.44",8080);
					
					EnvioPaqueteDatos datos = new EnvioPaqueteDatos();
					datos.setNick(nick.getText());
					datos.setIp(ip.getSelectedItem().toString());
					datos.setTextoCliente(campoTexto.getText());
					
					//creacion del flujo de datos
					ObjectOutputStream flujoSalidaPaquete = new ObjectOutputStream(miSocket.getOutputStream());
					flujoSalidaPaquete.writeObject(datos);
					
					miSocket.close();
					
					
					//creacion del flujo de datos
					/*DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
					
					flujoSalida.writeUTF(campoTexto.getText());
					flujoSalida.close();*/
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}	
		});
		add(botonEnviar);
		
		Thread miHilo = new Thread(this);
		miHilo.start();

	}

	@Override
	public void run() {
		try {
			ServerSocket escuchaCliente = new ServerSocket(8080);
			
			Socket cliente;
			EnvioPaqueteDatos paqueteRecibido;
			
			while(true) {
				cliente = escuchaCliente.accept();
				
				ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
				paqueteRecibido = (EnvioPaqueteDatos) flujoEntrada.readObject();
				
				if(paqueteRecibido.getTextoCliente().equals(" online")) {
				
					ArrayList<String> IpsJCombo = new ArrayList<>();
					IpsJCombo = paqueteRecibido.getIPs();
					ip.removeAllItems();
					for(String ips: IpsJCombo) ip.addItem(ips);
					
				}else {
					areaChat.append("\n" + paqueteRecibido.getIPs());

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
class EnvioPaqueteDatos implements Serializable{
	
	private String nick, ip, textoCliente;
	private ArrayList<String>IPs;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTextoCliente() {
		return textoCliente;
	}

	public void setTextoCliente(String textoCliente) {
		this.textoCliente = textoCliente;
	}

	public ArrayList<String> getIPs() {
		return IPs;
	}

	public void setIPs(ArrayList<String> iPs) {
		IPs = iPs;
	}
	
	
}
