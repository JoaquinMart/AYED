package Ejercicio9;

import java.util.*;

public class ParcialArbol {

	private static boolean recorrido(GeneralTree<Integer> a) {
		if (!a.isLeaf()) {
			List<GeneralTree<Integer>> hijo = a.getHijo();
			int minimo = Integer.MAX_VALUE;
			for (GeneralTree<Integer> i : hijo) {
				if (!recorrido(i)) return false;
				minimo = Math.min(minimo, i.getData());
			}
			return a.getData().equals(minimo);
		} else {
			return true;
		}
	}
	
	public static boolean esDeSeleccion(GeneralTree<Integer> a) {
		if (!a.isEmpty()) {
			return recorrido(a);
		}
		return false;
	}
}