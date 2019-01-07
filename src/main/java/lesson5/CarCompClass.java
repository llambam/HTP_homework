package lesson5;

import java.util.Comparator;

public class CarCompClass implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getCarSpeed() > o2.getCarSpeed()) {
            return 1;
        } else {
            if (o1.getCarSpeed() == o2.getCarSpeed()) {
                return 0;
            } else {
                return -1;
            }

        }

    }
}
