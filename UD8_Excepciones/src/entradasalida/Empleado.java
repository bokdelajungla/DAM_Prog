package entradasalida;

import java.io.Serializable;

public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private int salario;
	
	
	public Empleado(int id, String nombre, int salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	public double salarioMensual() {
		return salario/14;
	}
	public double salarioMensual(int meses) {
		return salario/meses;
	}
	
	
}
