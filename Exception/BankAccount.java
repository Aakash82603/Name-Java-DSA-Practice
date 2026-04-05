package Exception;
class BAccount{
    String account;
    int[] accounts;
    int amount;
    public BAccount(String account, int[] accounts, int amount) {
        this.account = account;
        this.accounts = accounts;
        this.amount = amount;
    }
    public void processTransaction(){
        try{
            System.out.println("Processing null account...");
            System.out.println(account.length());
        }catch(NullPointerException e){
            System.out.println("Account not found");
        }
        try{
            System.out.println("Processing wrong index...");
            int x=accounts[10];
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid account index");
        }
        try{

            System.out.println("Processing zero amount...");
            int result = 10 / amount;
        }catch(ArithmeticException e){
            System.out.println("Invalid account amount");
        }


    }
}
public class BankAccount {
    public static void main(String[] args) {

        BAccount b1=new BAccount(null ,new int[]{1,2,3},0);
           b1.processTransaction();
    }
}
