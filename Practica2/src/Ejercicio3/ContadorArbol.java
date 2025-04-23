package Ejercicio3;

import java.util.*;	

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol() {
		
	}
	
	public ContadorArbol(BinaryTree<Integer> a) {
		this.arbol = a;
	}
	
	private boolean esPar(int n) {
		return (n % 2 == 0);
	}
	
	public ArrayList<Integer> inOrden(BinaryTree<Integer> a, ArrayList<Integer> v) {
		if (!this.arbol.isEmpty()) {
			if (arbol.hasLeftChild()) {
				inOrden(arbol.getLeftChild(), v);
			}
			if (arbol.hasRightChild()) {
				inOrden(arbol.getRightChild(), v);
			}
			if (esPar(arbol.getData()) ) {
				v.add(arbol.getData());
			}
		}
		return v;
	}
	
	public ArrayList<Integer> postOrden(BinaryTree<Integer> a, ArrayList<Integer> v) {
		if (!this.arbol.isEmpty()) {
			 if (arbol.hasLeftChild()) {
				 postOrden(arbol.getLeftChild(), v);
			 }
			 if (esPar(arbol.getData())) {
				 v.add(arbol.getData());
			 }
			 if (arbol.hasRightChild()) {
				 postOrden(arbol.getRightChild(), v);
			 }
		}
		return v;
	}
	
	public ArrayList<Integer> numerosParesIn() {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		if (!this.arbol.isEmpty()) {
			vector = inOrden(this.arbol, vector);
		}
		return vector;
	}
	
	public ArrayList<Integer> numerosParesOn() {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		if (!this.arbol.isEmpty()) {
			vector = postOrden(this.arbol, vector);
		}
		return vector;
	}
}