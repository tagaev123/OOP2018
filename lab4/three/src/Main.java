import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee("Steve", 20000, new Date(2000,9,3), "50" );
        Employee e2 = new Employee("Vasya", 20001, new Date(2000,9,3), "50" );
        Employee e3 = new Employee("Steve", 20000, new Date(2000,9,3), "50" );

        Manager m1 = new Manager("Steve", 20000, new Date(2000,9,3), "50", 2000);
        Manager m2 = new Manager("Vasya", 20000, new Date(2000,9,3), "50", 2001);
        Manager m3 = new Manager("Vasya", 20000, new Date(2000,9,3), "50", 2001);
        ArrayList<Manager> arr = new ArrayList<Manager>();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        System.out.println(e1.compareTo(e2));
        System.out.println(m1.compareTo(m2));
        System.out.println(m2.compareTo(m3));
        System.out.println(e1.compareTo(e3));
        Manager m4 = null;
        Employee e4 = null;
       try{
           m4 = (Manager)m3.clone();
           e4 = (Employee)e3.clone();
       }
       catch(CloneNotSupportedException e){
           e.printStackTrace();
       }
       System.out.println(m4 + " " + e4);
    }
}
