package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class m2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = reader.readLine().trim().split("\\s+");
        int m = Integer.parseInt(inputs[0]);
        int n = Integer.parseInt(inputs[1]);

        String[][] matriz = new String[m][n];

        for (int i = 0; i < m; i++) {
            String line = reader.readLine().trim();
            for (int j = 0; j < n; j++) {
                matriz[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int grupo = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!matriz[i][j].equals("*")) {
                    int cambio = recorrer(matriz, i, j, m, n, String.valueOf(grupo));
                    if (cambio == 1) {
                        grupo++;
                    }
                }
            }
        }

        System.out.println("Resultado:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Total de grupos: " + (grupo - 1));
    }

    public static int recorrer(String[][] matriz, int x, int y, int m, int n, String grupo) {
        if (x < 0 || x >= m || y < 0 || y >= n) return 0;
        if (matriz[x][y].equals("*")) return 0;

        matriz[x][y] = grupo;

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx != 0 || dy != 0) {
                    recorrer(matriz, x + dx, y + dy, m, n, grupo);
                }
            }
        }

        return 1;
    }
}
