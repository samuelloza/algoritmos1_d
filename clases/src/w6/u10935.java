package w6;

import java.util.ArrayList;
import java.util.Scanner;

public class u10935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			ArrayList<Integer> deque = new ArrayList<Integer>();
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

				deque.remove(0);

				aux = deque.getFirst();
				deque.remove(0);

				deque.addLast(aux);
				count++;
			}
			System.out.println();
			System.out.println("Remaining card: " + deque.getFirst());

		}

	}
}
