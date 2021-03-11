import java.util.ArrayList;

public class TestProducto {
	
	public static void main (String[] args) {
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Producto producto = new Producto(1, "caca", 10);
		lista.add(producto);
		lista.add(new Producto(2,"zurullo",15));
		lista.add(new Producto(3,"truño",20));
		lista.add(new Producto(4,"tordo",25));
		
		
		System.out.println(lista.size());
		lista.remove(producto);
		System.out.println(lista.size());

		//Mantener lista sin duplicados
		if(!lista.contains(producto)) {
			lista.add(producto);
		}
		else System.out.println("El producto ya está en la lista");
		
		System.out.println(lista.size());
	}

}
