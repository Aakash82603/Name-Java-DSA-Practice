package Exception;

public class CalculatorApp {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        try{
            b=18/0;
            b=18/a;
        }catch(ArithmeticException e){
            System.out.println("Divided by zero is not allowed");
        }

        finally{
            System.out.println("Result: "+b);
            System.out.println("calculator continues");
        }
    }
}
