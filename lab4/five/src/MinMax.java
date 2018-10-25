public class MinMax {
    static class Output{
        int x, y;
        Output () {}
        Output(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString(){
            return x + " " + y;
        }

    }
     static Output minmax(int values[]){
        int max = -2147483646;
        int min = 2147483646;
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
         Output a = new Output(min, max);
         return a;
     }
     public static void main(String[] args){
          int a[] = {0, 8, -3, 20};
          MinMax m = new MinMax();
          System.out.println(m.minmax(a));
     }

}
