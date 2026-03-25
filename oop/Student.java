class StudentDetails{
    String Name;
    Double Marks;
    public void display()
    {
        System.out.println("Name: " + Name   + "  marks: " + Marks);
        
    }
  
}

public class Student {
    public static void main(String[] args)
     {
        StudentDetails obj= new StudentDetails();
        obj.Name="Rahul";
        obj.Marks=85.0;
        obj.display();
        StudentDetails obj1= new StudentDetails();
        obj1.Name="Aakash";
        obj1.Marks=90.0;
        obj1.display();
    }
    
}
