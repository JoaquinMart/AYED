package Ejercicio6;

public class Ejercicio6 {
	public static void toString(BinaryTree<Integer> a) {
		if (!a.isEmpty()) {
			if (a.hasLeftChild()) {
				toString(a.getLeftChild());
			}
			System.out.print(a.getData() + " - ");
			if (a.hasRightChild()) {
				toString(a.getRightChild());
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(1);
		BinaryTree<Integer> a1 = new BinaryTree<>(2);
		BinaryTree<Integer> a2 = new BinaryTree<>(3);
		a.addLeftChild(a1);
		a.addRightChild(a2);
		// ---------------------------rama izquierda-------------------------------
		BinaryTree<Integer> a4 = new BinaryTree<>(4);
		a1.addRightChild(a4);
		// ---------------------------rama derecha-------------------------------
		BinaryTree<Integer> a9 = new BinaryTree<>(5);
		BinaryTree<Integer> a10 = new BinaryTree<>(6);
		a2.addLeftChild(a9);
		a2.addRightChild(a10);

		BinaryTree<Integer> a11 = new BinaryTree<>(7);
		BinaryTree<Integer> a12 = new BinaryTree<>(8);
		a9.addLeftChild(a11);
		a9.addRightChild(a12);
		
		Transformacion t = new Transformacion(a);
		BinaryTree<Integer> arbol = t.suma();
		toString(arbol);
	}
}