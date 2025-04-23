package Ejercicio8;

public class ParcialArboles {
	private BinaryTree<Integer> ar;
	
	public ParcialArboles(BinaryTree<Integer> arbol) {
		ar = arbol;
	}
	
	private boolean recorrido(BinaryTree<Integer> prefijo, BinaryTree<Integer> main) {
		boolean estado = true;
		if (prefijo != null) {
			if (prefijo.getData() == main.getData()) {
				if (prefijo.hasLeftChild() && main.hasLeftChild()) {
					estado = recorrido(prefijo.getLeftChild(), main.getLeftChild());
				} else if (prefijo.hasLeftChild() && !main.hasLeftChild()) {
					return false;
				}
				if (prefijo.hasRightChild() && main.hasRightChild()) {
					estado = recorrido(prefijo.getRightChild(),main.getRightChild());
				} else if (prefijo.hasRightChild()&& !main.hasRightChild()) {
					return false;
				}
			} else {
				estado = false;
			}
		}
		return estado;
	}
	
	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		return recorrido(a1, a2);
	}
}