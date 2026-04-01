package Anonymousclass;
interface Notification{
    void send();
}
public class NotificationSystem {
    public static void main(String[] args) {
       Notification n1=new Notification(){
           public void send(){
               System.out.println("\uD83D\uDCE6 Order Placed Successfully!");
           }
       };
        Notification n2=new Notification(){
            public void send(){
                System.out.println("\uD83D\uDEB4 Your order is Out for Delivery!");
            }
        };
        Notification n3=new Notification() {
            public void send() {
                System.out.println("✅ Order Delivered! Enjoy your meal!\n");
            }
        };
        n1.send();
        n2.send();
        n3.send();
    }
}
