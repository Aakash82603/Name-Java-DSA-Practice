package day11;

enum TraficLight{               // enum is specific class
    RED,YELLOW,GREEN;// constant
}
public class TraficLightSystem {
    public static void main(String[] args){
        TraficLight t=TraficLight.RED;
        switch(t){
            case RED:
                System.out.println("Stop! The light is RED.");
                break;
            case YELLOW:
                System.out.println("Caution! The light is YELLOW.");
                break;
            case GREEN:
                System.out.println("Go! The light is GREEN.");
                break;
        }
        for(TraficLight t1: TraficLight.values()){
            System.out.println(t1);
        }
    }
}
