package Ejercicio6;

public class Transformacion {
	private BinaryTree<Integer> a;
	
	public Transformacion(BinaryTree<Integer> a2) {
		a = a2;
	}
	
	public Transformacion() {
		
	}
	
	private BinaryTree<Integer> recorrido(BinaryTree<Integer> ar) {
		if (ar.hasLeftChild()) {
			recorrido(ar.getLeftChild());
			ar.setData(ar.getData() + ar.getLeftChild().getData());
			ar.getLeftChild().setData(0);
		}
		if (ar.hasRightChild()) {
			ar.setData(ar.getData() + ar.getRightChild().getData());
			ar.getRightChild().setData(0);
			recorrido(ar.getRightChild());
		}
		return ar;
	}
	
	public BinaryTree<Integer> suma() {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>();
		if (!a.isEmpty()) {
			arbol = recorrido(a);
		}
		return arbol;
	}
}