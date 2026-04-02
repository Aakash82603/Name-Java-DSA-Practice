package day11;
enum MobilePlan{
    BASIC(149 , "1GB/day"),STANDARD(249 , "2GB/day"),PREMIUM(449 , "3GB/day");
    private int price;
    private String data;
    MobilePlan(int price, String data){
        this.price=price;
        this.data=data;
    }
    public int getprice(){
        return price;
    }
    public String getdata(){
        return data;
    }
    void showPlan(){

        System.out.println("Plan: "+this.name()+" | Price: "+price+" | Data: "+data);
    }
}
public class MobilePhonesPlan {
    public static void main(String[] args) {
        MobilePlan m = MobilePlan.BASIC;
        MobilePlan m1 = MobilePlan.STANDARD;
        MobilePlan m2 = MobilePlan.PREMIUM;
        m.showPlan();
        m1.showPlan();
        m2.showPlan();

    }
}
