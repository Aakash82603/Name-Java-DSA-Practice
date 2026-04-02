package day11;
@FunctionalInterface
interface mathOperations{
    void operate(int a, int b);

}
public class FunctionalInterfacesCalculator {
    public static void main(String[] args) {
        mathOperations op= new mathOperations() {
            @Override
            public void operate(int a, int b) {
                int result=a+b;
                System.out.println("Addition: " +result);
            }
        };
        mathOperations op1= new mathOperations() {
            public void operate(int a, int b) {
                int result=a-b;
                System.out.println("Subtraction: " +result);
            }
        };
        mathOperations op2= new mathOperations() {
            @Override
            public void operate(int a, int b) {
                int result=a*b;
                System.out.println("Multiplication: " +result);
            }
        };
        op.operate(20,30);
        op1.operate(40,30);
        op2.operate(2,30);
    }
}
