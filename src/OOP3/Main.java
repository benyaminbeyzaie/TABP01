package OOP3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static Car car;

    public static void main(String[] args) {
        Car car = new Car("a", 10, 20);
        Car car1 = new Car("b", 14, 200);
        Car car2 = new Car("c", 14, 28);
        Car car3 = new Car("d", 18, 21);
        Car car4 = new Car("f", 17, 22);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + ", ");
        }

        // Quick sort
        Collections.sort(cars);
        System.out.println();
        System.out.println("____________");

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + ", ");
        }

        // speed
        // weight

        // goCar
    }
}
