package Ejercicio7;

public class ParcialArboles {
	private BinaryTree<Integer> ar;
	
	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.ar = arbol;
	}
	
	private BinaryTree<Integer> recorrido(BinaryTree<Integer> a, int num) {
		BinaryTree<Integer> buscador = new BinaryTree<Integer>();
		if (a.getData() == num) {
			return a;
		} else {
			if (a.hasLeftChild()) {
				buscador = recorrido(a.getLeftChild(), num);
			}
			if (a.hasRightChild()) {
				buscador = recorrido(a.getRightChild(),num);
			}
		} 
		return buscador;
	}
	
	private int totalIzquierda(BinaryTree<Integer> a) {
		int total = 0;
		if (!a.isEmpty()) {
			if ((a.hasLeftChild() && !a.hasRightChild()) || (!a.hasLeftChild() && a.hasRightChild())) {
				total = totalIzquierda(a.getLeftChild()) + totalIzquierda(a.getRightChild()) + 1;
			} else {
				total = totalIzquierda(a.getLeftChild()) + totalIzquierda(a.getRightChild());
			}
		}
		return total;
	}
	
	private int totalDerecha(BinaryTree<Integer> a) {
		int total = 0;
		if (!a.isEmpty()) {
			if ((a.hasLeftChild() && !a.hasRightChild()) || (!a.hasLeftChild() && a.hasRightChild())) {
				total = totalDerecha(a.getLeftChild()) + totalDerecha(a.getRightChild()) + 1;
			} else {
				total = totalDerecha(a.getLeftChild()) + totalDerecha(a.getRightChild());
			}
		}
		return total;
	}
	
	public boolean isLeftTree(int num) {
		BinaryTree<Integer> buscando = new BinaryTree<Integer>();
		boolean estado = false;
		if (!ar.isEmpty()) {
			buscando = recorrido(ar, num);
			if (buscando.getData() == num) {
				if (!buscando.hasRightChild()) {
				 estado = true;
				} else {
					estado = totalIzquierda(buscando.getLeftChild()) > totalDerecha(buscando.getRightChild());					
				}
			}
		}
		return estado;
	}
	
//	private boolean validar(BinaryTree<Integer> a, int izq, int der) {
//		boolean estado = false;
//		if (!a.isEmpty()) {
//			if (a.hasLeftChild()) {
//				if (!a.hasRightChild()) {
//					izq++;
//				}
//				estado = validar(a.getLeftChild(), izq, der);
//			}
//			if (a.hasRightChild()) {
//				
//			}
//		}
//	}
	
}