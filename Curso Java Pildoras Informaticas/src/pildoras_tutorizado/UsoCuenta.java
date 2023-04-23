package pildoras_tutorizado;

import java.util.Random;

public class UsoCuenta {
	
	public static void main (String[] args) {
		
		CuentaCorriente Cuenta1=new CuentaCorriente("Juan", 1500);
		
		CuentaCorriente Cuenta2=new CuentaCorriente("Pablo", 7500);
		
		CuentaCorriente.Transferencia(Cuenta1, Cuenta2, 200);
		
		System.out.println(Cuenta1.getDatosCuenta());
		
		System.out.println(Cuenta2.getDatosCuenta());
	}
	
}

class CuentaCorriente {

	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo) { //CONSTRUCTOR
		
		this.nombreTitular=nombreTitular;
		
		this.saldo=saldo;														
		
		Random rnd=new Random();
		
		numeroCuenta=Math.abs(rnd.nextLong());
		
	}
	
	public void set_ingreso(double ingreso) {     //SETTER
	
		if (ingreso<0) System.out.println("NO SE PERMITEN INGRESOS NEGATIVOS");
		else saldo+=ingreso;
		
	}
	
	public void set_reintegro(double reintegro){    //SETTER
		
		saldo-=reintegro;
		
	}
	
	public String get_saldo() {    //GETTER
		
		return "El saldo de la cuenta es " + saldo;
		
	}
	
	public static void Transferencia(CuentaCorriente titular1, CuentaCorriente titular2, double cantidad) {
		
		titular1.saldo-=cantidad;
		titular2.saldo+=cantidad;
		
	}
	
	public String getDatosCuenta() {    //GETTER
		
		return "Titular: " + nombreTitular + "\n" + 
		"Nº Cuenta: " + numeroCuenta + "\n" +
		"Saldo: " + saldo;
	}

}
