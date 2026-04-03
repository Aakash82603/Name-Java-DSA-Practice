enum OrderStatus{
    PLACED, SHIPPED, DELIVERED, CANCELLED;

    }
@FunctionalInterface
interface Notification{
    void send();

}
interface Trackable{};

class order implements Trackable {
    int orderId;
    String product;
     OrderStatus status;
      public order(int orderId, String product,  OrderStatus status) {
          this.orderId = orderId;
          this.product = product;
          this.status=status;

      }
      public void showOrder(){
          System.out.println("Order ID: " + orderId);
          System.out.println("Product: " + product);
          System.out.println("Order Status: " + status);

      }
        public void updateStatus(OrderStatus newStatus){
          this.status=newStatus;
          System.out.println("Order Status: " + status);
        }
}


public class OnlineShoppingSystem {
    public static void main(String[] args) {
        order o1 = new order(101, "iphone16", OrderStatus.PLACED);
        o1.showOrder();
        o1.updateStatus(OrderStatus.SHIPPED);

        Notification n = new Notification() {
            public void send() {
                System.out.println("your order has confirmed");
            }
        };
        n.send();
        if (o1 instanceof Trackable) {
            System.out.println("✅ Order is trackable!");

        }
    }
}