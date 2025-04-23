package Ejercicio7;

import java.util.*;

public class SumaLista {
	public static int sumarLinkedList(LinkedList<Integer> lista, int i ) {
		if (i == lista.size()) {
			return 0;
		} else {
			return lista.get(i) + sumarLinkedList(lista, i+1); 
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(5);
		lista.add(10);
		lista.add(15);
		lista.add(1);
		System.out.println("Total (31): " + sumarLinkedList(lista, 0));
	}
}