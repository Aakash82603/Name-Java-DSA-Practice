package day10abstraction;
abstract class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
    abstract void sound();
    public void show(){
        System.out.println("Name: " + name);

    }
}
class Lion extends Animal{
    public Lion(String name){
        super(name);
    }
    void sound(){
        System.out.println("Lion roars");
    }
}
class Elephant extends Animal{
    public Elephant(String name){
        super(name);
    }
    void sound(){
        System.out.println("Elephant trumpets");
    }
}
public class AnimalDetail {
    public static void main(String[] args) {
        Lion l=new Lion("Lion");
        Elephant e=new Elephant("Elephant");
        l.show();
        l.sound();
        e.show();
        e.sound();
    }


}
