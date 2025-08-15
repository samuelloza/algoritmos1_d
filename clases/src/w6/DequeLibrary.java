package w6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeLibrary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Deque<Integer> deque = new ArrayDeque<Integer>();
			for (int i = 0; i < n; i++) {
				deque.add((i + 1));
			}

			int count = 0;
			System.out.print("Discarded cards: ");
			while (deque.size() > 1) {
				if (count > 0) {
					System.out.print(", ");
				}

				int aux = deque.getFirst();
				System.out.print(aux);
				deque.removeFirst();

				aux = deque.getFirst();
				deque.removeFirst();

				deque.addLast(aux);
				count++;
			}
			System.out.println();
			System.out.println("Remaining card: " + deque.getFirst());

		}

	}

}
