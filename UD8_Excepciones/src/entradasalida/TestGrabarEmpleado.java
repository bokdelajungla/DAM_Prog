package entradasalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;;

public class TestGrabarEmpleado {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Empleado empleado = new Empleado(114,"Rafaeli",25_000);
		System.out.println(empleado);
		
		ObjectOutputStream oos =
				new ObjectOutputStream(
						new FileOutputStream("D:\\Documentos\\DAM\\Programacion I\\Java\\UD8_Excepciones\\empleado.obj"));
		oos.writeObject(empleado);
		oos.close();
		
		System.out.println("objeto grabado con éxito en el fichero");

		try {
			Empleado empleado2 = leerEmpleado("D:\\Documentos\\DAM\\Programacion I\\Java\\UD8_Excepciones\\empleado.obj");
			System.out.println("Empleado leído del fichero: "+ empleado2);
			
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Im Zorry");
		}
		
		System.out.println("Proceso terminado");
	}

	public static Empleado leerEmpleado(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream(fichero));
		return (Empleado)ois.readObject();
		
		
		
	}
}
