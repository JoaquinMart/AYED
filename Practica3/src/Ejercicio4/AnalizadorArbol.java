package Ejercicio4;

import java.util.*;

public class AnalizadorArbol {
	
	private double promedio(int tot, int cant) {
		return tot / cant;
	}
	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> a) {
		double promAct, promMax = 0;
		if (!a.isEmpty()) {
			Queue<GeneralTree<AreaEmpresa>> queue = new Queue<GeneralTree<AreaEmpresa>>();
			queue.enqueue(a);
			while (!queue.isEmpty()) {
				int dimF = queue.size();
				int suma = 0;
				for (int i = 0; i < dimF; i++) {
					GeneralTree<AreaEmpresa> act = queue.dequeue();
					suma = suma + act.getData().getNum();
					if (act.hasChildren()) {
						List<GeneralTree<AreaEmpresa>> hijo = act.getHijo();
						for (GeneralTree<AreaEmpresa> j : hijo) {
							queue.enqueue(j);
						}
					}
				}
				promAct = promedio(suma, dimF);
				promMax = Math.max(promMax, promAct);
			}
		}
		return promMax;
	}
}