
public class arraysBidimensionales {

	public static void main(String[] args) {
		
		int [][] matrix = new int[4][5];
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[0][3]=4;
		matrix[0][4]=5;
		
		matrix[1][0]=6;
		matrix[1][1]=7;
		matrix[1][2]=8;
		matrix[1][3]=9;
		matrix[1][4]=10;
		
		matrix[2][0]=11;
		matrix[2][1]=12;
		matrix[2][2]=13;
		matrix[2][3]=14;
		matrix[2][4]=15;
		
		matrix[3][0]=16;
		matrix[3][1]=17;
		matrix[3][2]=18;
		matrix[3][3]=19;
		matrix[3][4]=20;
		
		for(int i=0;i<4;i++) { //i<4 porque el primer for recorrerá la primera dimensión de la matriz
			
			for(int j=0;j<5;j++) { //j<5 porque este for recorrerá la segunda dimensión de la matriz
				
				System.out.print(matrix[i][j] + " ");
				
			}
			
			/*el bucle comienza en i=0 y pasa seguidamente al segundo for, para el que j es igual a 0,
			 * cuando est� en el segundo for se ejecuta entero hasta llegar a j=5 y despu�s continua con el
			 * primer for que a�n no hab�a finalizado, de forma que se ejecuta las otras 3 veces que le
			 * quedaban al primer for y el primer valor pasa a ser de 0 a 1. Volver� a ejecutarse el segundo
			 * for con los valores j del valor i=1 y as� sucesivamente hasta finalizar el primer for
			 */
			
			
		}
		

	}

}
