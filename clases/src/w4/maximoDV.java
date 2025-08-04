package w4;

public class maximoDV {

	public static void main(String[] args) {
		int vec[] = {3,4,5,6,7,5,3,-8,5,2024};
		System.out.println(maximoDV(vec, 0, vec.length - 1));
	}
	
	public static int maximoDV(int vec[], int inicio, int fin) {
		if (inicio == fin) {
			return vec[inicio];
		}
		
		int medio = (inicio + fin) / 2;
		
		int maximoIzq = maximoDV(vec, inicio, medio);
		int maximoDerecho = maximoDV(vec, medio + 1, fin);
		
		return Math.max(maximoIzq, maximoDerecho);
	}
}
