
import java.util.Scanner;
import java.lang.String;

          
public class Main {

     public static class Data {
          private double average;
          private double max;
          private int amount;
          public int amountOfNumbers;
         
          public Data(){
          	this.average = 0;
          	this.max = 0;
          	this.amountOfNumbers = 0;
          }
          public boolean add(){
          	Scanner scan = new Scanner(System.in);
          	          	String input = "";
          	while(input != "Q"){

          		System.out.print("Enter the number(Q to quit): ");
          		input = scan.nextLine();
          		
          		
          		double in = Double.parseDouble(input);
          	
          		if(in > this.max){
                     this.max = in;
          		}
          		this.amount += in;
          		this.amountOfNumbers++;
          	}
          	return true;
          }
          public double max(){
          	return this.max;
          }
          public double average(){
          	return amountOfNumbers / amount;
          }
    }

    public static class Analyzer {
    	public double max;
    	public double average;
    	public Analyzer(){
    		this.max = 0;
    		this.average = 0;
    	}
    	public double getAverage(Data a){
    		return a.average();
    	}
    	public double getMax(Data a){
    		return a.max();
    	}
    }
     public static void main(String[] args) {
     	

              Data data = new Data();
              Analyzer analyz = new Analyzer();
              data.add();
              System.out.println("ready");
              System.out.println("Maximum="+analyz.getMax(data));
              System.out.println("Average="+analyz.getAverage(data));
         }
    }

 
       

   