package Ejercicio7;

import java.util.*;

public class ListaInvertida {
	public static ArrayList<Integer> invertido(ArrayList<Integer> v, int ini, int fin){
		int aux;
		if (ini < fin ) {
			aux = v.get(ini);
			v.set(ini, v.get(fin));
			v.set(fin, aux);
			return invertido(v, ini + 1, fin - 1);
		}
		return v;
	}
	
	public static void imprimir(ArrayList<Integer> v) {
		for (int i : v) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static void invertirArrayList(ArrayList<Integer> lista) {
		List<Integer> listaInvertida = invertido(lista, 0, lista.size() - 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		vector.add(1);
		vector.add(15);
		vector.add(20);
		vector.add(80);
		vector.add(70);
		vector.add(5);
		imprimir(vector);
		invertirArrayList(vector);
		imprimir(vector);
	}
}