abstract class Payment{
    String currency = "INR";
    abstract void pay(int amount);
    void showCurrency(){
        System.out.println(currency);
    }
}
class CreditCard extends Payment{
    void pay(int amount){
        System.out.println("Credit Card Payment for "+amount);
    }
}
class UPI extends Payment{
    void pay(int amount){
        System.out.println("UPI Payment for "+amount);
    }
}
 public class PaymentSystem{
    public static void main(String[] args){
        CreditCard cc=new CreditCard();
        cc.pay(100);
        cc.showCurrency();
        UPI upi=new UPI();
        upi.pay(100);
        upi.showCurrency();

    }
 }
