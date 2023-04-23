package ejercicios_libres;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Uso_Eventos {

	public static void main(String[] args) {

		MarcoFoco mimarco=new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setBounds(300,150,400,300);
		
		add(new LaminaMarcoFoco());
		
	}
}

class LaminaMarcoFoco extends JPanel{
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		campoTexto1=new JTextField();
		
		campoTexto2=new JTextField();
		
		campoTexto3=new JTextField();
		
		etiq1= new JLabel("Usuario");
		
		etiq2= new JLabel("Contraseña");
		
		etiq3= new JLabel("Email");
		
		etiq1.setBounds(70, 10, 150, 20);
		
		etiq2.setBounds(47, 50, 150, 20);
		
		etiq3.setBounds(80, 90, 150, 20);
		
		add(etiq1);
		
		add(etiq2);
		
		add(etiq3);
		
		campoTexto1.setBounds(120, 10, 150, 20);
		
		campoTexto2.setBounds(120, 50, 150, 20);
		
		campoTexto3.setBounds(120, 90, 150, 20);
		
		add(campoTexto1);
		
		add(campoTexto2);
		
		add(campoTexto3);
		
		EventosDeFoco foco=new EventosDeFoco();
		
		campoTexto1.addFocusListener(foco);
		
		campoTexto2.addFocusListener(foco);
		
		campoTexto3.addFocusListener(foco);
	}
	
	class EventosDeFoco implements FocusListener{

		public void focusGained(FocusEvent e) {
			
			
		}

		public void focusLost(FocusEvent e) {
			
		//	campoTexto2.setColumns(5);
			
			String contraseña=campoTexto2.getText()	;
			
			if(e.getSource()==campoTexto2) {
				
				for(int i=0;i<contraseña.length();i++) {
					
					
					}
					if(contraseña.length()<5 && contraseña.length()>0) {
						
						JOptionPane.showConfirmDialog(getParent(),"La contraseña es insegura");
					
						campoTexto2.setText("5 O MAS DIGITOS");
						
						campoTexto2.requestFocus();	
					
				}
				
			}
			
			int arroba=0;
			
			boolean punto=false;
			
			String mail=campoTexto3.getText();
			
			if(mail.length()>0) {
				
				for(int i=0; i<mail.length(); i++) {
				
					if(mail.charAt(i)=='@') {
					
						arroba++;
					}
					if(mail.charAt(i)=='.') {
					
						punto=true;
					}
				}
			
				if(arroba==1 && punto==true && mail.length()>0) {
				
					System.out.println("Email correcto");
				}
				else {
					
					JOptionPane.showConfirmDialog(getParent(),"El email es incorrecto");
				
					campoTexto3.setText("EMAIL INCORRECTO");
				
					campoTexto3.requestFocus();
					
				}
			
			}

		}
		
	}
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	
	private JLabel etiq1,etiq2,etiq3;
}


