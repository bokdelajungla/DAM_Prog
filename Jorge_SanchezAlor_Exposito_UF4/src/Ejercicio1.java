
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos dos arrays de enteros
		int [] sueldo = {10000, 20000, 32000, 43000, 50000, 10000, 20000, 30000};
		int [] comision = {0, 0, 0, 0, 0, 1000, 5000, 12000};
		//Creamos otros dos vectores para almacenar la info que nos piden
		double [] subida = new double [sueldo.length];
		double [] aumento = new double [sueldo.length];
		
		//Comprobamos el valor de la dupla sueldo-comisión
		//Bucle FOR para recorrer el vector
		for (int i=0;i<sueldo.length;i++) {
			//Condición: comisión == 0
			if(comision[i] == 0) {
				//Si sueldo<15000
				if(sueldo[i] < 15000) {
					subida[i] = 10;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
				//Si 15000<=sueldo<=30000 
				if(sueldo[i]>=15000 && sueldo[i]<=30000) {
					subida[i] = 8;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
				//Si 30000<sueldo<=45000
				if(sueldo[i]>30000 && sueldo[i]<=45000) {
					subida[i] = 4;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
				//Si sueldo>45000
				if(sueldo[i]>45000) {
					subida[i] = 0;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
							
			}
			//Condición: comision != 0
			else {
				//Si comision < 2000
				if(comision[i]<2000) {
					subida[i] = 12;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
				//Si 2000 <= comision <= 10000
				if(comision[i]>=2000 && comision[i]<=10000) {
					subida[i] = 6;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
				//Si comision > 10000
				if(comision[i]>10000) {
					subida[i] = 0;
					aumento[i] = sueldo[i] * (subida[i]/100);
				}
			}
			
		}//Final FOR
		//Informamos de los resultados
		System.out.println("TABLA DE AUMENTOS");
		System.out.println("SUELDO INICIAL" + "\t" + "% SUBIDA" + "\t" + "IMPORTE AUMENTO");
		for(int i=0; i<sueldo.length; i++) {
			System.out.println(sueldo[i] + "\t\t" + subida[i] + "\t\t" + aumento[i]);
		}
		
	}

}
