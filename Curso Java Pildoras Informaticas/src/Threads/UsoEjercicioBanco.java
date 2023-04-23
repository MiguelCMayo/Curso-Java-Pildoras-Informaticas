package Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsoEjercicioBanco {

	public static void main(String[] args) {
		
		Banco b=new Banco();
		for(int i=0; i<100;i++) {
			
			EjecutandoTransferencias r=new EjecutandoTransferencias(b,i,2000);
			
			Thread t=new Thread(r);
			
			t.start();
		}

	}

}

class Banco{
	
	private final double[] cuentas;
	
	private Lock bloqueaBanco=new ReentrantLock();
	
	private Condition saldoSuficiente;
	
	
	public Banco() {
		
		cuentas=new double[100];
		
		for(int i=0;i<100;i++) {
			
			cuentas[i]=2000;
		}
		
		saldoSuficiente=bloqueaBanco.newCondition();
	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino,double cantidad) throws InterruptedException {
		
		bloqueaBanco.lock();
		
		try {
		
			//if(cuentas[cuentaOrigen]<cantidad) return; //EVITA QUE SE HAGA LA TRANSFERENCIA SI NO HAY DINERO SUFICIENTE
			
			while(cuentas[cuentaOrigen]<cantidad) saldoSuficiente.await();
			
			System.out.println(Thread.currentThread()); //INFORMA DEL HILO DE LA TRANSFERENCIA ANTES DE QUE TENGA EFECTO
			
			cuentas[cuentaOrigen]-=cantidad;
			
			System.out.printf("%10.2f de %d para la cuenta %d", cantidad, cuentaOrigen,cuentaDestino);
			
			System.out.println();
			
			cuentas[cuentaDestino]+=cantidad;
			
			//System.out.println(cantidad + " € de la cuenta " + cuentaOrigen + " a la cuenta " + cuentaDestino);
			
			//System.out.println(getSaldoTotal());
			
			System.out.printf("Saldo total: %10.2f%n",getSaldoTotal());
			
			saldoSuficiente.signalAll();
			
		}finally {
			
			bloqueaBanco.unlock();
		}
		
		
	}
	
	public double getSaldoTotal() {
		
		double sumaSaldoBanco=0;
		
		for(double a: cuentas) {
			
			sumaSaldoBanco+=a;
	
		}
		
		return sumaSaldoBanco;
	}
}

class EjecutandoTransferencias implements Runnable{
	
	private Banco miBanco;
	
	private int cuentaDeOrigen;
	
	private double cantidadMaxima;
	

	public EjecutandoTransferencias(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
		this.miBanco = miBanco;
		this.cuentaDeOrigen = cuentaDeOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}





	@Override
	public void run() {
		
		while(true) {
			
			int cuentaDeDestino=(int)(Math.random()*100);
			
			double cantidadATransferir=cantidadMaxima*Math.random();
			try {
			
				miBanco.transferencia(cuentaDeOrigen, cuentaDeDestino, cantidadATransferir);
			
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}