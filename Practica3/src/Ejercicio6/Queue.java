package Ejercicio6;

import java.util.*;

public class Queue<T> extends Sequence {
	private List<T> data;
	
	public Queue() {
		data = new ArrayList<T>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		if (!data.isEmpty()) {
			return data.remove(0);
		} else {
			throw new IllegalStateException("La cola está vacía");
		}
	}
	
	public T head()  {
		if (!data.isEmpty()) {
			return data.get(0);
		} else {
			throw new IllegalStateException("La cola está vacía");
		}
	}
	
	@Override
	public int size() {
		return data.size();
	}
	
	@Override
	public boolean isEmpty() {
		return data.size() == 0;
	}
}