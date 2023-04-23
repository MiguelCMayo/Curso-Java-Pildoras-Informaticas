package ejercicios_libres;

public class Uso_Empleados2 {

	public static void main(String[] args) {
		
		Empleados2[] misEmpleados=new Empleados2[4];
		
		misEmpleados [0]= new EmpleadoAsalariado("Antonio ", "Lopez", "6546546Z",2014,5000);
		misEmpleados [1]= new EmpleadoComision("Sandra ","Nieto","7879879S",2011,169,7.10);
		
		EmpleadoComision Manuel=new EmpleadoComision("Manuel ","Ruiz","4654654D",2010,35,6.90);
		EmpleadoAsalariado Maria=new EmpleadoAsalariado("Maria ","Ramos","77879878F",2011,2500);
		
		misEmpleados[2]=Manuel;
		misEmpleados[3]=Maria;
		
		for (Empleados2 obj: misEmpleados) {
			
			obj.imprimir();
		}
	}

}
