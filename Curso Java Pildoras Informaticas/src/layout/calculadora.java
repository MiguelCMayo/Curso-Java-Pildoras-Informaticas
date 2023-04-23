package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class calculadora {

	public static void main(String[] args) {

		MarcoCalculadora miMarco=new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	
	public MarcoCalculadora(){
		
		setTitle("Calculadora");
		
		setBounds(400,150,300,500);
		
		PanelCalculadora milamina=new PanelCalculadora();

		add(milamina);
		
	
	}
	
}

class PanelCalculadora extends JPanel{
	
		public PanelCalculadora(){
			
			comienzo=true;
			
			setLayout(new BorderLayout());
			
			pantalla = new JTextField("0");

			add(pantalla,BorderLayout.NORTH);
			
			numeracion=new JPanel();
			
			InsertarNumero insertar=new InsertarNumero();
			Operacion realizarOperacion=new Operacion();
			
			numeracion.setLayout(new GridLayout(4,4));

			ponerBoton("7",insertar);
			ponerBoton("8",insertar);
			ponerBoton("9",insertar);
			ponerBotonOperaciones("x",realizarOperacion);
			ponerBoton("4",insertar);
			ponerBoton("5",insertar);
			ponerBoton("6",insertar);
			ponerBotonOperaciones("-",realizarOperacion);
			ponerBoton("1",insertar);
			ponerBoton("2",insertar);
			ponerBoton("3",insertar);
			ponerBotonOperaciones("+",realizarOperacion);
			ponerBoton(",",insertar);
			ponerBoton("0",insertar);
			ponerBotonOperaciones("=",realizarOperacion);
			ponerBotonOperaciones("/",realizarOperacion);
			
			add(numeracion,BorderLayout.CENTER);
		}

		 private void ponerBoton(String textoBoton, InsertarNumero oyente) {
			 
			 JButton boton=new JButton(textoBoton);
			 
			 boton.addActionListener(oyente);
			 
			 numeracion.add(boton);
		 }
		 
		 private void ponerBotonOperaciones(String textoBoton, Operacion oyente) {
			 
			 JButton boton=new JButton(textoBoton);
			 
			 boton.addActionListener(oyente);
			 
			 numeracion.add(boton);
		 }
	 
		private class InsertarNumero implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					
					String entrada=e.getActionCommand();
					
					if(comienzo) {
						
						pantalla.setText(entrada);
						
						comienzo=false;
					}
					else {
						
						pantalla.setText(pantalla.getText()+entrada);
					}

					ultimoValor=Double.parseDouble(pantalla.getText());
					
					
				}
		
		}
		
		private class Operacion implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String operacionPulsada=e.getActionCommand();
				
				if(operacionPulsada.equals("+")) {
				
					resultado+=ultimoValor;
				
					pantalla.setText(""+resultado);
					
					ultimaOperacion="+";
				
				}
				else if(operacionPulsada.equals("x")) {
					
					double valor=Double.parseDouble(pantalla.getText());
					
					if(contador==0) resultado=valor*1;
					
					else resultado*=ultimoValor;
					
					pantalla.setText(""+resultado);
					
					ultimaOperacion="x";
					
					contador++;
					
				}
				else if(operacionPulsada.equals("/")) {
					
					double valor=Double.parseDouble(pantalla.getText());
					
					if(contador==0) resultado=valor*1;
					
					else resultado/=ultimoValor;
					
					pantalla.setText(""+resultado);
					
					ultimaOperacion="/";
					
					contador++;
				}
				
				else if(operacionPulsada.equals("-")) {
					
					double valor=Double.parseDouble(pantalla.getText());
					
					if(contador==0) resultado=valor*1;
					
					else resultado-=ultimoValor;
					
					pantalla.setText(""+resultado);
					
					ultimaOperacion="-";
					
					contador++;
				}
				
				else {
					
					if(ultimaOperacion.equals("+")) resultado+=ultimoValor;
					if(ultimaOperacion.equals("x")) resultado*=ultimoValor; contador=0;
					if(ultimaOperacion.equals("/")) resultado/=ultimoValor; contador=0;
					if(ultimaOperacion.equals("-")) resultado-=ultimoValor; contador=0;
					
					
					pantalla.setText(""+resultado);
					
					ultimoValor=0;
				}
				
				comienzo=true;
			}
			
			private String ultimaOperacion;
			
			private int contador;
			
		}
		
		private JPanel numeracion;
		
		private JTextField pantalla;
		
		private boolean comienzo;
		
		private String ultimaOperacion="";
		
		private double resultado;
		
		private double ultimoValor;
}