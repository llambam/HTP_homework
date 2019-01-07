package lesson1;

import java.util.Scanner;

public class Lesson1HW {
   private double veightOnEarth;
   private double moonGrav = 0.16;
   private double veightOnMoon;
   private double[] b;
   private double coeficient = 1.1;
   private int polindrom;
   private int[] polindr;
   private boolean t;
   private int sum;
   private int mes;
   private int first;
   private int second;
   private int third;
   private boolean fl;
   private boolean tr;
   private String s1;
   private String s2;
   private String s3;
   private int h1;
   private int h2;
   private int u = 1;
   private int min;
   private int max;
   private int step;
   private int[] a;
   private int maxmass;
   private double byn;
   private double course;
   private double usd;
   private int days;
   private int hours;
   private int minuts;
   private int seconds;

    public static void main(String[] args) {
        Lesson1HW lesson1HW = new Lesson1HW();
        lesson1HW.lesson1HW();
    }

    private void lesson1HW() {

// _________________________________________________________________________

        System.out.println("Задача №1");

        Scanner in = new Scanner(System.in);
        System.out.print("Вес на земле: ");
        veightOnEarth = in.nextDouble();

        veightOnMoon = veightOnEarth * moonGrav;
        System.out.println("Вес на луне:  " + veightOnMoon);

// _________________________________________________________________________
        System.out.println("Задача №2");
        b = new double[]{5, 10, 0, -5, 16, -2};
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] * coeficient;
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");


// _________________________________________________________________________

        System.out.println("Задача №3");

        System.out.print("Введите число для проверки на полиндром: ");
        polindrom = in.nextInt();

        polindr = new int[]{1, 2, 3, 4, 3, 2, 1};
        t = true;
        for (int i = 0; i < polindr.length; i++)
            if (polindr[i] != polindr[polindr.length - i - 1]) t = false;
        System.out.println(t ? "Это полиндром " : " Это не полиндром");


// _________________________________________________________________________
        System.out.println("Задача №4");
        System.out.print("");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

// _________________________________________________________________________
        System.out.println("Задача №5");
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
// _________________________________________________________________________
        System.out.println("Задача №6");
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("");


// _________________________________________________________________________
        System.out.println("Задача №7");

        sum = 0;
        for (int i = 20; i <= 200; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 20 до 200: " + sum);

// _________________________________________________________________________
        System.out.println("Задача №8");
        for (int i = 1; i <= 12; i++) {
            mes = i;
            switch (mes) {
                case 1:
                    System.out.println("январь");
                    break;
                case 2:
                    System.out.println("февраль");
                    break;
                case 3:
                    System.out.println("март");
                    break;
                case 4:
                    System.out.println("апрель");
                    break;
                case 5:
                    System.out.println("май");
                    break;
                case 6:
                    System.out.println("июнь");
                    break;
                case 7:
                    System.out.println("июль");
                    break;
                case 8:
                    System.out.println("август");
                    break;
                case 9:
                    System.out.println("сентябрь");
                    break;
                case 10:
                    System.out.println("октябрь");
                    break;
                case 11:
                    System.out.println("ноябрь");
                    break;
                case 12:
                    System.out.println("декабрь");
                    break;
            }
        }
// _________________________________________________________________________
        System.out.println("Задача №9");
        first = 45;
        second = 3;
        third = 0;
        System.out.println(first + "  " + second);
        third = first;
        first = second;
        second = third;
        System.out.println(first + "  " + second);


// _________________________________________________________________________
        System.out.println("Задача №10");
        System.out.println(third = second + first);
// _________________________________________________________________________
        System.out.println("Задача №11");
        if (first > second && first > third) {
            System.out.println(first);
        }
        if (second > first && second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
// _________________________________________________________________________
        System.out.println("Задача №12");
        tr = true;
        fl = false;
        if (tr == true) {
            System.out.println("Истина");
        } else {
            System.out.println("Ложь");
        }
        if (fl == true) {
            System.out.println("Истина");
        } else {
            System.out.println("Ложь");
        }

// _________________________________________________________________________
        System.out.println("Задача №13");
        s1 = new String("fir");
        s2 = new String("st");
        s3 = s1 + s2;
        System.out.println(s3);

// _________________________________________________________________________


        System.out.println("Задача №14");
        h1 = 6;
        h2 = 9;
        if (h1 > h2) {
            h1 = h1 + 3;
        } else {
            h2 = h2 + 8;
        }
        System.out.println(h1 + " " + h2);

// _________________________________________________________________________

        System.out.println("Задача №15");
        for (u = 1; u <= 100; u++) {
            System.out.print(u + " ");
        }
        System.out.println(" ");

        while (u <= 100) {
            System.out.print(u + " ");
            u++;
        }
        System.out.println(" ");
        u = 1;
        do {
            System.out.print(u + " ");
            u++;
        } while (u <= 100);
        System.out.println(" ");

// _________________________________________________________________________

        System.out.println("Задача №16");
        System.out.print("MIN: ");
        min = in.nextInt();
        max = in.nextInt();
        step = in.nextInt();
        System.out.print("MAX: ");
        System.out.print("Длинна шага: ");

        for (int i = min; i <= max; i = i + step) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("Задача №17");
        final int HOURS_IN_DAY = 24;
        final int MINUTS_IN_HOUR = 60;
        final int SECONDS_IN_MINUT = 60;
        a = new int[]{5, 10, 0, -5, 16, -2};
        maxmass = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (maxmass < a[i]) {
                maxmass = a[i];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] / maxmass;
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
// _________________________________________________________________________


        System.out.println("Задача №18");
        System.out.print("Рублей BYN: ");
        byn = in.nextDouble();
        System.out.print("Курс USD/BUN: ");
        course = in.nextDouble();
        usd = byn * course;
        System.out.println(usd);

// _________________________________________________________________________


        System.out.println("адвансед №2");
        System.out.print("Суток: ");
        days = in.nextInt();
        hours = HOURS_IN_DAY * days;
        minuts = hours * MINUTS_IN_HOUR;
        seconds = minuts * SECONDS_IN_MINUT;

        System.out.println("В " + days + " сутках " + hours + " часов " + minuts + " минут или " + seconds + " секунд");

    }
}