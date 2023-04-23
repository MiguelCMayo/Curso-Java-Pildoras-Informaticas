
public class Arrays_bidimensionales_II {
	

	public static void main(String[] args) {
		
		int [][] matrix= {
				{10,15,18,19,21},
				{86,84,93,63,64},
				{73,12,32,56,23},
				{63,25,75,32,56}
		};
		
		for (int[] fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");
			}
		}
	}
}
