import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static Store store = new Store();
    public static BookStore meloman = new BookStore("Meloman");
    public static ShoeStore adidas = new ShoeStore("Adidas");
    public static GameStore gamer = new GameStore("Gamer");
    public static void main(String[] args){
          Database d = new Database();
          Mall myMall = new Mall("My Mall");
         ArrayList<Item> databaseItems  = d.splitItems("D:\\Mall\\Items.txt");
         store.stores.add(meloman);
        store.stores.add(adidas);
        store.stores.add(gamer);

        // Testing split database
       /* System.out.println(meloman);
        System.out.println(adidas);
        System.out.println(gamer);
        */

       Customer c = new Customer("Ilyas", "Book");

        System.out.println(c.store);

        c.changeStore();


        System.out.println(c.store);

    }
}
