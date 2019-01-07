package lesson4;

//import sun.rmi.transport.Transport;

public class TransportList {

    private Helicopter[] HelList =new Helicopter[3];

    private int k = 0;
    private int l = 0;

//    public TransportList() {
//        Transport = new Transort();
//    }

    public void addHel(Helicopter n) {
        HelList[k++] = n;
    }
    private Car[] CarList =new Car[3];

    public void addCar(Car n) {
        CarList[l++] = n;
    }
//    Transport Transport;
    LandTransport LandTransport = new LandTransport();

    public void HelFasterThen(int q) {
        for (Helicopter m : HelList)
            if (q < m.getMaxSpeed()) {
//                System.out.println(m.toString());
//                System.out.println(Transport.toString());    //не понял, как делать это через туСтринг + как вывести это
//                                                                  из абстрактного класса. Пример бы какой
//                System.out.println(LandTransport.toString());
                System.out.println("Лопасти: "+m.getBladeCount());
                System.out.println("Колво двигателей "+m.getEnginesCoutn());
                System.out.println("Грузоподьемность "+m.getLoadCapacityKG());
                System.out.println("Скорость "+m.getMaxSpeed());
                System.out.println("Год ввода в эксплуатацию "+m.getStartYear());


            }
    }





}
