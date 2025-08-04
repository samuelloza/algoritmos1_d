package w4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class test {
    public static void main(String[] args) throws Exception{
 
    	Scanner sc = new Scanner(System.in); // 1oe new Scanner; 1oe asignacion => 2oe   
    	
    	
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        String line = reader.readLine();
 
        String [] s = line.split("\\+");
 
        String res[] = ordenarSum(s,0);
 
        System.out.print(res[0]);
        for (int i = 1; i < res.length; i++) {
        	System.out.print("+" + res[i]);
		}
        System.out.println();
    }
    public  static String[] ordenarSum(String[] s, int index){
        if (index == s.length-1){
            return s;
        }
        else{
            for(int i= 0 ; i < s.length-1; i ++){
                int elemento = Integer.parseInt(s[i]);
                int siguiente = Integer.parseInt(s[i+1]);
                if(elemento > siguiente){
                    String aux = s[i];
                    s[i] = s[i+1];
                    s[i+1] = aux;
                }
            }
        }
        return ordenarSum(s,index+1);
    }
}