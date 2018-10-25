public class Cube implements  Shape {
    public double radius;
    public double height;

    public Cube(){}

    public Cube(double r, double h){
        radius = r;
        height = h;
    }

    public double volume(){
        double output = height * height * height;
        return output;
    }
    public double surfaceArea() {
        double output =  6 * height * height;
        return output;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.radius / 2;
    }
}
