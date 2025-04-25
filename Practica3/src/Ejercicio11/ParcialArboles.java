package Ejercicio11;

public class ParcialArboles {
	
	public static boolean resolver(GeneralTree<Integer> a) {
		if (a.isEmpty()) return false;
		Queue<GeneralTree<Integer>> cola = new Queue<>();
		cola.enqueue(a);;
		int nivel = 0;
		while (!cola.isEmpty()) {
			int nodos = cola.size();
			if (nivel != 0 && nodos != nivel + 1) {
				return false;
			}
			for (int i = 0; i < nodos; i++) {
				GeneralTree<Integer> act = cola.dequeue();
				for (GeneralTree<Integer> hijo : act.getHijo()) {
					cola.enqueue(hijo);
				}
			}
			nivel++;
		}
		return true;
	}
}