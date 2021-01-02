package OOP2;

public abstract class Shape {
    final int x;
    final int y;


    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract int calculateArea();

}
