package lesson4;

public class AirTransport extends Transort {
    private int EnginesCoutn;


    public AirTransport(){

    }
    public AirTransport(int enginesCoutn) {
        EnginesCoutn = enginesCoutn;
    }

    public int getEnginesCoutn() {
        return EnginesCoutn;
    }

    public void setEnginesCoutn(int enginesCoutn) {
        EnginesCoutn = enginesCoutn;
    }

    public AirTransport(int maxSpeed, boolean landTransport, int loadCapacityKG, int startYear, int enginesCoutn) {
        super(maxSpeed, landTransport, loadCapacityKG, startYear);
        EnginesCoutn = enginesCoutn;
    }

    @Override
    void AbstractMethod1() {
        System.out.println("AM1, air");
    }

    @Override
    void AbstractMethod2() {
        System.out.println("AM2, air");
    }



}
