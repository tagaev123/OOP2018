import java.util.List;

public class ShoppingCart {
    List<Item> items;
    public ShoppingCart() {}

    public List<Item> items(){
        return this.items;
    }

    public void addItem(Item i){
        this.items.add(i);
    }

    public void removeItem(Item i ){
        this.items.remove(i);
    }
}
