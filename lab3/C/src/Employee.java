public class Employee extends Person {
    public double salary;
    public int startWorkSince;
    public String insuranceNumber;

    public Employee() {}

    public Employee(String name, double salary, int startWorkSince, String insuranceNumber){
        super(name);
        this.salary = salary;
        this.startWorkSince = startWorkSince;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            Employee other = (Employee)obj;
            if(other.salary == this.salary && this.startWorkSince == other.startWorkSince && this.insuranceNumber.equals(other.insuranceNumber))
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return super.toString() + "I have an annual salary " + salary + " I am here since " + startWorkSince;
    }
}
