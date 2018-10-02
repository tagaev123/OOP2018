public class Sphere extends Shape {
    public double radius;
    public double height;

    public Sphere(){}

    public Sphere(double r, double h){
        radius = r;
        height = h;
    }

    public double volume(){
        double output = (4 * 3.14 * radius * radius) / 3;
        return output;
    }
    public double surfaceArea() {
        double output =  4 * 3.14 * radius * radius;
        return output;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }
}
