import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a=6;
        int b=7;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the operator do you want to perform");
        String choice = scanner.nextLine();
        switch (choice) {
            case "+":
                System.out.println(a+b);
                break;
             case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
             case "/":
                    System.out.println(a/b);
                    break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
    
}
