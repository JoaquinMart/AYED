package Ejercicio1;

public class Ejercicio1 {
	public static void pedidoFor(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(" - " + i);
		}
	}
	
	public static void pedidoWhile(int a, int b) {
		while (a <= b) {
			System.out.print(" - " + a);
			a++;
		}
	}
	
	public static void pedidoSinIterar(int a, int b) {
		if (a <= b) {
			System.out.print(" - " + a);
			pedidoSinIterar(a+1, b);
		}
	}
	
	public static void main(String[] args) {	
		pedidoFor(5,10);
		System.out.println();
		pedidoWhile(10,15);
		System.out.println();
		pedidoSinIterar(15, 20);
	}
}