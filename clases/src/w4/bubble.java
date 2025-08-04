import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void printArray(int vec[]) throws Exception {
		writer.write(vec.length + "");

		for (int i = 0; i < vec.length; i++) {
			writer.write(vec[i] + "");
		}
		writer.write("\n");
	}
	
	public static void main(String[] args) throws Exception {
		writer.write("+++++++++++++++++++++++++");

		/*int vec[] = { 1, 5, 6, 7, 3, 2, 10, 1, 23, 6 };
		writer.write(vec.length);
		printArray(vec);*/
	}

}
