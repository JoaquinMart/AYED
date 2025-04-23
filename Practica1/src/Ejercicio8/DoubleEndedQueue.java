package Ejercicio8;

import java.util.*;

public class DoubleEndedQueue<T> extends Queue<T> {
	
	public DoubleEndedQueue() {
		super();
	}
	
	public void enqueueFirst(T dato) {
		super.data.add(0, dato);
	}
}