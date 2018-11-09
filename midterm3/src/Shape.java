public abstract class Shape {
    private String color;
    private boolean filled;
    Shape() {}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    String getColor(){
        return this.color;
    }

    void setColor(String color){
      this.color = color;
    }

    boolean isFilled(){
        if(filled)
            return true;
        else
            return false;
    }
    void setFilled(boolean filled){
        this.filled= filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();

}
