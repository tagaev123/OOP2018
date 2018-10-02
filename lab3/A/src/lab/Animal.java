package lab;

public class Animal {
    public String family = "default";
    public String genus = "default";


    public Animal() {}
    public Animal(String family, String genus){
        this.family = family;
        this.genus = genus;
    }

    public void setInformation(String family, String genus){
        this.family = family;
        this.genus = genus;
    }


    public void say(){
        System.out.println("I am animal and my family is " + this.family);
    }


}
