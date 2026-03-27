class StudentDetails{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
       // return 0;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
       // return 0;
    }
    public int getAge()
    {
        return age;
    }
}

public class Demo {
    public static void main(String[] args){
        StudentDetails stud=new StudentDetails();
        stud.setName("Aakash");
        stud.setAge(20);
        System.out.println("Name:" + stud.getName());
        System.out.println("Age:" + stud.getAge());
    }

}
