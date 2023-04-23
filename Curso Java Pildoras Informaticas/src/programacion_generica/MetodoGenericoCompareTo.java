package programacion_generica;

public class MetodoGenericoCompareTo {

	public static void main(String[] args) {
		
		String nombrePersonas[]= {"Sara","Ana","Maria"};
		
		System.out.println(ExaminaArrays333.getMenor(nombrePersonas));

	}

}

	class ExaminaArrays333{
	
	public static <T extends Comparable> T getMenor(T[]elArray) {
		
		T objetoMenor=elArray[0];
		
		for (int i=1; i<elArray.length;i++) {
			
			if(objetoMenor.compareTo(elArray[i])>0) {
				
				objetoMenor=elArray[i];
			}
		}
		return objetoMenor;
	}
}