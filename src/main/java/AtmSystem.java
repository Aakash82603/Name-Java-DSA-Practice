package Exception;
class ATM{
    int balance=5000;
    int correctpin=1234;

    public void CheckPin(int pin){
        try{
            if(pin!=correctpin){
                throw new Exception("Invalid pin exception");
            }else{
                System.out.println("PIN verified successfully");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Withdraw(int amount){
        try{
            if(amount>balance){
                throw new Exception("Insufficient funds exception");
            }else{//deduct and print balance
                balance-=amount;
                System.out.println("Withdrawal successful. Remaining balance: "+balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Deposit(int amount){
        try{
            if(amount<=0){
                throw new Exception("Invalid deposit amount exception");

            }else{
                balance+=amount;
                System.out.println("Deposit successful. New balance: "+balance);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class AtmSystem {
    public static void main(String[] args) {
        ATM atm=new ATM();
        try {
            atm.CheckPin(9999);
            atm.CheckPin(1234);
            atm.Withdraw(3000);
            atm.Withdraw(9000);
            atm.Deposit(2000);
        } finally {
                System.out.println(" \"Thank you for using ATM!\"");
                   }

    }
}
