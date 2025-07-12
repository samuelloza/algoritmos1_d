package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class matriz {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void printMap(String[][] map) throws Exception {
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				writer.write(map[i][j]);
			}
			writer.write("\n");
		}
		writer.write("\n");

		writer.flush();
	}
	
	public static void main(String[] args) throws Exception {
		
		/*Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();*/
		
		
		String[][] map = {
				{ ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
				{ ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "#" },
				{ "#", ".", "#", ".", "#", ".", "#", "#", "#", ".", "#", ".", "#", "#", "#", ".", "#", ".", ".", "#" },
				{ "#", ".", "#", ".", ".", ".", ".", "#", ".", ".", ".", ".", "#", ".", ".", ".", "#", ".", ".", "#" },
				{ "#", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", ".", "#", "#" },
				{ "#", ".", ".", ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", "#", ".", "E", "#" },
				{ "#", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", ".", ".", "#" },
				{ "#", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", "#" },
				{ "#", "#", "#", ".", "#", "#", "#", ".", ".", ".", "#", "#", "#", "#", "#", "#", ".", "#", "#", "#" },
				{ "#", "#", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" } };
		System.out.println(map.length);
		printMap(map);
		String[][] map2 = recorrido(map, 0, 0);
		writer.write("***************\n");
		printMap(map2);
	}
	
	public static String[][] recorrido(String [][] map, int index_i, int index_j){
		if (index_i < 0 || index_j < 0) {
			return map;
		}
		
		if (index_i >= map.length || index_j >= map.length) {
			return map;
		}
		
		if (map[index_i][index_j].equals("#")) {
			return map;
		}
		
		if (map[index_i][index_j].equals("C")) {
			return map;
		}
		
		map[index_i] [index_j] = "C";

		//derecha | izquierda | arriba | abajo 
		int ix[] = {0, 0, -1, 1};
		int jx[] = {1, -1, 0, 0};

		for (int j2 = 0; j2 < ix.length; j2++) {
			int new_index_i = ix[j2] + index_i;
			int new_index_j = jx[j2] + index_j;
			
			recorrido(map, new_index_i, new_index_j);
		}
		
		return map;
	}

}
