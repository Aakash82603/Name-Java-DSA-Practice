  class car{
    private String brand;
    private int speed;
    public car(String brand, int speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
     public String getBrand()
     {
        return this.brand;
     }
     public int getSpeed()
     {
        return this.speed;
     }
     public void showDetails()
     {
        System.out.println("Brand:" + this.brand);
        System.out.println("Speed:" + this.speed);
     }

    
}

public class Constructor {
    public static void main(String[] args)
    {
         car c =new car("Toyota", 120);
         c.showDetails();
    }
    
}
