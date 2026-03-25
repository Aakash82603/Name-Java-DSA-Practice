class rectangleArea
{
   // double length;
    //double breadth;
    public void display(double length, double breadth)
    {
        double area= length*breadth;
        System.out.println("Area of rectangle is :" +  area);
    }
}


public class Rectangle {
    public static void main(String[] args) 
    {
         rectangleArea obj= new rectangleArea();
         obj.display(4, 5);

        

    }
    
}
