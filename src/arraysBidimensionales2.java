
public class arraysBidimensionales2 {

	public static void main(String[] args) {
		
		int [][] miMatriz={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
		
		for(int[] fila: miMatriz) { //convierte cada fila de la matriz bidimensional en una matriz unidimensional
			
			for(int elemento: fila) { //convierte cada elemento de la matriz en una variable
				
				System.out.print(elemento + " ");
			}
			
			System.out.println();
			
		}
		


	}

}
