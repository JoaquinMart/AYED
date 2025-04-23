package Ejercicio7;

public abstract class Persona {
	private String nombre;
	private String apellido;
	
	public Persona() {
		
	}
	
	public Persona(String unNombre, String unApellido) {
		this.apellido = unApellido;
		this.nombre = unNombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String unApellido) {
		this.apellido = unApellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String tusDatos() {
		return (this.getNombre() + " " + this.getApellido() + " ");
	}
}