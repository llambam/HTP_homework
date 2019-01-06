package lesson8;

public class Task5 {
    public void task5(String text) {
        System.out.println("Task 5");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);
        System.out.println(stringBuilder.delete(text.indexOf("*"), text.lastIndexOf("*") + 1));

    }
}
