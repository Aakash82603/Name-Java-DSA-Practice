abstract class Employee{
    String company="TCS";
    String name;
    public  Employee(String name){
        this.name=name;
    }
    abstract void work();
    public void ShowInfo(){
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }
}
interface Trainable{
     void train();

}
class Developer extends Employee implements Trainable{
    Developer(String name){
        super(name);

    }
      public void work() {
            System.out.println(name + " is working as a developer at " + company);
        }

       public void train() {
            System.out.println(name + " is training to improve coding skills.");
        }

}
public class EmployeeDeveloper{
    public static void main(String[] args) {
        Developer d=new Developer("Aakash");
        d.ShowInfo();
        d.work();
        d.train();


    }
}
