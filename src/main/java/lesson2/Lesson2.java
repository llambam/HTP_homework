package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //Task 1. Write a Java program to sort a numeric array and a string array.
        //Task 2. Write a Java program to sum values of an array.
        //Task 3. Write a Java program to print the following grid
        //Task 4.  Write a Java program to calculate the average value of array elements.
        //Task 5.  Write a Java program to test if an array contains a specific value.
        //Task 6.  Write a Java program to find the index of an array element.
        //Task 7.  Write a Java program to remove a specific element from an array.
        //Task 8.  Write a Java program to copy an array by iterating the array.
        //Task 9.  Write a Java program to insert an element (specific position) into an array.
        //Task 10. Write a Java program to find the maximum and minimum value of an array.
        //Task 11. Write a Java program to reverse an array of integer values.
        //Task 12. Write a Java program to find the duplicate values of an array of integer values.
        //Task 13. Write a Java program to find the duplicate values of an array of string values.
        //Task 14. Write a Java program to find the common elements between two arrays (string values).
        //Task 15. Write a Java program to find the common elements between two arrays of integers.
        //Task 16. Write a Java program to remove duplicate elements from an array.
        //Task 17. Write a Java program to find the second largest element in an array.
        //Task 18. Write a Java program to find the second smallest element in an array.
        //Task 19. Write a Java program to add two matrices of the same size.
        //Task 20. Write a Java program to convert an array to ArrayList.


        //Task 1. Write a Java program to sort a numeric array and a string array.
        System.out.println("Task 1. Write a Java program to sort a numeric array and a string array.");
        int[] masFirst = {
                1900, 200,
                300, 400, 500
        };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < masFirst.length - 1; i++) {
                if (masFirst[i] < masFirst[i + 1]) {
                    isSorted = false;

                    buf = masFirst[i];
                    masFirst[i] = masFirst[i + 1];
                    masFirst[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(masFirst));
        String[] myarray1 = {
                "Python",
                "C",
                "C",
                "C#",
                "C++"
        };
        System.out.println("Array old: " + Arrays.toString(myarray1));
        Arrays.sort(myarray1);
        System.out.println("Array new: " + Arrays.toString(myarray1));


        System.out.println("Task 2. Write a Java program to sum values of an array.");

        int sum = 0;
        for (int i = 0; i < masFirst.length; i++) {
            sum = sum + masFirst[i];
        }
        System.out.println("Сумма массива: " + sum);

        System.out.println("Task 3. Write a Java program to print the following grid");
        sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print("-");
            }
        }
        System.out.println(" ");

        System.out.println("Task 4.  Write a Java program to calculate the average value of array elements.");
        sum = 0;
        for (int i = 0; i < masFirst.length; i++) {
            sum = sum + masFirst[i];
            if (i == masFirst.length - 1) {
                int middle = i;
                sum = sum / middle;
            }
        }
        System.out.println("Среднее значение массива: " + sum);

        System.out.println("Task 5.  Write a Java program to test if an array contains a specific value.");
        Scanner in = new Scanner(System.in);
        System.out.print("Число для поиска: ");
        int vvodnoe = in.nextInt();
        for (int i = 0; i < masFirst.length; i++) {
            if (masFirst[i] == vvodnoe) {
                System.out.println("Совпадение найжено. Номер в массиве: " + i);
                sum = 4545454;
            }

        }
        if (sum != 4545454) {
            System.out.println("совпадений нет");
        }

        System.out.println("Task 6.  Write a Java program to find the index of an array element.");
        System.out.print("Число для поиска номера в массиве: ");
        int vvodnoeSecond = in.nextInt();
        for (int i = 0; i < masFirst.length; i++) {
            if (masFirst[i] == vvodnoeSecond) {
                System.out.println("Совпадение найжено. Номер в массиве: " + i);
                sum = 454545477;
            }

        }
        if (sum != 454545477) {
            System.out.println("совпадений нет");
        }

        //Task 7.  Write a Java program to remove a specific element from an array.
        System.out.println("Task 7.  Write a Java program to remove a specific element from an array.");
        System.out.println(Arrays.toString(masFirst));
        int removeIndex = 1;

        for (int i = removeIndex; i < masFirst.length - 1; i++) {
            masFirst[i] = masFirst[i + 1];
        }

