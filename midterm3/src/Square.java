public class Square extends Rectangle {
    double side;
    Square() {}

    Square(double side){
        this.side= side;
    }

    Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }
    double getSide(){
        return this.side;
    }

    void setSide(double side){
        this.side = side;
    }

    void setWidth(double side){
        super.setWidth(side);
    }

    void setLength(double side){
        super.setLength(side);
    }
}
