class Vehicles{
    void move(){
        System.out.println("Vehicle is moving");
    }
}
 class Bike extends Vehicles{
    void type(){
        System.out.println("this is bike");
    }
 }
  class Car extends Vehicles
  {
    void type(){
        System.out.println("this is car");
    }
}

public class InheritanceDemo {
    
    public static void main(String[] args) {
       
        Bike b=new Bike();
        b.move();
        b.type();
       
        Car c=new Car();
        c.move();
        c.type();
        
    }
}
