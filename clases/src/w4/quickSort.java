package w4;

public class quickSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quicksort(int[] a, int start, int end) {
		// Condicion base
		if (start >= end) {
			return;
		}

		// Reorganizar los elementos en función del pivote
		int pivot = partition(a, start, end);

		// se llama a la funcion con la sublista
		// que tiene los elementos menores que el pivote
		quicksort(a, start, pivot - 1);

		// se llama a la funcion con la sublista
		// que tiene los elementos menores que el pivote
		quicksort(a, pivot + 1, end);
	}

	public static int partition(int[] a, int start, int end) {
		// Elegimos el elemento de mas a la derecha como el pivote del arreglo
		int pivot = a[end];

		// los elementos menores que el pivote seran empujados a la izquierda pIndex
		// elementos mayores que el pivote seran empujados a la derecha de pIndex
		// elementos iguales pueden ir en cualquier direccion
		int pIndex = start;

		// cada vez que encontramos un elemento menor o igual que el pivote,
		// pIndex se incrementa, y ese elemento se colocaria
		// antes del pivote
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				swap(a, i, pIndex);
				pIndex++;
			}
		}

		// Intercambiar pIndex con pivote
		swap(a, end, pIndex);

		// devuelve pIndex (indice del elemento pivote)
		return pIndex;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Arreglo original:");
		printArray(arr);

		quicksort(arr, 0, arr.length - 1);

		System.out.println("Arreglo ordenado:");
		printArray(arr);
	}
}
