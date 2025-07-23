package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;

public class moneda_recursivo2 {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int[] coins = {20, 10, 5 , 2, 1};

		int capacity = 36;
		int solution[] = monedas(coins, capacity);
		int totalCoins = 0;
		for (int i = 0; i < solution.length; i++) {
			totalCoins += solution[i];
			writer.write("Se uso " + solution[i] + " monedas de " + coins[i] + "  \n" );
		}
		writer.flush();
		writer.write("Se uso un total de " + totalCoins);
		writer.flush();

	}

	public static int[] monedas(int[] coins, int capacity ) { 
	     int [] solutions = new int[coins.length];
	     int currentSOlution = capacity;
	     
	     while(currentSOlution > 0 )
	     {
	    	 int index = select(coins, currentSOlution);
	    	 if (index == -1) {
	    		 break;
	    	 }
	    	 
	    	 int count = currentSOlution/ coins[index];
	    	 solutions[index] += count;
	    	 currentSOlution -= (coins[index] * count);
	    	 
	    	 
	     }
		return solutions;
	}
	
	
	public static int select(int[] coins, int capacity) {
		int index = -1;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] <= capacity) {
				index = i;
				break;
			}
		}
		return index;
	}
	

}
