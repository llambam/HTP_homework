package lesson8;

public class Task4 {
    private char[] wordArray;
    private String[] strArr;
    private int literNumber = 5;
    private String symbolForChange = "V";

    public void task4(String text) {
        System.out.println("Task 4");
        char[] symbolForChangeChar = symbolForChange.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        strArr = text.split(" ");
        for (String s : strArr) {
            wordArray = s.toCharArray();
            if (literNumber <= wordArray.length) {
                wordArray[literNumber - 1] = symbolForChangeChar[0];
            }
            stringBuilder
                    .append(wordArray)
                    .append(" ");

        }
        System.out.println(stringBuilder);

    }
}
