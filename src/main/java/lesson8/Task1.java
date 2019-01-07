package lesson8;

public class Task1 {

    private char[] charArray;
    private String[] strArr;


    public void task1(String text) {

        System.out.println("Task 1");
        StringBuilder stringBuilder = new StringBuilder();
        strArr = text.split(RegexSymbols.SYMBOL_SPACE);
        for (String s : strArr) {
            charArray = s.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            stringBuilder
                    .append(charArray)
                    .append(" ");
        }
        System.out.println(stringBuilder);
    }

}
