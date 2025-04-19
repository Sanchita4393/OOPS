package experiments;

class Rectangle {
    int length, width;

    // Default Constructor
    Rectangle() {
        length = 10;
        width = 5;
    }

    // Parameterized Constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Overloaded method
    int area() {
        return length * width;
    }

    int area(int l, int w) {
        return l * w;
    }
}

public class Constructors_and_Overloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7, 3);
        System.out.println("Area 1: " + r1.area());
        System.out.println("Area 2: " + r2.area());
        System.out.println("Area 3 (Overloaded): " + r2.area(8, 2));
    }
}
