package OOP3;

public class Car implements Comparable<Car> {
    private final int maxSpeed;
    private final int weight;
    private final String name;

    Car(String name, int maxSpeed, int weight){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.maxSpeed > o.maxSpeed) return 1;
        else if (this.maxSpeed == o.maxSpeed) {
            if (this.weight > o.weight) return 1;
            else if (this.weight == o.weight) return 0;
            return -1;
        }
        else return -1;
    }
}
