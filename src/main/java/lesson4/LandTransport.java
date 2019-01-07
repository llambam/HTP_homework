package lesson4;

public class LandTransport extends Transort {
private int WhellsNumber;
private String Model;

    public int getWhellsNumber() {
        return WhellsNumber;
    }

    public void setWhellsNumber(int whellsNumber) {
        WhellsNumber = whellsNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public LandTransport(){}
    public LandTransport(int whellsNumber, String model) {
        WhellsNumber = whellsNumber;
        Model = model;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "WhellsNumber=" + WhellsNumber +
                ", Model='" + Model + '\'' +
                '}';
    }

    public LandTransport(int maxSpeed, boolean landTransport, int loadCapacityKG, int startYear, int whellsNumber, String model) {
        super(maxSpeed, landTransport, loadCapacityKG, startYear);
        WhellsNumber = whellsNumber;
        Model = model;
    }

    @Override
    void AbstractMethod1() {
        System.out.println("AM1, land");
    }

    @Override
    void AbstractMethod2() {
        System.out.println("AM2, land");
    }
}
