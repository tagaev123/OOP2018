public class Main {
    public static void main(String[] args){
      Plane plane = new Plane();

      plane.start();
      for(int i = 0; i < 6; i++){
          plane.speedUp();
      }
        System.out.println(plane.getSpeed());
      plane.brake();
        System.out.println(plane.getSpeed());
        System.out.println(plane.getHeight());
      for(int i = 0; i < 10; i++){
          plane.up();
      }
        System.out.println(plane.getHeight());
    }
}
