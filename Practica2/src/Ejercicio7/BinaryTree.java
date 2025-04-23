package Ejercicio7;

public class BinaryTree<T> {
	private T dato;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
		
	}
	
	public BinaryTree(T dato) {
		this.dato = dato;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public T getData() {
		return this.dato;
	}
	
	public void setData(T unDato) {
		this.dato = unDato;
	}
	
	public BinaryTree<T> getLeftChild() {
		if (this.leftChild != null) {
			return this.leftChild;			
		} else {
			throw new IllegalStateException ("No tiene hijo izquierdo");
		}
	}
	
	public BinaryTree<T> getRightChild() {
		if (this.rightChild != null) {
			return this.rightChild;			
		} else {
			throw new IllegalStateException ("No tiene hijo derecho");
		}
	}
	
	public void addLeftChild(BinaryTree<T> hijo) {
		this.leftChild = hijo;
	}
	
	public void addRightChild(BinaryTree<T> hijo) {
		this.rightChild = hijo;
	}
	
	public void removeLeftChild() {
		this.leftChild = null;
	}
	
	public void removeRightChild() {
		this.rightChild = null;
	}
	
	public boolean isEmpty() {
		return (this.dato == null);
	}
	
	public boolean isLeaf() {
		return !this.isEmpty() && !this.hasLeftChild() && !this.hasRightChild();
	}
	
	public boolean hasLeftChild() {
		return this.leftChild != null;
	}
	
	public boolean hasRightChild() {
		return this.rightChild != null;	
	}
	
	public int contarHojas() {
		int suma = 0;
		if (this.dato == null) {
			return 0;
		} else {
			if (this.isLeaf()) {
				return 1;
			} else {
				if (this.hasLeftChild()) {
					suma = suma + this.getLeftChild().contarHojas();
				}
				if (this.hasRightChild()) {
					suma = suma + this.getRightChild().contarHojas();
				}
			}
		}
	
		return suma;
	}
	
	public BinaryTree<T> espejo() {
		BinaryTree<T> a = new BinaryTree<T>();
		if (!this.isEmpty()) {
			if (this.hasLeftChild()) {
				a.addLeftChild(this.getLeftChild().espejo());
			}
			if (this.hasRightChild()) {
				a.addRightChild(this.getRightChild().espejo());
			}
		}
		return a;
	}
	
//	public void entreNiveles(int n, int m) {
//		if (!this.isEmpty()) {
//			
//		}
//	}
}