package OOP2;

public class Rectangle extends Quadrilateral{
    private int a;
    private int b;
    Rectangle(int x, int y, int a, int b) {
        super(x, y, "Rectangle");
        this.a = a;
        this.b = b;
    }

    public int calculateArea() {
        return a * b;
    }
}
