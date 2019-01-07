package lesson4;

public class MainClass {
    public static void main(String[] args) {


        Helicopter[] HelInfo = new Helicopter[3];
        HelInfo[0]=new Helicopter(400,false,500,2005,2,4);
        HelInfo[1]=new Helicopter(450,false,400,2005,4,4);
        HelInfo[2]=new Helicopter(400,false,550,2015,2,2);

        Car[] CarInfo = new Car[3];
        CarInfo[0]=new Car(120,true,220,1995,4,"Mazda",true);
        CarInfo[1]=new Car(100,true,2500,2005,12,"Mersedes(gryzovoi)",false);
        CarInfo[2]=new Car(170,true,210,2016,4,"Mazda",true);

        TransportList List = new TransportList();

        for(Helicopter k:HelInfo){
            List.addHel(k);
        }
        for(Car l:CarInfo){
            List.addCar(l);
        }
        List.HelFasterThen(420);

        Helicopter Hell = new Helicopter();
        Hell.PrintAbstrMethodHel();
    Car Carr = new Car();
        Carr.PrintAbstrMethodCar();


    }
//        создать иерархию наследования на 3 уровня с абстрактным классом и 2-мя абстрактными методами,
// тематика Транспорт, переопределить методы equals hashCode, toString, перегрузить и переопределить 2 метода
// в классах и конструкторах, продемонстрировать работу с массивами объектов из иерархии классов (сортировать
// по критериям, суммарный подсчет параметров транспорта и т.д.)

}
