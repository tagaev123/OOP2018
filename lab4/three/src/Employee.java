import java.util.Date;

public class Employee implements Comparable<Object>, Cloneable {
    String name;
    public double salary;
    Date date;
    public String insuranceNumber;

    public Employee() {}

    public Employee(String name, double salary, Date date, String insuranceNumber){
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString(){
        return  "I have an annual salary " + salary + " I am here since " + date;
    }
    @Override
    public int compareTo(Object o){
        Employee e = (Employee)o;
         return Double.compare(this.salary, e.salary);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}