
import java.util.Scanner;
import java.lang.String;

          
public class Main {
     public static class StarTriangle {
    int width;
    String stamp;
    public StarTriangle(int width){
        this.width = width;
       stamp = "[*]";
    }
    public String ToString(){
        int cnt = 0;
        String output = "";
        for(int i = 0; i < this.width; i++){
            
               for(int j = 0; j <= i; j++){
                   output += this.stamp;
                  
               }
                output += "\n";
            }
            return output;
        }
    }
     public static void main(String[] args) {
              StarTriangle star = new StarTriangle(3);
             System.out.println(star.ToString());

         }
}
 
       

   