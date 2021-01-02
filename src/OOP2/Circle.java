package OOP2;

public class Circle extends Shape {
    private int radius;
    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int calculateArea() {
        return radius * radius * 3;
    }
}
