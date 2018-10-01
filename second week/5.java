
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
          
public class Main {
	  
      public static void doubleMassive(int[] massive){
      	 int[] pattern = new int[2];
      	 int size = massive.length * 2;
      	 int[] result = new int[size];
      	 for(int i = 0; i < massive.length; i++){
      	 	Arrays.fill(pattern, massive[i]);
      	 	System.arraycopy(pattern, 0, result, i * 2, 2);
      	 }
      	for(int i = 0; i < size; i++){
      	    System.out.print(result[i] + ", "); 
      	}
      }
  
     public static void main(String[] args) {
     	    Main main = new Main();
     	    int[] massive = {1,2,3};
           main.doubleMassive(massive);
         }
    }

 
       

