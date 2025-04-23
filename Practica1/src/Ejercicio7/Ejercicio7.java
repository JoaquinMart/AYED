package Ejercicio7;

import java.util.*;

public class Ejercicio7 {
	public static void puntoD() {
		String nombre, apellido, direccion;
		int comision;
		ArrayList<Estudiante> v = new ArrayList<Estudiante>();
		for (int i = 0; i < 3; i++) {
			nombre = "Nombre " + i;
			apellido = "Apellido " + i;
			comision = i;
			direccion = "Direccion " + i;
			Estudiante e = new Estudiante(nombre, apellido, comision, direccion);
			v.add(e);
		}
		// D.2 - NUEVA LISTA COPIA	
		
		ArrayList<Estudiante> v2 = v;
		
		// D.3 - IMPRIMIR LISTA
		
		System.out.println(); System.out.println("Imprimiendo lista.");
		for (Estudiante i : v) { System.out.println(i.tusDatos()); }
		
		// D.4 - MODIFICAR VALOR
		
		nombre = "Modificado";
		apellido = "Modificado";
		comision = 0;
		direccion = "Modificado";
		Estudiante primero = v.get(0);
		primero.setNombre(nombre);
		primero.setApellido(apellido);
		primero.setComision(comision);
		primero.setDireccion(direccion);
		
		System.out.println(); System.out.println("Imprimiendo lista.");
		for (Estudiante i : v) { System.out.println(i.tusDatos()); }
		
		// PUNTO E - AGREGAR SI NO ESTA
	
		boolean esta = false;
		Estudiante est = new Estudiante("Modificado","Modificado",0,"Modificado");
		for (Estudiante i : v) { if (i.equals(est)) { esta = true; } }
		if (!esta) { v.add(est); }
		
		System.out.println(); System.out.println("Imprimiendo lista.");
		for (Estudiante i : v) { System.out.println(i.tusDatos()); }
	}
	
	// PUNTO E - ES CAPICUA
	public static boolean Capicua(ArrayList<Integer> vector) {
		boolean esCapicua = true;
		int i = vector.size() / 2;
		for (int j = vector.size() / 2; j < vector.size(); j++) {
			if (vector.get(j) != vector.get(i)) {
				esCapicua = false;
			}
			i--;
		}
		return esCapicua;
	}
		
	
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(2);
		v.add(1);
		puntoD();
		System.out.println(Capicua(v));
	}
	
}