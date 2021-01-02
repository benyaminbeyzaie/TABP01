package OOP2;

public class Triangle extends Shape {
    private int sizeA;
    private final int sizeB;
    private final int sizeC;

    Triangle(int x, int y, int sizeA, int sizeB, int sizeC) {
        super(x, y);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    public int getSizeA(){
        return sizeA;
    }

    public void setSizeA(int newSize){
        if (newSize <= 0) System.out.println("Input is invalid");
        else sizeA = newSize;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
