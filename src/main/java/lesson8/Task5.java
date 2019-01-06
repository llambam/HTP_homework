package lesson8;

public class Task5 {
    public void task5(String text) {
        System.out.println("Task 5");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);
        System.out.println(stringBuilder.delete(text.indexOf(RegexSymbols.SYMBOL_STAR), text.lastIndexOf(RegexSymbols.SYMBOL_STAR) + 1));

    }
}
