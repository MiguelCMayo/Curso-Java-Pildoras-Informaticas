package pildoras_tutorizado;

public class UsoVehiculos {

	public static void main(String[] args) {
		
		Vehiculos miCoche=new Vehiculos(4);
		
		miCoche.setColor("Azul");
		
		System.out.println(miCoche.getColor());
		
		Vehiculos miCoche2=new Vehiculos(4);
		
		miCoche2.setColor("rojo");
		
		System.out.println(miCoche2.getColor());
		
		miCoche2.setExtra(true,true,true);
		
		System.out.println(miCoche2.getExtra());
		
		Vehiculos moto1=new Vehiculos(2);
		
		System.out.println(miCoche.getDatosVehiculo());
		
		System.out.println(moto1.getDatosVehiculo());
		
		Vehiculos miMoto=new Vehiculos(2,1,0.3,200);
		
		miMoto.setColor("gris");
				
		Vehiculos miCamion= new Vehiculos (6,3,1.5,3500);
		
		miCamion.setColor("verde");
		
		miCamion.setExtra(true, true, true);
		
		System.out.println(miCamion.getExtra());
		
		System.out.println(miCamion.getDatosVehiculo());

	}

}
