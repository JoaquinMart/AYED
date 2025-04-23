package Ejercicio5;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> a;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> ar) {
		a = ar;
	}
	
	public int recorrido(BinaryTree<Integer> arbol, int p, int act) {
		if (act < p) {
			return recorrido(arbol.getLeftChild(), p, act+1) + recorrido(arbol.getRightChild(),p, act+1);
		} else if (act == p) {
			return (arbol.getData());
		} else {
			return 0;
		}
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		if (!a.isEmpty()) {
			suma = recorrido(a, p, 0);
		}
		return suma;
	}
}