package Ejercicio8;

import java.util.*;

public class Queue<T> {
	public ArrayList<T> data;
	
	public Queue() {
		this.data = new ArrayList<T>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		return data.remove(0);
	}
	
	public T head() {
		return data.get(0);
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean isEmpty() {
		return data == null;
	}
	
	public String toString() {
		String str = "";
		for (T i : data) {
			str = str + i + ", ";
		}
		return str;
	}
}