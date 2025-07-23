package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class moneda_recursivo {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int[] coins = {20, 10, 5 , 2, 1};
		//final int[] coins2 = {20, 10, 5 , 2, 1};

		int capacity = 36;
		int solution = coinsRecursivo(coins , capacity, 0);
		writer.write(solution + "\n");
		writer.flush();
		
		/*for (int i = 0; i < coins.length; i++) {
			writer.write(coins[i] + "-");				
		}
		
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] == -100) {
				writer.write(coins2[i] + " ");				
			}
		}
		writer.flush();*/

		
	}

	public static int coinsRecursivo(final int[] coins, final int capacity, final int index) {
		if (capacity <= 0) {
			return 0;
		}
		
		if (index >= coins.length) {
			return -1;
		}
		
		/*if (index - 1 >= 0 ) {			
			coins[index - 1] = -100;
		}*/
		
		int count = capacity / coins[index];
		int currentSolucion = capacity % coins[index];
		return count + coinsRecursivo(coins, currentSolucion, index + 1);
	}

}
