import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class Mall{
    private String name;
    private ArrayList<Store> stores;
    private ArrayList<Customer> customers;

    public Mall () { }

    public Mall(String name){
        this.name = name;
    }

    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        customers.remove(c);
    }

    public static ShoppingCart getShoppingCart(){
        return new ShoppingCart();
    }

    public List<Customer> customers(){
        return this.customers;
    }

    public List<Store> stores(){
        return this.stores;
    }

    public void addStore(Store s){
        this.stores.add(s);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
