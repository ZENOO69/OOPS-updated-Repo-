
class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) { length = l; breadth = b; }
    int Area() { return length * breadth; }

    public static void main(String[] args) {
        System.out.println(new Rectangle(4, 5).Area());
        System.out.println(new Rectangle(5, 8).Area());
    }
}
