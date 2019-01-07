package lesson5;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Comparator<Car> carCompClass = new CarCompClass();



        List<Car> cars = new LinkedList<>();


        cars.add(new Car("Tesla", 110));
        cars.add(new Car("Mazda", 120));
        cars.add(new Car("Shkoda", 510));
        cars.add(new Car("VAZ", 11));
        cars.add(new Car("GAZ", 999));
        cars.sort(carCompClass);
        cars.forEach(System.out::println);


    }

}
