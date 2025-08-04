package w4;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class bubbleSort {

	static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void printArray(int vec[]) throws Exception {
		for (int i = 0; i < vec.length; i++) {
			writer.write(vec[i] + " ");
		}
		writer.write("\n");
	}

	public static void bubblerSort(int vec[]) throws Exception {
		int limite = vec.length;
		boolean sw = false;
		for (int i = limite; i >= 1; i--) {
			writer.write(i + "+++++\n");
			for (int j = 0; j < i - 1; j++) {
				if (vec[j] > vec[j + 1]) {
					int aux = vec[j];
					vec[j] = vec[j + 1];
					vec[j + 1] = aux;
					sw = true;
				}
			}
			
			if (sw == false) {
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		int vec[] = { -1, 5, 6, 7, 3, 2, -10, 1, 23, 6 };
		writer.write("Array Original ");
		printArray(vec);
		
		writer.write("Array Ordenado ");
		bubblerSort(vec);
		printArray(vec);
		
		writer.flush();
	}

}
