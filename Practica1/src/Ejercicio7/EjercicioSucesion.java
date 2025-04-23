package Ejercicio7;

import java.util.*;

public class EjercicioSucesion {

	public static void recursividad(List<Integer> lista, int n) {
		if (n != 1) {
			lista.add(n);
			if ((n % 2) == 0) {
				recursividad(lista, (n / 2));
			} else {
				recursividad(lista, (3*n) + 1);
			}
		} else {
			lista.add(n);
		}
	}
	
	public static List<Integer> calcularSucesion(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		recursividad(lista, n);
		return lista;
	}
	
	public static void main(String[] args) {
		List<Integer> lista = calcularSucesion(6);
		for (int i : lista) {
			System.out.print(i + " - ");
		}
	}
}