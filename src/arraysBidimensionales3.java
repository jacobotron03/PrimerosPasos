
public class arraysBidimensionales3 {

	public static void main(String[] args) {

		double [][] saldo = new double[6][5];
		double acumulado;
		double interes = 0.10;
		
		for (int i=0;i<6;i++) {
			
			saldo[i][0]=10000;
			acumulado=10000;
			
			for (int j=1;j<5;j++) {
				
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
				
			}
			
			interes+=0.01;
		}
		
		for (double[] fila:saldo) {
			
			for (double elemento:fila) {
				
				System.out.printf("%1.2f", elemento);
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		
		

	}

}
