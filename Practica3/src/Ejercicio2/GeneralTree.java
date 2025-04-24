package Ejercicio2;

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
	
	public int altura() {
		// HACER
		return 0;
	}
	
	public int nivel(T n) {
		// HACER
		return 0;
	}
	
	public int ancho() {
		// HACER
		return 0;
	}
}