public class Cylinder implements  Shape {
    public double radius = 0;
    public double height = 0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        double output = 6.28 * radius * (height + radius);
        return output;
    }
    public double volume(){
        double output = 3.14 * radius * radius * height;
        return output;
    }
    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }
}
