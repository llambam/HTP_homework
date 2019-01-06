package lesson10;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task2 {
    private static final int numberOfBooksInCollection = 25;
    private final static String[] vowels = {"e", "E", "y", "Y", "u", "U", "i", "I", "o", "O", "a", "A"};

    public void task2() {
        System.out.println("Task 2");
        objectGenerator();
        Set<Book> hashSet = new HashSet<>();
        for (Book b : objectGenerator()) {
            hashSet.add(b);
        }

        System.out.println("HashSet list:  ");
        for (Book element : hashSet) {
            System.out.println(element);
        }
        System.out.println("HashSet list(starts with vowels):  ");
        for (Book element : hashSet) {
            for (String s : vowels) {
                if (element.getBookName().startsWith(s)) {
                    System.out.println(element);
                }
            }
        }

        System.out.println("Task 3");
        Comparator<Book> bookCompClassSurName = new Task3ComparatorSurName();
        List<Book> sortedBooks = new LinkedList<>();

        for (Book book : hashSet) {
            sortedBooks.add(book);
        }
        System.out.println("Sorted by surname:  ");
        sortedBooks.sort(bookCompClassSurName);
        sortedBooks.forEach(System.out::println);
        Comparator<Book> bookCompClassName = new Task3ComparatorName();
        sortedBooks.sort(bookCompClassName);
        System.out.println("Sorted by name:  ");
        sortedBooks.forEach(System.out::println);
        Comparator<Book> bookCompClassDadName = new Task3ComparatorDadName();
        sortedBooks.sort(bookCompClassDadName);
        System.out.println("Sorted by Dad name:  ");
        sortedBooks.forEach(System.out::println);


    }

    private static Book[] objectGenerator() {
        Book[] book = new Book[numberOfBooksInCollection];

        for (int i = 0; i < numberOfBooksInCollection; i++) {
            if (i >= 0 && i <= 5) {
                book[i] = new Book(55, "Acapital", "karl", "marks", "levi");
//                System.out.println(book[i]);
            } else {
                book[i] = new Book((int) (Math.random() * 100), generateRandomWords(), generateRandomWords(), generateRandomWords(), generateRandomWords());
//                System.out.println(book[i]);
            }
        }
        return book;
    }

    public static String generateRandomWords() {
        String randomStrings = new String();
        Random random = new Random();
        char[] word = new char[random.nextInt(8) + 3];
        for (int j = 0; j < word.length; j++) {
            word[j] = (char) ('a' + random.nextInt(26));
        }
        randomStrings = new String(word);
        return randomStrings;
    }

}
