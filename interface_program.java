package experiments;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class interface_program  {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
