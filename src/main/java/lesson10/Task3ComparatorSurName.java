package lesson10;

import java.util.Comparator;

public class Task3ComparatorSurName implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorsurName().compareTo(o2.getAuthorsurName());
    }

}
