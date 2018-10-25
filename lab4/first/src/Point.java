public class Point implements  Shape {
    public int x, y;

    Point() {}

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double volume(){ return 1;}

    public double surfaceArea() {return 1;}

}
