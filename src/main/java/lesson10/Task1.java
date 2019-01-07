package lesson10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task1 {


    public void task1() {
        System.out.println("Task 1");
        Book[] book = new Book[3];
        book[0] = new Book(54, "Book1", "Bob", "Jonson", "Dendy");
        book[1] = new Book(44, "Book2", "Bob", "Jonson", "Dendy");
        book[2] = new Book(84, "Book3", "Bob", "Jonson", "Dendy");


        List<Book> list = new LinkedList<Book>();
        list.addAll(Arrays.asList(book));
        System.out.println("All 3 books:  ");
        for (Book element : list) {
            System.out.println(element);
        }
        list.remove(1);
        System.out.println("After removing second book:  ");
        for (Book element : list) {
            System.out.println(element);
        }
    }
}
//1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
//        List< Book > list = new LinkedList< Book >();
//        Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.
//        2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть не менее 6 одинаковых по значению книг. Вывести на экран информацию о книга (содержащихся в коллекции HashSet), название которых начинается с гласной буквы.
//
//
//
//        3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги).
//
//        4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать). Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
//        5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товаров в данной категории. Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров, удалить все категории в которых нет ни одного товара (предусмотреть такие категории при заполнении коллекции)