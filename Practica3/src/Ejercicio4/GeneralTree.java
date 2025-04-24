package Ejercicio4;

import java.util.*;

public class GeneralTree<T> {
	private T data;
	private List<GeneralTree<T>> hijo;

	public GeneralTree() {
		
	}
	
	public GeneralTree(T dato) {
		data = dato;
	}
	
	public GeneralTree(T dato, List<GeneralTree<T>> lista) {
		data = dato;
		hijo = lista;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T dato) {
		data = dato;
	}
	
	public List<GeneralTree<T>> getHijo() {
		return hijo;
	}
	
	public void setHijo(List<GeneralTree<T>> lista) {
		hijo = lista;
	}
	
	public void addChild(GeneralTree<T> nodo) {
		if (hijo == null) {
			hijo = new ArrayList<>();
		}
		hijo.add(nodo);
	}
	
	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return hijo != null && !hijo.isEmpty();
	}
	
	public boolean isEmpty() {
		return data == null && !this.hasChildren();
	}
	
	public void removeChild(GeneralTree<T> nodo) {
		if (hijo != null) {
			hijo.remove(nodo);
		}
	}
	
	private int recorridoAltura(GeneralTree<T> a) {
		if (a.isLeaf()) {
			return 0;
		} else {
			int nivel, max = 0;
			List<GeneralTree<T>> child = a.getHijo();
			for (GeneralTree<T> i : child) {
				nivel = recorridoAltura(i) + 1;
				max = Math.max(nivel, max);
			}
			return max;
		}
	}
	
	public int altura() {
		if (!isEmpty()) {
			int n = 0;
			n = recorridoAltura(this);
			return n;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
	
	private int recorridoNivel(GeneralTree<T> a, T n) {
		if (a.getData().equals(n)) {
			return 0;
		}
		List<GeneralTree<T>> child = a.getHijo();
		for (GeneralTree<T> i : child) {
			int nivel = recorridoNivel(i, n);
			if (nivel != -1) {
				return nivel + 1;
			}
		} 
		return -1;
	}
	
	public int nivel(T n) {
		if (!isEmpty()) {
			int total = recorridoNivel(this, n);
			return total;
		} else {
			throw new IllegalArgumentException("Arbol vacio");
		}
	}
	
	public int ancho() {
		int max = 0;
		if (!this.isEmpty()) {
			Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
			int nodos = 0;
			queue.enqueue(this);
			while (!queue.isEmpty()) {
				nodos = queue.size();
				max = Math.max(nodos, max);
				for (int i = 0; i < nodos; i++) {
					GeneralTree<T> act = queue.dequeue();
					if (act.hasChildren()) {
						List<GeneralTree<T>> hijoAct = act.getHijo();
						for (GeneralTree<T> j : hijoAct) {
							queue.enqueue(j);
						}
					}
				}
			}
		}
		return max;
	}
}