import javax.print.DocFlavor;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String line, point1, point;
        HashMap<String, String> map = new HashMap<String, String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\OOP\\lab5\\A\\src\\1.txt"));
            line = br.readLine();

            while (line != null) {
                int index = 0;
                point = "";

            for (int i = line.length() - 1; i >= 0; i--) {
                if (line.charAt(i) != ' ') {
                    point += line.charAt(i);
                } else {
                    index = i;
                    break;
                }
            }

        point = new StringBuffer(point).reverse().toString();

        int ipoint = Integer.parseInt(point);
        if (ipoint >= 90)
            point1 = "A";
        else if (ipoint >= 80)
            point1 = "B";
        else if (ipoint >= 70)
            point1 = "C";
        else if (ipoint >= 60)
            point1 = "D";
        else
            point1 = "F";

        point = line.substring(0, index);

        map.put(point, point1);
        line = br.readLine();
    }
            br.close();
            Iterator it = map.entrySet().iterator();
            FileWriter file = new FileWriter("D:\\OOP\\lab5\\A\\src\\2.txt");

            BufferedWriter bw = new BufferedWriter((file));
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                String output = (String) pair.getKey() + " " + (String) pair.getValue();
                bw.write(output);
                bw.newLine();

            }


            bw.close();
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }
}

