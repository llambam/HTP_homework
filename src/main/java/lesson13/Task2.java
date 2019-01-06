package lesson13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 implements FileName {
    public int randomInt;
    public String randomString;
    private int numberOfIntInArray = 10;


    void creationFileWithRandomInt() {

        try (FileWriter fileWriter = new FileWriter(FILE_NAME_TASK2)) {
            for (int i = 0; i < numberOfIntInArray; i++) {
                randomInt = (int) (Math.random() * 100);
                randomString = "" + randomInt;
                fileWriter.write(randomString);
                fileWriter.write("\r\n");

            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void sortingNumbersInFile() {
        try {
            Scanner scanner = new Scanner(new File(FILE_NAME_TASK2));
            List<Integer> intList = new ArrayList<>();
            while (scanner.hasNext()) {
                int i = Integer.parseInt(scanner.next());
                intList.add(i);
            }
            Collections.sort(intList);
            System.out.println(Arrays.toString(intList.toArray()));
            fileWriter(Arrays.toString(intList.toArray()), FILE_NAME_TASK2);

        } catch (Exception e) {
            System.out.println("Error!! ");
        }

    }

    void fileWriter(String wordToWrite, String fileName) {
        try {
            File file = new File(fileName);
            file.delete();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(wordToWrite);
            fileWriter.flush();

        } catch (Exception e) {
            System.out.println("Error ");
        }
    }

}
//        2. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию