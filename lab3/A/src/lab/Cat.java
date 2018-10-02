package lab;

public class Cat extends Animal{
    public String species = "default";
    public boolean canFly = false;
    public Cat() {}
    public Cat(String family, String genus, String species, boolean canFly) {
        super(family, genus);
        this.species = species;
        this.canFly = canFly;
    }
    public Cat(String species) {
        super();
        this.species = species;
    }
     public void setInformation(String family, String genus, String species, boolean canFly){
         this.species = species;
         this.canFly = canFly;
         this.family = family;
         this.genus = genus;

     }
    @Override
    public void say(){
        System.out.println("I am cat and my family is " + this.family);
    }

}
