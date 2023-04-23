package Threads;

public class SincronizandoHilos {

	public static void main(String[] args){
		
		SincronizaThreads hilo1= new SincronizaThreads();
		
		SincronizaThreads2 hilo2= new SincronizaThreads2(hilo1);
		
		hilo1.start();
		
		hilo2.start();
		
		
		/*//EL METODO JOIN OBLIGA AL PROGRAMA A TERMINAR UN HILO ANTES DE EMPEZAR OTRO
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo2.start();*/
		
		System.out.println("Hemos terminado las tareas");
		
		

	}

}


class SincronizaThreads extends Thread{
	
	public void run() {
		
		for(int i=0;i<20;i++) {
			
			System.out.println("Ejecutando thread: " + getName());
			
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class SincronizaThreads2 extends Thread{
	
	public SincronizaThreads2(Thread thread) {
		this.thread = thread;
	}
	
	public void run() {
		
		try {
			thread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0;i<20;i++) {
			
			System.out.println("Ejecutando thread: " + getName());
			
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private Thread thread;
}