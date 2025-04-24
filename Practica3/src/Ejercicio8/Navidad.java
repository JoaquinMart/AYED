package Ejercicio8;

import java.util.*;

public class Navidad {
	private GeneralTree<Integer> arbol;
	
	public Navidad(GeneralTree<Integer> ar) {
		arbol = ar;
	}
	

	private boolean helperAbeto(GeneralTree<Integer> a) {
	    int cantHojas = 0;
	    List<GeneralTree<Integer>> childActual = a.getHijo();
	    int i = 0;
	    boolean cumple = true; 
	    while (i < childActual.size() && cumple) {
	        GeneralTree<Integer> child = childActual.get(i);
	        if (child.isLeaf()) {
	            cantHojas++;
	        } else {
	            if (!helperAbeto(child)) {  cumple = false; }
	        }
	        i++; 
	    }
	    return cumple && cantHojas >= 3; 
	}
	
	public String esAbetoNavidenio() {
		String estado = "No";
		if((arbol != null) && (!arbol.isEmpty())) {
			if(helperAbeto(arbol)) {
				estado = "Si";
			}
		}
		return estado;
	}
}