package lesson4;

import java.util.Objects;

public abstract class Transort {
    private int MaxSpeed;
    private boolean LandTransport;
    private int LoadCapacityKG;
    private int StartYear;

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public boolean isLandTransport() {
        return LandTransport;
    }

    public void setLandTransport(boolean landTransport) {
        LandTransport = landTransport;
    }

    public int getLoadCapacityKG() {
        return LoadCapacityKG;
    }

    public void setLoadCapacityKG(int loadCapacityKG) {
        LoadCapacityKG = loadCapacityKG;
    }

    public int getStartYear() {
        return StartYear;
    }

    public void setStartYear(int startYear) {
        StartYear = startYear;
    }

    public Transort(){

    }

    public Transort(int maxSpeed, boolean landTransport, int loadCapacityKG, int startYear) {
        MaxSpeed = maxSpeed;
        LandTransport = landTransport;
        LoadCapacityKG = loadCapacityKG;
        StartYear = startYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transort transort = (Transort) o;
        return MaxSpeed == transort.MaxSpeed &&
                LandTransport == transort.LandTransport &&
                LoadCapacityKG == transort.LoadCapacityKG &&
                StartYear == transort.StartYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaxSpeed, LandTransport, LoadCapacityKG, StartYear);
    }

    abstract void AbstractMethod1();
    abstract void AbstractMethod2();

}
