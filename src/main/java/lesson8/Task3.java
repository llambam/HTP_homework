package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private String[] strArr;
    private int sum;


    public void task3(String text) {
        sum=0;
        System.out.println("Task 3");
        Pattern pattern = Pattern.compile(RegexSymbols.ALL_NUMBERS);
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
            sum=sum+Integer.valueOf(m.group());
        }
        System.out.println("Summ of all numbers in text: "+sum);
    }


}
