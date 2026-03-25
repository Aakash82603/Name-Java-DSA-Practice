class add
{
      //int a=5;
    public void add(int a , int b)
    {
        //int b=10;
        int sum=a+b;
        System.out.println("sum of a and b= " +sum);
    }
       public void add(double a , int b, int c)//method overloading
       {
        double sum=a+b+c;// double to int conversion
        System.out.println("Sum of 3 variable is: " +sum);
    }
}
public class cls{
    public static void main(String[] args) {
        {
            add obj= new add();//object creation
                obj.add(5,10);
            obj.add(5,10,15);
        }
    }
}
