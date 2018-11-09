public class Instructor {
    public String firstName, lastName, department;
    private String email;

    public Instructor() {}

    public Instructor(String firstName, String lastName, String department, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }

    void setEmail(String email){
        this.email = email;
    }

    String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return "Full name: " + this.lastName + " " + this.firstName + ". Department: " + this.department + ".";
    }

    @Override
    public boolean equals(Object o){
        Instructor i = (Instructor) o;
        if(i.firstName == this.firstName && i.lastName == this.lastName && i.department == this.department && i.getEmail() == this.email) return true;
        return false;
    }
}
