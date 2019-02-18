import java.util.ArrayList;
import java.util.Iterator;

public class GameStore extends Store {
    public GameStore() { }

    public GameStore(String name){
        super(name);
        this.id = "3";
        this.items = new ArrayList<Item>();
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String listItems(){
        String output = "";
        Iterator it = this.items.iterator();
        while(it.hasNext()){
            Item current = (Item)it.next();
            String pattern = "BookStore " + this.name + ". " + current;
            pattern += '\n';
            output += pattern;
        }

        return output;
    }
}

