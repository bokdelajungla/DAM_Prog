import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos el array de String
		String [] titulos = {"El Hobbit",
							"El Señor de los Anillos",
							"El Silmarillion",
							"Cuentos Inconclusos",
							"Los Hijos de Húrin",
							"Beren y Lúthien",
							"La caída de Gondolin",
							"Historia de la Tierra Media",
							"Historia de El Señor de los Anillos "
							};
		//Ordenamos el array de mayor a menor con Arrays.sort()
		Arrays.sort(titulos);
		//Para cada cadena del array:
		for(int i=0;i<titulos.length;i++) {
			//Mostramos la cadena de caracteres
			System.out.println(titulos[i]);
			
			//Longitud del texto
			System.out.println("Longitud: " + titulos[i].length());
			
			//Texto en mayúsculas
			System.out.println("Mayúsculas: " + titulos[i].toUpperCase());
			
			//Texto separado palabras
			System.out.println("Palabra a palabra:");
			//Usamos String.split()
			//Hay que indicar el caracter de separación
			//Devuelve un array de Strings
			String [] palabras = titulos[i].split(" ");
			//Mostramos cada elemento del nuevo array
			for(int j=0;j<palabras.length;j++) {
				System.out.println(palabras[j]);
			}
			
			//Número de letras minúsculas
			//Para cada caracter de la cadena hay que comprobar si es minúscula
			//Podemos usar el método String.codePointAt(posicion) para saber el código UNICODE
			//que no ASCII del caracter en esa posicion (por ejemplo ñ devuelve 241 en vez de 164)
			int minusculas = 0; //Contador de minúsculas
			for(int j=0;j<titulos[i].length();j++) {
				if(esMinuscula(titulos[i].codePointAt(j))){
					minusculas++;
				}
			}
			System.out.println("Hay " + minusculas + " letras minúsculas");
			
			//Triángulo
			System.out.println("EL TRIÁNGULO:");
			//Mostramos por pantalla las subcadenas resultantes de ir quitando el último elemento
			for(int j=(titulos[i].length()-1);j>=0;j--) {
				System.out.println(titulos[i].substring(0, j+1));
				//Hay que sumar uno porque el caracter j está excluido
			}
			System.out.println(); //Metemos una línea de Separación
			
		}

	}
	
	public static boolean esMinuscula(int code) {
		//Los códigos UNICODE de las minúsculas
		//del 97 al 122 a-z
		//del 224 al 255 minúsculas acentuadas y ñ
		//salvo 247 que corresponde a ÷
		if (	((code >= 97) && (code <= 122)) 
			|| ((code >= 224) && (code <= 246))
			|| ((code >= 248) && (code <= 255))
			){
			return true;
		}
		else {return false;}
	}
}
