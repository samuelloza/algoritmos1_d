package w6;

import java.util.Scanner;

public class u673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String line = sc.next();
			CustomStack myStack = new CustomStack();

			boolean sw = true;
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == '(' || line.charAt(j) == '[') {
					myStack.push(line.charAt(j) + "");
				} else {
					if (myStack.isEmpty()) {
						sw = false;
						break;
					}
					String lastElement = myStack.peek();

					if (lastElement.equals("[") && line.charAt(j) == ']') {
						myStack.pop();
					} else if (lastElement.equals("(") && line.charAt(j) == ')') {
						myStack.pop();
					}
				}
			}
			
			if (myStack.isEmpty() && sw ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
