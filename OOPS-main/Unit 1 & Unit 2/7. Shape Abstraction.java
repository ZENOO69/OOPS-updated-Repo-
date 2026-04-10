    abstract class Shape {
    abstract void calculate_area();
    void display_info() { System.out.println("This is a shape"); }
}

class Circle extends Shape {
    void calculate_area() { System.out.println("Circle Area"); }
}

class RectangleShape extends Shape {
    void calculate_area() { System.out.println("Rectangle Area"); }
}
