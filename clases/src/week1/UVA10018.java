package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UVA10018 {

	public static boolean isPalindromo(String number, int index) {
		if (index > number.length() - 1) {
			return true;
		}
		
		int len = number.length() - 1;
		
		if (index == len - index) {
			return true;
		}
		
		if (number.charAt(index) != number.charAt(len - index) ) {
			return false;
		}
		return isPalindromo(number, index + 1);
	}
	
	public static String reverse(String number, String newNumber, int index) {
		
		/*if (index == number.length() ) {
			return newNumber;
		}
		*/
		if (index > number.length() - 1) {
			return newNumber;
		}

		newNumber = number.charAt(index) + newNumber;
		return reverse(number, newNumber, index + 1); 
	}

	public static void main(String[] args)  throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = reader.readLine();
		int n = Integer.parseInt(line);
		
		
		for (int i = 0; i < n; i++) {
			line = reader.readLine();
			long p = Long.parseLong(line);
			long sum = 0;
			int count = 0;
			while (count < 1000) {
				long reverse_number = Long.parseLong(reverse(p + "", "", 0));
				sum = p + reverse_number;
				p = sum;
				
				if (isPalindromo(sum + "", 0) == true) {
					break;
				}
				count++;
			}
			
			writer.write((count + 1) + " "  + p + "\n");
			writer.flush();
		}
	}
}