// Не уменьшаю размер массива. ПРосто сдвигаю все элементы на 1 назад а последний дублирую. Как правильно?


        System.out.println("After removing the second element: " + Arrays.toString(masFirst));

        System.out.println("Task 8.  Write a Java program to copy an array by iterating the array.");
        // by iterating - имеется в виду копировать по одному значению через цикл?
        int[] new_array = new int[5];
        System.out.println("Source Array : " + Arrays.toString(masFirst));

        for (int i = 0; i < masFirst.length; i++) {
            new_array[i] = masFirst[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));


        System.out.println("Task 9.  Write a Java program to insert an element (specific position) into an array.");
        System.out.println("Введите элемент для вставки: ");
        int element = in.nextInt();
        System.out.println("Введите номер значения(0-4): ");
        int number = in.nextInt();
        masFirst[number] = element;
        System.out.println(Arrays.toString(masFirst));


        System.out.println("Task 10. Write a Java program to find the maximum and minimum value of an array.");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < masFirst.length; i++) {
            if (masFirst[i] > max) {
                max = masFirst[i];
            }
            if (masFirst[i] < min) {
                min = masFirst[i];
            }

        }
        System.out.println("Максимум " + max + " Минимум " + min);


        System.out.println("Task 11. Write a Java program to reverse an array of integer values.");
        int[] masForRevers = {
                55, 2500,
                55, 40, 7
        };
        int[] nullArray = new int[5];
        for (int i = 0; i < masForRevers.length; i++) {
            nullArray[i] = masForRevers[i];
        }
        System.out.println(Arrays.toString(masForRevers));
        System.out.println(Arrays.toString(nullArray));
        int jordan = 5;
        for (int i = 0; i < nullArray.length; i++) {
            jordan--;
            masForRevers[i] = nullArray[jordan];

        }
        System.out.println(Arrays.toString(masForRevers));

        System.out.println("Task 12. Write a Java program to find the duplicate values of an array of integer values.");
        for (int i = 0; i < masFirst.length; i++) {
            for (int j = 0; j < masFirst.length; j++) {
                if (i != j && masFirst[i] == masFirst[j] && i < j) {
                    System.out.println("совпадают значения номер " + i + " и " + j + " и имеет значение " + masFirst[i]);
                }
            }
        }


        System.out.println("Task 13. Write a Java program to find the duplicate values of an array of string values.");
        for (int i = 0; i < myarray1.length; i++) {
            for (int j = 0; j < myarray1.length; j++) {
                if (i != j && myarray1[i] == myarray1[j] && i < j) {
                    System.out.println("совпадают значения номер " + i + " и " + j + " и имеет значение " + myarray1[i]);
                }
            }
        }


        System.out.println("Task 14. Write a Java program to find the common elements between two arrays (string values).");
        int[] forCommonInt = {
                100, 200,
                300, 400, 500
        };
        String[] forCommonStr = {"Mr.", "Mrs. ", "Ms. ", "C", "d"};

        for (int i = 0; i < myarray1.length; i++) {
            for (int j = 0; j < myarray1.length; j++) {
                if (i != j && myarray1[i] == forCommonStr[j] && i < j) {
                    System.out.println("совпадают значения номер " + i + " и " + j + " и имеет значение " + myarray1[i]);
                }
            }
        }


        for (int i = 0; i < myarray1.length; i++) {
            for (int j = 0; j < myarray1.length; j++) {
                if (i != j && masFirst[i] == forCommonInt[j] && i < j) {
                    System.out.println("совпадают значения номер " + i + " и " + j + " и имеет значение " + myarray1[i]);
                }
            }
        }


        //Task 16. Write a Java program to remove duplicate elements from an array.
        // тожесамое что и таск 7 - я не понимаю как сделать ремув

        System.out.println("Task 17. Write a Java program to find the second largest element in an array.");
        System.out.println("Task 18. Write a Java program to find the second smallest element in an array.");
        isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < masFirst.length - 1; i++) {
                if (masFirst[i] < masFirst[i + 1]) {
                    isSorted = false;

                    buf = masFirst[i];
                    masFirst[i] = masFirst[i + 1];
                    masFirst[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(masFirst));
        System.out.println("Второе наименьшее: " + masFirst[masFirst.length - 2]);
        System.out.println("Второе наибольшее: " + masFirst[1]);

        //Task 19. Write a Java program to add two matrices of the same size.
        System.out.println("Task 19. Write a Java program to add two matrices of the same size.");
        int m, n, c, d;
        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        System.out.println("Input elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                array1[c][d] = in.nextInt();

        System.out.println("Input the elements of second matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                array2[c][d] = in.nextInt();
        int colums = n;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }


}





