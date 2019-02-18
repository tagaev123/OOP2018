import java.util.ArrayList;
import java.util.List;

public class Store extends Actions{
    String name, id;
    ArrayList<Store> stores;
    ArrayList<Item> items;
    ArrayList<Customer> customers;
    ArrayList<Observer> observers;

    public Store() {}

    public Store(String name){
        this.name= name;
    }



    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        customers.remove(c);
    }

    public List<Customer> customers(){
        return this.customers;
    }

    public List<Item> items(){
        return this.items;
    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public String toString(){
        return this.name;
    }

}

