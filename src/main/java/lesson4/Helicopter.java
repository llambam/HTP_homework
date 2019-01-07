package lesson4;

public class Helicopter extends AirTransport {
    private int BladeCount;


    public Helicopter(){}
    public Helicopter(int bladeCount) {
        BladeCount = bladeCount;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "BladeCount=" + BladeCount +
                '}';
    }

    public Helicopter(int enginesCoutn, int bladeCount) {
        super(enginesCoutn);
        BladeCount = bladeCount;
    }

    public Helicopter(int maxSpeed, boolean landTransport, int loadCapacityKG, int startYear, int enginesCoutn, int bladeCount) {
        super(maxSpeed, landTransport, loadCapacityKG, startYear, enginesCoutn);
        BladeCount = bladeCount;
    }

    public int getBladeCount() {
        return BladeCount;
    }

    public void setBladeCount(int bladeCount) {
        BladeCount = bladeCount;
    }

    public void PrintAbstrMethodHel(){
        AbstractMethod1();
        AbstractMethod2();
    }
}
