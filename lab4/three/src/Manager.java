import java.util.Date;
public class Manager extends Employee implements Comparable <Object>{
    public int numberOfTeam = 1;
    private double bonus;
    public Manager() {}

    public Manager(String n, double salary, Date date, String insuranceNumber, int bonus){
        super(n, salary, date, insuranceNumber);
        this.bonus = bonus;
    }

    public void setBonus(){
        this.salary += this.bonus;
    }


    @Override
    public String toString(){
        return "I am from " + numberOfTeam + "team";
    }
    @Override
    public int compareTo(Object o){
        if(super.compareTo(o) == 0){
            Manager m = (Manager)o;
            return Double.compare(this.bonus, m.bonus);
        }
        return super.compareTo(o);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
