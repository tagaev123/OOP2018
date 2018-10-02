public class Person {
    public String name = "Default";
    public int age;
    public String jobTitle = "Stager";

    public Person() {
    }
    public Person(String name){
        this.name = name;
    }
    public Person(String n, String jt, int a) {
        this.name = n;
        this.jobTitle = jt;
        this.age = a;
    }

    @Override
    public boolean equals(Object obj) {
            Person other = (Person)obj;
            if(this.name.equals(other.name) && this.jobTitle.equals(other.jobTitle) && this.age == other.age)
                return true;

        return false;
    }
    @Override
    public String toString(){
        return "My name is " + name + ". I am " + age;
    }
}
