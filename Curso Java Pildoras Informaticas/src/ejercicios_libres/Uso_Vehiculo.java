package ejercicios_libres;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Vehiculo mivehiculo[]=new Vehiculo[6];
		
		mivehiculo[0]=new Coche();
		
		mivehiculo[0].setAcelerar(20);
		System.out.println(mivehiculo[0].getPlazas() + mivehiculo[0].getAcelerar());
		mivehiculo[0].setAcelerar(10);
		System.out.println(mivehiculo[0].getPlazas() + mivehiculo[0].getAcelerar());
		mivehiculo[0].setAcelerar(30);
		System.out.println(mivehiculo[0].getPlazas() + mivehiculo[0].getAcelerar());
		mivehiculo[0].setFrenar(20);
		System.out.println(mivehiculo[0].getPlazas() + mivehiculo[0].getFrenar());
		mivehiculo[0].setFrenar(120);
		System.out.println(mivehiculo[0].getPlazas() + mivehiculo[0].getFrenar());
		System.out.println();
		
		mivehiculo[1]=new Moto();
		
		mivehiculo[1].setAcelerar(20);
		System.out.println(mivehiculo[1].getPlazas() + mivehiculo[1].getAcelerar());
		mivehiculo[1].setAcelerar(10);
		System.out.println(mivehiculo[1].getPlazas() + mivehiculo[1].getAcelerar());
		mivehiculo[1].setAcelerar(30);
		System.out.println(mivehiculo[1].getPlazas() + mivehiculo[1].getAcelerar());
		mivehiculo[1].setFrenar(20);
		System.out.println(mivehiculo[1].getPlazas() + mivehiculo[1].getFrenar());
		mivehiculo[1].setFrenar(120);
		System.out.println(mivehiculo[1].getPlazas() + mivehiculo[1].getFrenar());

	}

}
