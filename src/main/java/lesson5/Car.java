package lesson5;

public class Car implements SecondInterface, ThirdInterface {
    private String carName;
    private int carSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carSpeed=" + carSpeed +
                '}';
    }

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public Car(String carName) {
        this.carName = carName;
    }

    public Car(String carName, int carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    @Override
    public void if2Method() {

    }

    @Override
    public void if3Method1() {

    }

    @Override
    public void if3Method2() {

    }
}
