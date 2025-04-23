package Ejercicio2;

import java.util.*;

public class Ejercicio2 {
	public static ArrayList<Integer> vector(int n) {
		int i = 1;
		ArrayList<Integer> v = new ArrayList<Integer>(n);
		while (i <= n) {
			int numero = n * i;
			v.add(numero);
			i++;
		}
		return v;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un numero n: ");
		int n = s.nextInt();
		ArrayList<Integer> v = vector(n);
		System.out.print("[ ");
		for (Integer i : v) {
			System.out.print(i + ", ");
		}
		System.out.print(" ]");
	}
}