package OOP2;

public abstract class Quadrilateral extends Shape{
    // "Name of object"
    private String type;
    Quadrilateral(int x, int y, String type) {
        super(x, y);
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
