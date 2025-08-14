package w6;

import java.util.Scanner;

public class Spoj_ONP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String line = sc.next();

			CustomStack myStack = new CustomStack();
			for (int j = 0; j < line.length(); j++) {
				
				char caracter = line.charAt(j);
				
				if (caracter == '*' || caracter == '+' || caracter == '-' || caracter == '/' || caracter == '^') {
					myStack.push(caracter + "");
				} else if (caracter == ')') {
					System.out.print(myStack.pop());
				} else if (caracter != '(') {
					System.out.print(caracter);
				}
			}
			
			System.out.println();
		}
	}
}
