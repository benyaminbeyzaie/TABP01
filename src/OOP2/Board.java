package OOP2;

public class Board {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 0 , 3, 4, 5);
        int a = triangle.getSizeA();
        triangle.setSizeA(-2);
        System.out.println(a);
        Quadrilateral rectangle = new Rectangle(10, 20, 12, 10);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println(rectangle.getType());
        Quadrilateral square = new Square(10, 20, 40);
        System.out.println(square.calculateArea());
        Shape circle = new Circle(4, 5, 10);
        System.out.println("Are of circle: " + circle.calculateArea());
    }
}
