public class Main {
    public static void main(String[] args) {
        Shape cylinder = new Cylinder(5, 10);
        Shape cube = new Cube(25, 25);
        Shape sphere = new Sphere(15, 20);

        System.out.println("Surface area of cylinder is " + cylinder.surfaceArea());
        System.out.println("Surface area of sphere is " + sphere.surfaceArea());
        System.out.println("Surface area of cube is " + cube.surfaceArea());

        System.out.println("Volume of cube is " + cube.volume());
        System.out.println("Volume of sphere is " + sphere.volume());
        System.out.println("Volume of cylinder is " + cylinder.volume());
    }
}
