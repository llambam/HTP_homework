package lesson13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 implements FileName {
    public String content[];
    public String lines[];
    public static int NUMBER_OF_STRINGS_IN_FILE = 3;
    public String firstWord;
    public String newLine = "";
    public String arrayToWrite[];
    public int lineNumber = 0;

    void writeStringInFile() {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME_TASK3)) {
            content = new String[NUMBER_OF_STRINGS_IN_FILE];
            content[0] = "Can Emmanuel Macron Lead Europe?";
            content[1] = "Nicotine Vaping Surges in U.S. High Schools.";
            content[2] = "What Exactly Is Ankylosing Spondylitis?";
            for (int i = 0; i < NUMBER_OF_STRINGS_IN_FILE; i++) {
                fileWriter.write(content[i]);
                fileWriter.write("\r\n");

            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void textReader() {

        try (
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_TASK3));
        ) {
            String line;
            arrayToWrite = new String[NUMBER_OF_STRINGS_IN_FILE];
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines = line.split(" ");
                firstWord = lines[0];
                lines[0] = lines[lines.length - 1];
                lines[lines.length - 1] = firstWord;
                for (String s : lines) {
                    newLine = newLine + s + " ";
                }
                System.out.println(newLine);
                arrayToWrite[lineNumber] = newLine;
                lineNumber++;
                newLine = "";
            }
            lineWriter(arrayToWrite, FILE_NAME_TASK3);
        } catch (Exception e) {
            System.out.println("Error!! ");
        }
    }

    void lineWriter(String[] wordToWrite, String fileName) {
        try {
            File file = new File(fileName);
            file.delete();
            FileWriter fileWriter = new FileWriter(fileName);
            for (String s : wordToWrite) {
                fileWriter.write(s);
                fileWriter.write("\r\n");
            }
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println("AAZZAA");
        }

    }

}
//        3. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строк.