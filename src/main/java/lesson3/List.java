package lesson3;


import java.util.Arrays;
import java.util.Objects;

public class List {
    private Bus[] BusList = new Bus[9999];

    int k = 0;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return k == list.k &&
                Arrays.equals(BusList, list.BusList);
    }

    @Override
    public String toString() {
        return "List{" +
                "BusList=" + Arrays.toString(BusList) +
                ", k=" + k +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(k);
        result = 31 * result + Arrays.hashCode(BusList);
        return result;
    }

    public void addBus(Bus n) {
        BusList[k++] = n;
    }


    public void AllBusList() {
        for (Bus m : BusList) {
            if (m != null) {

                System.out.print("Name " + m.getName());
                System.out.print(" Bus number " + m.getBusNumber());
                System.out.print(" Bus rout " + m.getRoutNumber());
                System.out.print(" Model " + m.getModel());
                System.out.print(" Start year " + m.getStartYear());
                System.out.println(" Millage " + m.getMileage());
            }
        }
    }


    public void ListWithRoutNumber(int q) {
        for (Bus m : BusList)
            if (m != null) {
                if (q == m.getRoutNumber()) {
                    System.out.print("Name " + m.getName());
                    System.out.print(" Bus number " + m.getBusNumber());
                    System.out.print(" Bus rout " + m.getRoutNumber());
                    System.out.print(" Model " + m.getModel());
                    System.out.print(" Start year " + m.getStartYear());
                    System.out.println(" Millage " + m.getMileage());
                }
            }
    }

    public void ListTimeOutForBus(int q) {
        int year = 2018;
        for (Bus m : BusList)
            if (m != null) {
                if (q < (year - m.getStartYear())) {
                    System.out.print("Name " + m.getName());
                    System.out.print(" Bus number " + m.getBusNumber());
                    System.out.print(" Bus rout " + m.getRoutNumber());
                    System.out.print(" Model " + m.getModel());
                    System.out.print(" Start year " + m.getStartYear());
                    System.out.println(" Millage " + m.getMileage());
                }
            }

    }

    public void ListMillageForBus(int q) {
        for (Bus m : BusList)
            if (m != null) {
                if (q < m.getMileage()) {
                    System.out.print("Name " + m.getName());
                    System.out.print(" Bus number " + m.getBusNumber());
                    System.out.print(" Bus rout " + m.getRoutNumber());
                    System.out.print(" Model " + m.getModel());
                    System.out.print(" Start year " + m.getStartYear());
                    System.out.println(" Millage " + m.getMileage());
                }
            }
    }
}
