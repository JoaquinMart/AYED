package Ejercicio9;

public class ParcialArboles {
	private BinaryTree<Integer> ar;
	
	public ParcialArboles(BinaryTree<Integer> arbol) {
		ar = arbol;
	}
	
	private BinaryTree<Nodo> recorrido(BinaryTree<Integer> a, BinaryTree<Nodo> n) {
		 if (!a.isEmpty()) {
			 if (a.hasLeftChild()) {
				 int suma = a.getData() + a.getLeftChild().getData();
				 int diff = a.getLeftChild().getData() - a.getData();
				 Nodo dato = new Nodo(suma, diff);
				 BinaryTree<Nodo> nuevo = new BinaryTree<Nodo>(dato);
				 n.addLeftChild(nuevo);
				 recorrido(a.getLeftChild(), n.getLeftChild());
			 }
			 if (a.hasRightChild()) {
				 int suma = a.getData() + a.getRightChild().getData();
				 int diff = a.getRightChild().getData() - a.getData();
				 Nodo dato = new Nodo(suma, diff);
				 BinaryTree<Nodo> nuevo = new BinaryTree<Nodo>(dato);
				 n.addRightChild(nuevo);
				 recorrido(a.getRightChild(), n.getRightChild());
			 }
		 }
		 return n;
	}
	
	public BinaryTree<Nodo> sumAndDif(BinaryTree<Integer> a) {
		Nodo dato = new Nodo(a.getData(), a.getData());
		BinaryTree<Nodo> nuevo = new BinaryTree<Nodo>(dato);
		if (!a.isEmpty()) {
			nuevo = recorrido(a, nuevo);
		}
		return nuevo;
	}
}