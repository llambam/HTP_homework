package lesson13;

public class Lesson13{
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        System.out.println("Task 1");
        task1.task1();

        Task2 task2 = new Task2();
        System.out.println("Task 2");
        task2.creationFileWithRandomInt();
        task2.sortingNumbersInFile();

        Task3 task3 = new Task3();
        System.out.println("Task 3");
        task3.writeStringInFile();
        task3.textReader();
    }


}
//    Домашка на вторник будет такая:
//        1. Прочитать текст Java-программы (т.е. читать java файл как текстовый документ) и все слова public в объявлении атрибутов и методов класса заменить на слово private.
//
//        2. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию
//
//        3. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строк.
//
//        Теория: главы по потокам ввода-вывода.
//
//        Задание со звездочкой (кто все сделает): разместить в файле любой текст, разбить его на абзацы, предложения, слова, вывести статистику по тексту. Ко всему этому использовать паттерн Chain of Responsibilities.