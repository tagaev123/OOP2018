public class Rectangle extends Shape {
    private double width, length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    double getWidth() {
        return this.width;
    }

    double getLength() {
        return this.length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return getLength() * getWidth();
    }

    double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public String toString() {
        return "My width and length is " + this.width + " " + this.length;
    }
    public boolean equals(Object o){
        Rectangle r = (Rectangle)o;
        if(r.width == this.width && r.length == this.length)
            return true;
        else
            return false;
    }
}
