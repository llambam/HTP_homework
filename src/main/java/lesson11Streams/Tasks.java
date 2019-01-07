package lesson11Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {


    void TestTask1() {
        List<String> test1 = Arrays.asList("a1", "a2", "a3", "a1");
        System.out.println("Вернуть количество вхождений объекта «a1»");
        System.out.println(test1.stream().filter("a1"::equals).count());

        System.out.println("Вернуть первый элемент коллекции или 0, если коллекция пуста");
        System.out.println(test1.stream().findFirst().orElse("0"));

        System.out.println("Вернуть последний элемент коллекции или «empty», если коллекция пуста");
        System.out.println(test1.stream().skip(test1.size() - 1).findAny().orElse("empty"));

        System.out.println("Найти элемент в коллекции равный «a3» или кинуть ошибку");
        System.out.println(test1.stream().filter("a3"::equals).findFirst().get());

        System.out.println("Вернуть третий элемент коллекции по порядку");
        System.out.println(test1.stream().skip(2).findFirst().get());

        System.out.println("Вернуть два элемента начиная со второго");
        System.out.println(Arrays.toString(test1.stream().skip(1).limit(2).toArray()));

        System.out.println("Выбрать все элементы по шаблону");
        System.out.println(test1.stream().filter((s) -> s.contains("1")).collect(Collectors.toList()));

    }


    void TestTask2() {


        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Петя1", 24, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));


        System.out.println("Выбрать мужчин-военнообязанных (от 18 до 27 лет)");
        List<People> militaryService = peoples.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("militaryService = " + militaryService); // напечатает militaryService = [{name='Петя', age=23, sex=MAN}]




    }


    public static void main(String[] args) {

        Tasks tasks = new Tasks();
//        tasks.TestTask1();
        tasks.TestTask2();
    }

}
//    Попробовать на коллекциях использовать методы стримов, описанные в статье и попробовать сделать задания внутри этой статьи, решения уже есть внутри. Собственно, кто сколько сможет, на сдаче веб проекта будет небольшим плюсом их использование.