package week1;

import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int j = 0; j < n; j++) {
			long m = sc.nextLong();
			String number = Long.toString(m);
			int i = 0;
			for (; isPalindrome(number) == false;) {
				String newNumber = reverse(number, "", 0);
				long sum = Long.parseLong(newNumber) + Long.parseLong(number);
				number = Long.toString(sum);
				i++;
			}
			System.out.println(i + " " + number);
		}
	}
 
	public static boolean isPalindrome(String number) {
		for (int i = 0; i < number.length() / 2; i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static String reverse(String number, String newNumber, int index) {
		if (index > number.length() - 1) {
			return newNumber;
		}
		newNumber = number.charAt(index) + newNumber;
		return reverse(number, newNumber, index + 1);
	}
}
