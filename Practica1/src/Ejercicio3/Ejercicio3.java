package Ejercicio3;

import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("Probando git");
		Scanner s = new Scanner(System.in);
		String nombre, apellido, facultad, direccion;
		int comision, catedra;
		ArrayList<Persona> estudiantes = new ArrayList<>();
		ArrayList<Persona> profesores = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			System.out.print("Nombre del estudiante: "); nombre = s.nextLine();
			System.out.print("Apellido del estudiante: "); apellido = s.nextLine();
			System.out.print("Comision del estudiante: "); comision = Integer.parseInt(s.nextLine());
			System.out.print("Direccion del estudiante: "); direccion = s.nextLine();
			Estudiante e = new Estudiante(nombre, apellido, comision, direccion);
			estudiantes.add(e);
		}
		for (int i = 0; i < 3; i++) { 
			System.out.print("Nombre del profesor: "); nombre = s.nextLine();
			System.out.print("Apellido del profesor: "); apellido = s.nextLine();
			System.out.print("Comision del profesor: "); catedra = Integer.parseInt(s.nextLine());
			System.out.print("Direccion del profesor: "); facultad = s.nextLine();
			Profesor p = new Profesor(nombre, apellido, catedra, facultad);
			profesores.add(p);
		}
		for (Persona i : estudiantes) { System.out.println(i.tusDatos()); }
		for (Persona i : profesores) { System.out.println(i.tusDatos()); }
	}
	
}