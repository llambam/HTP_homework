package lesson8;

import java.util.Arrays;
import java.util.Objects;

public class Task6 {

    private String[] strArr;
    private int numberOfDuplicates = 1;

    public void task6(String text) {
        System.out.println("Task 6");
        strArr = text.split(" ");
        for (String s : strArr) {
            numberOfDuplicates = 0;
            for (int i = 0; i < strArr.length - 1; i++) {
                if (s.equalsIgnoreCase(strArr[i])) {
                    numberOfDuplicates++;
                }
            }
            if (numberOfDuplicates > 1) {
                System.out.println("Word " + s + " duplicate " + numberOfDuplicates + " times");
            }

        }
    }


    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;
        Task6 task6 = (Task6) o1;
        return numberOfDuplicates == task6.numberOfDuplicates &&
                Arrays.equals(strArr, task6.strArr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberOfDuplicates);
        result = 31 * result + Arrays.hashCode(strArr);
        return result;
    }
}

