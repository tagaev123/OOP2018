import java.util.ArrayList;

public class TextBook {
    String ISBN, title;
    ArrayList<String> authors = new ArrayList<String>();
    public TextBook() {}

    public TextBook(String ISBN, String title, String ...a) { //using rest from JS
        this.ISBN = ISBN;
        this.title = title;
        for (String author : a) {
            authors.add(author);
        }
    }
        public String getAuthors(){
               int size = authors.size();
               String output = "";
             for(int i = 0; i < size; i++){
                 if(i != size - 1)
                     output += authors.get(i) + ", ";
                 else
                     output += authors.get(i);
             }
             return output;
        }


        @Override
        public String toString(){
            return this.ISBN + " " + this.title + ". Authors: " + this.getAuthors() + ".";
        }

        @Override
        public boolean equals(Object o){
             TextBook t = (TextBook)o;
             if(t.ISBN == this.ISBN && t.title == this.title) return true;
             return false;
        }

    }

