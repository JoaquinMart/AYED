package Ejercicio9;

public class Nodo {
	private int suma;
	private int diff;
	
	public Nodo(int unaSuma, int unaDiff) {
		suma = unaSuma;
		diff = unaDiff;
	}
	
	public int getSuma() {
		return suma;
	}
	
	public void setSuma(int unaSuma) {
		suma = unaSuma;
	}
	
	public int getDiff() {
		return diff;
	}
	
	public void setDiff(int unaDiff) {
		diff = unaDiff;
	}
}