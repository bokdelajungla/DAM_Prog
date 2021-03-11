
public class PruebasArrays {

	public static void main(String[] args) {
		
		int [] vector = {1,2,3};
		int [][] matriz1 = {
				{2,7,4},
				{4,5,6},
				{6,1,7}
		};
		//Recorrer vector:
		for (int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println("\n");
		
		//Recorrer Matriz:
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("La suma de todos los elementos de la matriz es: "+ sumaTotal(matriz1));
		
		System.out.println("La suma de la diagonal de la matriz es: "+ sumaDiagonal(matriz1));
		
		System.out.println("La suma de los elementos menos la diagonal es: "+ sumaNoDiagonal(matriz1));
	}
	
	public static int sumaTotal (int [][] matriz) {
		int suma = 0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}
	
	public static int sumaDiagonal (int [][] matriz) {
		int suma = 0;
		for(int i=0;i<matriz.length;i++) {
			suma += matriz[i][i];
		}
		return suma;
	}
	
	public static int sumaNoDiagonal (int [][] matriz) {
		int suma = 0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				/*
				if (j!=i) {
					suma += matriz[i][j];
				}
				*/
				if(i==j) continue; //continue termina la iteración actual y continua con la siguiente
				suma += matriz[i][j];
			}
		}
		return suma;
	}

}
