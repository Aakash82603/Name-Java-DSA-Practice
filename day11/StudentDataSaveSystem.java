package day11;

interface Saveable {
    void saveToDatabase();
}

class Student implements Saveable {
    public void saveToDatabase() {
        System.out.println("Student data saved to database.");
    }
}

class TempData {
    void showMessage() {
        System.out.println("TempData is not saveable.");
    }
}

public class StudentDataSaveSystem {
    public static void main(String[] args) {
        Object s1 = new Student();
        Object t1 = new TempData();

        if (s1 instanceof Saveable) {
            ((Saveable) s1).saveToDatabase();
        } else {
            System.out.println("s1 does not implement Saveable.");
        }

        if (t1 instanceof Saveable) {
            ((Saveable) t1).saveToDatabase();
        } else {
            System.out.println("t1 does not implement Saveable.");
        }
    }
}
