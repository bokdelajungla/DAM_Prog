import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos el array de String
		String [] titulos = {"El Hobbit",
							"El Se�or de los Anillos",
							"El Silmarillion",
							"Cuentos Inconclusos",
							"Los Hijos de H�rin",
							"Beren y L�thien",
							"La ca�da de Gondolin",
							"Historia de la Tierra Media",
							"Historia de El Se�or de los Anillos "
							};
		//Ordenamos el array de mayor a menor con Arrays.sort()
		Arrays.sort(titulos);
		//Para cada cadena del array:
		for(int i=0;i<titulos.length;i++) {
			//Mostramos la cadena de caracteres
			System.out.println(titulos[i]);
			
			//Longitud del texto
			System.out.println("Longitud: " + titulos[i].length());
			
			//Texto en may�sculas
			System.out.println("May�sculas: " + titulos[i].toUpperCase());
			
			//Texto separado palabras
			System.out.println("Palabra a palabra:");
			//Usamos String.split()
			//Hay que indicar el caracter de separaci�n
			//Devuelve un array de Strings
			String [] palabras = titulos[i].split(" ");
			//Mostramos cada elemento del nuevo array
			for(int j=0;j<palabras.length;j++) {
				System.out.println(palabras[j]);
			}
			
			//N�mero de letras min�sculas
			//Para cada caracter de la cadena hay que comprobar si es min�scula
			//Podemos usar el m�todo String.codePointAt(posicion) para saber el c�digo UNICODE
			//que no ASCII del caracter en esa posicion (por ejemplo � devuelve 241 en vez de 164)
			int minusculas = 0; //Contador de min�sculas
			for(int j=0;j<titulos[i].length();j++) {
				if(esMinuscula(titulos[i].codePointAt(j))){
					minusculas++;
				}
			}
			System.out.println("Hay " + minusculas + " letras min�sculas");
			
			//Tri�ngulo
			System.out.println("EL TRI�NGULO:");
			//Mostramos por pantalla las subcadenas resultantes de ir quitando el �ltimo elemento
			for(int j=(titulos[i].length()-1);j>=0;j--) {
				System.out.println(titulos[i].substring(0, j+1));
				//Hay que sumar uno porque el caracter j est� excluido
			}
			System.out.println(); //Metemos una l�nea de Separaci�n
			
		}

	}
	
	public static boolean esMinuscula(int code) {
		//Los c�digos UNICODE de las min�sculas
		//del 97 al 122 a-z
		//del 224 al 255 min�sculas acentuadas y �
		//salvo 247 que corresponde a �
		if (	((code >= 97) && (code <= 122)) 
			|| ((code >= 224) && (code <= 246))
			|| ((code >= 248) && (code <= 255))
			){
			return true;
		}
		else {return false;}
	}
}
