package Ejercicio6;

import java.util.*;

public class RedAguaPotable {
	private GeneralTree<Character> arbol;
	
	public RedAguaPotable(GeneralTree<Character> ar) {
		arbol = ar;
	}
	
	private double recorridoMinimo(GeneralTree<Character> a, double caudal) {
		double minimo = Double.MAX_VALUE;
		if (!a.isEmpty()) {
			if (a.isLeaf()) {
				return caudal;
			} else {
				double hijos = a.getHijo().size();
				double cantAct = caudal /hijos;
				double cantSig;
				List<GeneralTree<Character>> hijo = a.getHijo();
				for (GeneralTree<Character> i : hijo) {
					cantSig = recorridoMinimo(i, cantAct);
					minimo = Math.min(minimo, cantSig);
				}
			}
		}
		return minimo;
	}
	
	public double minimoCaudal(double caudal) {
		if (!arbol.isEmpty()) {
			return recorridoMinimo(arbol, caudal);
		}
		return 0;
	}
}