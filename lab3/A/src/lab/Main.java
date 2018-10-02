package lab;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal("felidae", "lynx");
        a.say();

        Cat cat = new Cat("felidae" , "lynx", "cat", false);
        cat.say();
    }
}
