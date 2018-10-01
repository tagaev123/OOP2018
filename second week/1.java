
import java.util.Scanner;
import java.lang.String;
 
public class Main {
    public static class Student {
        public int id;
        public String name;
        public int yearOfStudy;
        public Student(String name, int id){
        	this.id = id;
        	this.name = name;
        	yearOfStudy = 1;
        }
        public String getName(){
        	return name;
        }
        public int getId(){
        	return id;
        }
        public void incrementYearOfStudy(){
        	this.yearOfStudy++;
        }
    }

    public static void main(String[] args) {
             Student s = new Student("Steve", 1);
             System.out.println(s.getId());
             System.out.println(s.getName());
             s.incrementYearOfStudy();
             System.out.println(s.yearOfStudy);
         }
}