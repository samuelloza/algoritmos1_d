package week3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class mochila {

	public static void main(String[] args)  throws Exception {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] w = {10, 20, 30, 40, 50};
		int[] v = {20, 30, 66, 40, 60};
		
		int capacity = 100;
		
		double solutions[] = gready_mochila(w, v, capacity);
		double total = 0.0;
		
		for (int i = 0; i < solutions.length; i++) {
			writer.write("se gano " + v[i] + " y se uso el " + solutions[i]*100 + "% \n");
			total = total + (solutions[i] * v[i]);
		}
		writer.write(total  + "\n");

		writer.flush();
 		
	}
	
	public static double[] gready_mochila(int[]pesos, int[]valores, int capacidad) {
		boolean[] visitados = new boolean[pesos.length];
		double[] solucion = new double[pesos.length];
		
		double currentSolution = 0.0;
		
		while (currentSolution < capacidad) {
			int i = select(valores, pesos, solucion, visitados);
			if (i == -1) {
				break;
			}
			visitados[i] = true;
			
			if(currentSolution + pesos[i] <= capacidad) {
				solucion[i] = 1;
				currentSolution = currentSolution + pesos[i];
			} else {
				solucion[i] = (capacidad - currentSolution) / (double) pesos[i];
				break;
			}
		}
		return solucion;

	}
	
	public static int select(int [] valores, int[] pesos, double[]solucion, boolean[] visitados) {
		int index = -1;
		
		double maxi = Integer.MIN_VALUE;
		
		for (int i = 0; i < valores.length; i++) {
			double tmp = (double) valores[i] / pesos[i];
			if (tmp > maxi && visitados[i] == false) {
				maxi = tmp;
				index = i;
			}
		}
		return index;
	}

}
