
public class pruebaArrays {

	public static void main(String[] args) {
		
		int [] miMatriz = new int[5];
		
		miMatriz[0]=5;
		miMatriz[1]=38;
		miMatriz[2]=-15;
		miMatriz[3]=92;
		miMatriz[4]=71;
		
		/* o también
		int [] miMatriz = {5, 38, -15, 92, 71}
		
		/*System.out.println(miMatriz[0]);
		System.out.println(miMatriz[1]);
		System.out.println(miMatriz[2]);
		System.out.println(miMatriz[3]);
		System.out.println(miMatriz[4]);*/
		
		//es mejor un for cuando hay muchos elementos
		
		for(int i=0; i<miMatriz.length; i++) {
			
			System.out.println("Valor del índice " + i + " = " + miMatriz[i]);
		}
		
		

	}

}
