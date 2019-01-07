package lesson3;

import java.util.Scanner;

import static java.lang.Math.random;

public class MainClass {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of objects: ");
        int numberOfObjects = in.nextInt();


        // objects generator:


        Bus[] BusInfo = new Bus[numberOfObjects];
        for (int i = 0; i < numberOfObjects - 1; i++) {
            String newName = String.valueOf(i);
            int randomInt = (int) (random()); // its always =0  do not understand why ={
            BusInfo[i] = new Bus("Petrov" + newName, 15 + i, 5, "aerobus", 1995 + i, randomInt);
        }


//        BusInfo[0]=new Bus("Petrov",78887,4,"VAZ-01",1995,45000);
//        BusInfo[1]=new Bus("Vadim",787,4,"VAZ-71",1999,456550);
//        BusInfo[2]=new Bus("Dimon",4587,3,"VAZ-01",2005,45900);

        List l = new List();

        for (Bus k : BusInfo) {
            l.addBus(k);
        }

        System.out.println("Весь список: ");
        l.AllBusList();


        System.out.println(" a) список автобусов для заданного номера маршрута;");
        System.out.println("Введите номер маршрута(3 или 4): ");
        l.ListWithRoutNumber(in.nextInt());

        System.out.println("b) список автобусов, которые эксплуатируются больше заданного срока;");
        System.out.println("Введите срок: ");
        l.ListTimeOutForBus(in.nextInt());

        System.out.println("c) список автобусов, пробег у которых больше заданного расстояния.");
        System.out.println("Введите пробег: ");
        l.ListMillageForBus(in.nextInt());


    }
}
