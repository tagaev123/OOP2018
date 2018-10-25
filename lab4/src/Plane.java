public class Plane implements Flyable, Moveable {
    private int speed = 0;
    private int accleration = 50;
    private int planebraker = -50;
    private int height = 0;
    private boolean started = false;

    @Override
    public void speedUp(){
        if(started)
         this.speed += accleration;
    }
    @Override
    public void brake(){
        if(started)
        this.speed += planebraker;
    }
    @Override
    public void start(){
        started = true;
        System.out.println("Plane is ready for flight");
    }
    @Override
    public void up(){
        if(started)
        this.height += Flyable.height;
    }
    void setSpeed(int x) {
        this.speed = x;
    }

    int getSpeed(){
        return this.speed;
    }
    int getHeight(){
        return this.height;
    }
}
