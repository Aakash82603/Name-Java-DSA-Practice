class Vehicle{
    String brand;
    public Vehicle(String brand)
    {
        this.brand=brand;
    }
    void displayInfo(){
         System.out.println("Brand: " + brand);
     }
}
class Car extends Vehicle{
    String model;
    public Car(String brand, String model)
    {
        super(brand);
        this.model=model;
    }
     void displayInfo(){
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}



public class VehicleCar {
    public static void main(String[] args) {
        car myCar= new car("Toyota", "Fortuner");
        myCar.displayInfo();
    
}}
