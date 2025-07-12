package week1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = reader.readLine();
		String[] array_input = input.split(" ");
		
		int a = Integer.parseInt(array_input[0]);
		int b = Integer.parseInt(array_input[1]);
		
		writer.write(a + b + "  -");
		writer.flush();
		writer.close();
	}
}
