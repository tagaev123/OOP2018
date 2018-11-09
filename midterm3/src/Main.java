public class Main {
    public static void main(String[] args){
        Shape circle= new Circle(50);
        Shape rect = new Rectangle(100, 50);
        Square sq = new Square(50);
        sq.setSide(50.0);
        System.out.println(circle.getArea());
        System.out.println(rect.getArea());
    }
}
