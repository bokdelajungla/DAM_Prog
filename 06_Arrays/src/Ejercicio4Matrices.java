
public class Ejercicio4Matrices {
	public static void main (String args[]) {
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		//-------------------
		//Recorrer la matriz
		//-------------------
		System.out.println("Antes del bucle, 1 vez");
		int sumafila = 0;
		
		for (int i=0; i<matriz.length;i++) {
			//Reincio acumulador
			sumafila = 0;
			System.out.println("FILA -> "+ (i+1));
			for (int j=0; j<matriz[i].length;j++) {
				sumafila += matriz[i][j];
				System.out.println("COLUMNA -> "+ (j+1) + " FILA -> "+(i+1) + " :" + matriz[i][j]);
				
			}
			System.out.println("Una vez por cada FILA al final");
			System.out.println("Suma de la fila: " + sumafila);
		}
		System.out.println("Después de los bucles, 1 vez");
		
		//------------------
		//Sumar la diagonal
		//------------------
		int sumadiag = 0;
		for (int i=0; i<matriz.length;i++) {
			sumadiag += matriz[i][i]; 
		}
		System.out.println("La suma de la diagonal es: " + sumadiag);
		
		//-------------------------
		//Hacer ceros la diagonal
		//-------------------------
		//Presentar la matriz
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		//Crear array auxiliar
		int [][] aux = matriz;
		for (int i=0;i<matriz.length;i++) {
			aux[i][i] = 0;
		}
		System.out.println();
		//Presentar la matriz
		for (int i=0; i<aux.length;i++) {
			for (int j=0; j<aux[i].length;j++) {
				System.out.print(aux[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
