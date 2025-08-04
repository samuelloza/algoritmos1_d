import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int vec[] = new int[n];
    for(int i = 0; i < n; i++) {
       vec[i] = sc.nextInt();
    }

    bubbleSort(vec);

    System.out.print(vec[0]);
    for(int i = 1; i < vec.length; i++) {
      System.out.print(" " + vec[i]);
    }
    System.out.println();
 }

 public static void bubbleSort(int vec[]) {
   int limit = vec.length;
   for(int i = limit; i >=1; i--) {
     for(int j = 0; j < i-1; j++) {
        if (vec[j] > vec[j + 1]) {
           int aux = vec[j];
           vec[j] = vec[j + 1];
           vec[j + 1] = aux;
        }
     }
   }
 }

}
