interface Shape{
    void area();

}
class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public void area() {
        double area=3.14*radius*radius;
        System.out.println("Area of Circle: " + area);
    }
}
 class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void area() {
        double area=length*width;
        System.out.println("Area of Rectangle: " + area);
    }
}



public class AreaCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.area();
        
        Rectangle rectangle = new Rectangle(6.0,4.0);
        rectangle.area();

    }
    
}
