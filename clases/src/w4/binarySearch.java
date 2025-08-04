package w4;
import java.util.*;
public class binarySearch {

	public static void main(String[] args) {
		int vec[] = { 4, 8, 1, 4, 5, 6, 3, 2, 1, 0, 7, 1, 8,-1,2 };
		Arrays.sort(vec);
		System.out.println("Vector Ordenado");
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
		
		System.out.println("Busqueda binaria");
		int sol = busquedaBinaria(vec, -1);
		System.out.println(sol);

	}

	public static int busquedaBinaria(int vec[], int target) {
		int low = 0;
		int high = vec.length - 1;
		System.out.println("Low " + low + " high " + high);

		while (low <= high) {
			int mid = (low + high) / 2;

			if (vec[mid] == target) {
				return mid;
			}
			if (target > vec[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			System.out.println("Low " + low + " high " + high);
		}
		return -1;
	}
}
