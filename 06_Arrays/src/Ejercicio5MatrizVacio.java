
public class Ejercicio5MatrizVacio {

	public static void main(String[] args) {
		String [][] plazas = new String[4][4];
		for(int i=0;i<plazas.length;i++) {
			for(int j=0;j<plazas.length;j++) {
				plazas[i][j]="libre";
			}
		}
		for(int i=0;i<plazas.length;i++) {
			for(int j=0;j<plazas.length;j++) {
				System.out.println();;
			}
		}
		
		//Arrays Amorfos
		String [][] cine = new String [3][];
		cine[0] = new String[15];
		cine[1] = new String[10];
		cine[2] = new String[8];
		for(int i=0;i<cine.length;i++) {
			System.out.println("FILA: "+ i);
			for(int j=0;j<cine[i].length;j++) {
				System.out.println(cine[i][j]);
			}
		}
	}

}
