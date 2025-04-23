package Ejercicio8;

public class CircularQueue<T> extends Queue<T> {
	public CircularQueue() {
		super();
	}
	
	public T shift() {
		T dato = super.head();
		super.enqueue(dato);
		return dato;
	}
}