public class Circle extends Shape {
    private double radius;
    Circle() {}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double r){
        radius = r;
    }

    double getArea(){
        return 3.14 * getRadius() * getRadius();
    }
    double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }
    public String toString(){
        return "My radius is " + this.radius;
    }

    public boolean equals(Object o){
        Circle c = (Circle)o;
        if(c.radius == this.radius)
            return true;
        else
            return false;
    }
}
