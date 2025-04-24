package Ejercicio7;

import java.util.*;

public class Caminos {
	private GeneralTree<Integer> arbol;
	
	public Caminos(GeneralTree<Integer> ar) {
		arbol = ar;
	}
	
	private void recorrido(GeneralTree<Integer> a, List<Integer> lista, List<Integer> lmax) {
		if (!a.isEmpty()) {
			lista.add(a.getData());
			if (a.isLeaf()) {
				if (lista.size() > lmax.size()) {
					lmax.clear();
					lmax.addAll(lista);
				}
			} else {
				List<GeneralTree<Integer>> hijo = a.getHijo();
				for (GeneralTree<Integer> i : hijo) {
					recorrido(i, lista, lmax);
					lista.remove(lista.size() - 1);
				}
			}
		} 
	}
	
	public List<Integer> caminoAHojaMasLejana() {
		if (!arbol.isEmpty()) {
			List<Integer> lmax = new LinkedList<Integer>();
			List<Integer> lista = new LinkedList<Integer>();
			recorrido(arbol, lista, lmax);
			return lmax;
		}
		return null;
	}
}