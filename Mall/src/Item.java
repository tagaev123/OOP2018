public class Item {
    String name, storeId, id;
    double price;

    public Item() {}

    public Item(String name, String id, String storeId, double price){
        this.name = name;
        this.id = id;
        this.storeId = storeId;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ". Price: " + this.price;
    }
}
