package Ejercicio3;

public class Profesor extends Persona {
	private int catedra;
	private String facultad;
	
	public Profesor() {
		super();
	}
	
	public Profesor(String unNombre, String unApellido, int unaCatedra, String unaFacultad) {
		super(unNombre, unApellido);
		this.catedra = unaCatedra;
		this.facultad = unaFacultad;
	}
	
	public void setCatedra(int unaCatedra) {
		this.catedra = unaCatedra;
	}
	
	public int getCatedra() {
		return this.catedra;
	}
	
	public void setFacultad(String unaFacultad) {
		this.facultad = unaFacultad;
	}
	
	public String getFacultad() {
		return this.facultad;
	}
	
	public String tusDatos() {
		return super.tusDatos() + this.getCatedra() + " " + this.getFacultad();
	}
}