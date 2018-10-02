public class Manager extends Employee {
    public int numberOfTeam;
    public Manager() {}

    public Manager(String n, double salary, int startWorkSince, String insuranceNumber, int numberOfTeam){
        super(n, salary, startWorkSince, insuranceNumber);
        this.numberOfTeam = numberOfTeam;
    }

    public void getBonus(){
        this.salary += 20000;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            Manager other = (Manager)obj;
            if(other.numberOfTeam == this.numberOfTeam)
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return super.toString() + "I am from " + numberOfTeam + "team";
    }
}
