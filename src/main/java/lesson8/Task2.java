package lesson8;

public class Task2 {
    private int numberOfSpaces;

    public void task2(String text) {
        numberOfSpaces = 1;
        System.out.println("Task 2");
        for (int i = 0; i < text.lastIndexOf(RegexSymbols.SYMBOL_SPACE); ) {
            i = text.indexOf(RegexSymbols.SYMBOL_SPACE, text.indexOf(RegexSymbols.SYMBOL_SPACE, i));
            i++;
            numberOfSpaces++;
        }
        System.out.println("Number of _ in text: " + numberOfSpaces);
    }
}
