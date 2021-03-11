import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos los objetos de clase Fiesta:
		//1- Constructor aleatorio
		Fiesta fiesta1 = new Fiesta();
		Fiesta fiesta2 = new Fiesta();
		//2- Constructor con parámetros
		//Creamos un objeto de tipo LocalDateTime para guardar la fecha 
		LocalDateTime fecha = LocalDateTime.now().plusDays(3);		
		Fiesta fiesta3 = new Fiesta("cumpleaños", fecha, "C/Algarrobo, 5", 30, 30);
		Fiesta fiesta4 = new Fiesta("disfraces", fecha, "C/Cedro, 17", 25, 50);
		
		/////////////
		//invitar()//
		/////////////
		//Llamamos al método invitar() de cada fiesta múltiples veces
		int contador = 0;
		for(contador=0;contador<10;contador++) {
			fiesta1.invitar();
		}
		contador=0;
		while(contador<20) {
			fiesta2.invitar();
			contador++;
		}
		contador=0;
		for(contador=0;contador<5;contador++) {
			fiesta3.invitar();
		}
		fiesta4.invitar();

		//////////////
		//consulta()//
		//////////////
		System.out.println(fiesta1.consulta());
		System.out.println(fiesta2.consulta());
		System.out.println(fiesta3.consulta());
		System.out.println(fiesta4.consulta());
		
		////////////////////////
		//cancelarInvitacion()//
		////////////////////////
		fiesta1.cancelarInvitacion();
		fiesta2.cancelarInvitacion();
		fiesta3.cancelarInvitacion();
		
		fiesta4.cancelarInvitacion();
		fiesta4.cancelarInvitacion();
		
		//////////////////
		//precioFiesta()//
		//////////////////
		System.out.println(fiesta1.precioFiesta());
		System.out.println(fiesta2.precioFiesta());
		System.out.println(fiesta3.precioFiesta());
		System.out.println(fiesta4.precioFiesta());
		
	}

}
