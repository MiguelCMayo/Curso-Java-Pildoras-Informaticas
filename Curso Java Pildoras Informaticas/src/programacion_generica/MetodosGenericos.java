package programacion_generica;


public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombrePersonas[]= {"Sara","Antonio","Maria"};
		
		System.out.println(ExaminaArrays.getElementos(nombrePersonas));
		
		
		
		Empleado[] losEmpleados=new Empleado[4];
		
		losEmpleados[0]=new Empleado("Antonio",2300.5,2005,7,5);
		
		losEmpleados[1]=new Empleado("Carlos",5000.5,2007,6,5);
		
		losEmpleados[2]=new Empleado("Maria",2500.5,2006,11,7);
		
		losEmpleados[3]=new Empleado("Ana",7000,2009,5,3);
		
		System.out.println(ExaminaArrays.getElementos(losEmpleados));

	}

}

class ExaminaArrays{
	
	public static <T> String getElementos(T[]elArray) {
		
		return "El array tiene " + elArray.length + " elementos";
	}
}