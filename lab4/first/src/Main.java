public class Main {
    public static void main(String[] args){
        Shape cyl = new Cylinder(10, 20);
        Shape cube = new Cube(50, 20);
        Shape sphere = new Sphere(2, 3);
        Shape point = new Point(10, 15);
        System.out.println("Volume of cylinder: " + cyl.volume());
        System.out.println("Area of cylinder: " + cyl.surfaceArea());
        System.out.println("Volume of cube: " + cube.volume());
        System.out.println("Area of cube: " + cube.surfaceArea());
        System.out.println("Volume of sphere: " + sphere.volume());
        System.out.println("Area of sphere: " + sphere.surfaceArea());
        System.out.println("Volume of point: " + point.volume());
        System.out.println("Area of point: " + point.surfaceArea());
    }
}
