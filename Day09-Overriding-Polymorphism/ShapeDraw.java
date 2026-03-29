class Shape{
    void draw()
    {
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape{
    void draw()
    {
        super.draw();
        System.out.println("Drawing a Circle");
    }
}
class Triangle extends Shape{
    void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}


public class ShapeDraw {
    public static void main(String[] args)
    {  
        Shape shape1=new Circle();
        shape1.draw();
        Shape shape2=new Triangle();
        shape2.draw();

    }
    
}
