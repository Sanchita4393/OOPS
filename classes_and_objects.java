package experiments;

class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class classes_and_objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.roll = 101;
        s1.display();
    }
}
