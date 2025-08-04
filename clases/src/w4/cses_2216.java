package w4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;

public class cses_2216 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		int vec[] = new int[n + 1];
		
		String line = reader.readLine();
		String input[] = line.split(" ");

	
		int limit  = input.length;
		
		int value = 1;
		for (int i = 0; i < limit; i++) {
			int position = Integer.parseInt(input[i]);
			vec[position ] = value;
			value = value + 1;
		}
		
		int aux = 1;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			//writer.write(aux + " > " + vec[i] + "\n");
			if (aux > vec[i]) {
				//writer.write(" ++++ \n");
				count = count + 1;
			}
			aux = vec[i];
		}
		
		writer.write(count + "");
		writer.flush();
		
		/*for (int i = 0; i < input.length; i++) {
			writer.write(vec[i] + "");
		}
		
		writer.flush();*/

	}

}
