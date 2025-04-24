package Ejercicio2;

import java.util.*;

public class RecorridosAG {
	
	private boolean esImpar(Integer dato) {
		return (dato % 2 != 0);
	}
	
	private boolean esMayor(Integer dato, Integer n) {
		return (dato > n);
	}
	
	private void recorridoPreOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		if (!a.isEmpty()) {
			int num = a.getData();
			if (esImpar(num) && esMayor(num, n)) {
				lista.add(num);
			}
			List<GeneralTree<Integer>> hijoAct = a.getHijo();
			for (GeneralTree<Integer> i : hijoAct) {
				recorridoPreOrden(i, n, lista);
			}
		}
	}
	
	public List<Integer> imparesMayoresPreOrden(GeneralTree<Integer> a, Integer n) {
		if (!a.isEmpty()) {
			List<Integer> lista = new LinkedList<Integer>();
			recorridoPreOrden(a, n, lista);
			return lista;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
	
	private void recorridoInOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		if (!a.isEmpty()) {
			List<GeneralTree<Integer>> hijo = a.getHijo();
			if (a.hasChildren()) {
				recorridoInOrden(hijo.get(0), n, lista);
			}
			int actual = a.getData();
			if (esImpar(actual) && esMayor(actual, n)) {
				lista.add(actual);
			}
			for (int i = 1; i < hijo.size(); i++) {
				recorridoInOrden(hijo.get(i), n, lista);
			}
		}
	}
	
	public List<Integer> imparesMayoresInOrden(GeneralTree<Integer> a, Integer n) {
		if (!a.isEmpty()) {
			List<Integer> lista = new LinkedList<Integer>();
			recorridoInOrden(a, n, lista);
			return lista;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
	
	private void recorridoPostOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		if (!a.isEmpty()) {
			List<GeneralTree<Integer>> hijo = a.getHijo();
			for (GeneralTree<Integer> i : hijo) {
				recorridoPostOrden(i, n, lista);
			}
			int num = a.getData();
			if (esImpar(num) && esMayor(num, n)) {
				lista.add(num);
			}
		}
	}
	
	public List<Integer> imparesMayoresPostOrden(GeneralTree<Integer> a, Integer n) {
		if (!a.isEmpty()) {
			List<Integer> lista = new LinkedList<Integer>();
			recorridoPostOrden(a, n, lista);
			return lista;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
	
	private void recorridoPorNiveles(GeneralTree<Integer> a, Integer n,  List<Integer> lista) {
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		queue.enqueue(a);
		GeneralTree<Integer> arbolActual;
		while (!queue.isEmpty()) {
			arbolActual = queue.dequeue();
			Integer datoActual = arbolActual.getData();
			if (esImpar(datoActual) && esMayor(datoActual, n)) {
				lista.add(datoActual);
			}
			List<GeneralTree<Integer>> hijoAct = arbolActual.getHijo();
			for (GeneralTree<Integer> i : hijoAct) {
				queue.enqueue(i);
			}
		}
	}
	
	public List<Integer> imparesMayoresPorNiveles(GeneralTree<Integer> a, Integer n) {
		if (!a.isEmpty()) {
			List<Integer> lista = new LinkedList<Integer>();
			recorridoPorNiveles(a, n, lista);
			return lista;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
}