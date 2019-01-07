package lesson4;

public class Car extends LandTransport {
private boolean PassangerCar;
public Car(){}

    public boolean isPassangerCar() {
        return PassangerCar;
    }

    public void setPassangerCar(boolean passangerCar) {
        PassangerCar = passangerCar;
    }

    public Car(boolean passangerCar) {
        PassangerCar = passangerCar;
    }

    public Car(int whellsNumber, String model, boolean passangerCar) {
        super(whellsNumber, model);
        PassangerCar = passangerCar;
    }

    public Car(int maxSpeed, boolean landTransport, int loadCapacityKG, int startYear, int whellsNumber, String model, boolean passangerCar) {
        super(maxSpeed, landTransport, loadCapacityKG, startYear, whellsNumber, model);
        PassangerCar = passangerCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "PassangerCar=" + PassangerCar +
                '}';

    }

    public void PrintAbstrMethodCar(){
        AbstractMethod1();
        AbstractMethod2();
    }
}
