package lesson8;

public class Task2 {
    private int numberOfSpaces;


    public void task2(String text) {
        numberOfSpaces = 1;
        System.out.println("Task 2");
        for (int i = 0; i < text.lastIndexOf(" "); ) {
            i = text.indexOf(" ", text.indexOf(" ", i));
            i++;
            numberOfSpaces++;
        }
        System.out.println("Number of _ in text: " + numberOfSpaces);
    }
}