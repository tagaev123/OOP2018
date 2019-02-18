import java.util.Scanner;

public class Customer {
    ShoppingCart shoppingCart;
    String name;
    Store store;

    public Customer () {}

    public Customer(String name, String store){
        this.name = name;
        if(store.equals("Book")) this.store = Main.meloman;
        if(store.equals("Shoe")) this.store = Main.adidas;
        if(store.equals("Game")) this.store = Main.gamer;

    }

    public ShoppingCart getShoppingCart(){
        return Mall.getShoppingCart();
    }

    public void changeStore(){
        System.out.println("All stores will be listed above: ");
        for(int i = 0; i < Main.store.stores.size(); i++){
            System.out.println(i + 1 + ". " + Main.store.stores.get(i));
        }

        System.out.println("Please, choose the number");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        this.store = Main.store.stores.get(index - 1);
    }

    public String toString(){
        return "My name is " + this.name + ". Currently I am at " + this.store;
    }
}
