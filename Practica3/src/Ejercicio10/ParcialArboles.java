package Ejercicio10;

import java.util.*;

public class ParcialArboles {
	
	private static void recorrido(GeneralTree<Integer> a, List<Integer> lista, List<Integer> lmax, int nivel, int[] maxTotal, int totAct) {
		if (!a.isEmpty()) {
			boolean agregado = false;
			if (a.getData() == 1) {
				lista.add(a.getData());
				agregado = true;
			}
			totAct = totAct + a.getData() * nivel;
			if (a.isLeaf()) {
				if (totAct > maxTotal[0]) {
					maxTotal[0] = totAct;
					lmax.clear();
					lmax.addAll(lista);
				}
			} else {
				List<GeneralTree<Integer>> hijo = a.getHijo();
				for (GeneralTree<Integer> i : hijo) {
					recorrido(i, lista, lmax, nivel+1, maxTotal, totAct);
				}
			}	
			if (agregado) {
				lista.remove(lista.size() - 1);
			}
		}
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		List<Integer> lista = new LinkedList<Integer>();
		List<Integer> lmax = new LinkedList<Integer>();
		int[] maxTotal = new int[1];
		if (!arbol.isEmpty()) {
			recorrido(arbol, lista, lmax, 0, maxTotal, 0);
		} 
		return lmax;
	}
}