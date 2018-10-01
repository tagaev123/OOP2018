
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
          
public class Main {
	  public String returnsmth(char c, int index){
	  	String result;

	 	  	if(с  == '2'){
	  		result = (index == 1) ? "twenty" : "two";
	  		return result;
	  	}
	  	if(с - '0' == 3){
	  		result = (index == 1) ? "thirty" : "three";
	  		return result;
	  	}
	  	if(с - '0' == 4){
	  		result = (index == 1) ? "forty" : "four";
	  		return result;
	  	}
	  	if(с - '0' == 5){
	  		result = (index == 1) ? "fifty" : "five";
	  		return result;
	  	}
	  	if(с - '0' == 6){
	  		result = (index == 1) ? "sixty" : "six";
	  		return result;
	  	}
	  	if(с - '0' == 7){
	  		result = (index == 1) ? "seventy" : "seven";
	  		return result;
	  	}
	  	if(с - '0' == 8){
	  		result = (index == 1) ? "eighty" : "eight";
	  		return result;
	  	}
	  	if(с - '0' == 9){
	  		result = (index == 1) ? "ninety" : "nine";
	  		return result;
	  	}
	  }
	  public String teen(String s){
	  	
        if(s.equals("10")){
        	return "ten";
        }
        if(s.equals("11")){
        	return "eleven";
        }
        if(s.equals("12")){
        	return "twelve";
        }
        if(s.equals("13")){
        	return "thirdteen";
        }
        if(s.equals("14")){
        	return "fourteen";
        }
        if(s.equals("15")){
        	return "fifthteen";
        }
        if(s.equals("16")){
        	return "sixteen";
        }
        if(s.equals("17")){
        	return "seventeen";
        }
        if(s.equals("18")){
        	return "eighteen";
        }
        if(s.equals("10")){
        	return "nineteen";
        }
	  }
     public static String inWords(int number){
          String s = Integer.toString(number);
          String result = "";
          int size = s.length();
          if(size == 5){
          	String ending ="";
          	if(s.charAt(4) == '0'){
          		ending = teen(s.substring(3, 2));
          	}else{
          		ending = returnsmth(s.charAt(3), 1);
          		ending += returnsmth(s.charAt(4), 0);
          	}
          	result = result + returnsmth(s.charAt(0), 1) + returnsmth(s.charAt(1), 0) + "thousands" + returnsmth(s.charAt(2), 0) + "hundred" + ending;
          }

          }

     
     public static void main(String[] args) {
     	      Scanner scan= new Scanner(System.in);
     	      int n = scan.nextInt();
     	      System.out.println(inWords(n));

         }
    }

 
       

