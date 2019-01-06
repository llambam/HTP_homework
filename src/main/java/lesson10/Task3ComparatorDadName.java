package lesson10;

import java.util.Comparator;

public class Task3ComparatorDadName implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorDadName().compareTo(o2.getAuthorDadName());
    }

}