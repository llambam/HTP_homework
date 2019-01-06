package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    private String[] strArr;
    private int wordDuration;
    private int firstLvlIteration;
    private int secondLvlIteration;

    public void task8(String text) {
        System.out.println("Task 8");
        wordDuration = 5;
        StringBuilder stringBuilder = new StringBuilder();
        Task8 task8 = new Task8();
        Pattern pattern = Pattern.compile("([A-ZА-Я][^.!?]*)\\?");
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println("Words with " + wordDuration + " letters: ");
            strArr = m.group().split(" ");
            task8.task8NoRepetitionsInArray(strArr, wordDuration);
            for (String f : strArr) {
                if (f.length() == wordDuration) {
                    System.out.println(f);
                    stringBuilder.append(f);
                }
            }
        }
        if (stringBuilder.length() == 0) {
            System.out.println("There are no words in the text in " + wordDuration + " letters");
        }
    }

    private void task8NoRepetitionsInArray(String array[], int wordDuration) {

        firstLvlIteration = 0;
        for (String s : array) {
            firstLvlIteration++;
            secondLvlIteration = 0;
            for (String b : array) {
                secondLvlIteration++;
                if (s.hashCode() == b.hashCode() && firstLvlIteration != secondLvlIteration && s.length() == wordDuration &&
                        array.length - 1 - secondLvlIteration >= 0) {
                    System.arraycopy(array, secondLvlIteration + 1, array, secondLvlIteration, array.length - 1 - secondLvlIteration);
                }
                }
            }
        }
    }

