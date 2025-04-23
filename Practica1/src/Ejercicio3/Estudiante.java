package Ejercicio3;

public class Estudiante extends Persona {
	private int comision;
	private String direccion;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String unNombre, String unApellido, int unaComision, String unaDireccion) {
		super(unNombre, unApellido);
		this.comision = unaComision;
		this.direccion = unaDireccion;
	}
	
	public void setComision(int unaComision) {
		this.comision = unaComision;
	}
	
	public int getComision() {
		return this.comision;
	}
	
	public void setDireccion(String unaDireccion) {
		this.direccion = unaDireccion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String tusDatos() {
		return super.tusDatos() + getComision() + " " + getDireccion();
	}
 }