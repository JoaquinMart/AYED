package Ejercicio4;

public class RedBinariaLlena<T> {
	private BinaryTree<Integer> a;
	
	public RedBinariaLlena() {
		
	}
	
	public RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.a = arbol;
	}
	
	public int mayor(int izq, int der) {
		int actual = 0;
		if (izq > der) {
			actual = izq;
		} else {
			actual = der;
		}
		return actual;
	}
	
	public int recorrido(BinaryTree<Integer> ar) {
		int izq = 0, der = 0;
		if (ar.hasLeftChild()) {
			izq = recorrido(ar.getLeftChild());
		} 
		if (ar.hasRightChild()) {
			der = recorrido(ar.getRightChild());
		}
		return (mayor(izq, der) + ar.getData());
	}
	
	public int retardoReenvio() {
		int suma = 0;
		if (!a.isEmpty()) {
			suma = recorrido(a);
		}
		return suma;
	}
}