import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Database {

    public Database() {}

    public ArrayList<Item> splitItems(String path) {
        ArrayList<Item> items = new ArrayList<Item>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
            while (line != null) {

                String[] parts = line.split(" ");

             /* items.add(new Item(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
                System.out.println(parts[2]);*/
                if(parts[2].equals("1")) Main.meloman.items.add(new Item(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
                if(parts[2].equals("2")) Main.adidas.items.add(new Item(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
                if(parts[2].equals("3")) Main.gamer.items.add(new Item(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
                line = bf.readLine();
            }
            fr.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}

