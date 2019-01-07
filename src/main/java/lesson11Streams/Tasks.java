package lesson11Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static final String SYMBOL_COMMA = ",";

    void testTask1() {
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


    void testTask2() {
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println("Выбрать мужчин-военнообязанных (от 18 до 27 лет)");
        List<People> militaryService = peoples.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("militaryService = " + militaryService);

        System.out.println("Найти средний возраст среди мужчин");
        System.out.println(peoples.stream().filter((p) -> p.getSex() == Sex.MAN).mapToInt(People::getAge).average().getAsDouble());

        System.out.println("Найти кол-во потенциально работоспособных людей в выборке " +
                "(т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)");
        System.out.println(peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60)).count());


    }

    void distingtTestTask() {
        Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Collection<String> nonOrdered = new HashSet<>(ordered);

        System.out.println("Получение коллекции без дубликатов из неупорядоченного стрима");
        List<String> distinct = nonOrdered.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct); // напечатает distinct = [a1, a2, a3] - порядок не гарантируется

        System.out.println("Получение коллекции без дубликатов из упорядоченного стрима");
        List<String> distinctOrdered = ordered.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctOrdered = " + distinctOrdered); // напечатает distinct = [a1, a2, a3] - порядок гарантируется

    }

    // Метод anyMatch - возвращает true, если условие выполняется хотя бы для одного элемента
    // Метод noneMatch - возвращает true, если условие не выполняется ни для одного элемента
    // Метод allMatch - возвращает true, если условие выполняется для всех элементов

    void matchTest() {
        System.out.println();
        System.out.println("Test anyMatch, allMatch, noneMatch  start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println("найти существуют ли хоть одно совпадение с шаблоном в коллекции");
        boolean isAnyOneTrue = collection.stream().anyMatch("a1"::equals);
        System.out.println("anyOneTrue " + isAnyOneTrue);
        boolean isAnyOneFalse = collection.stream().anyMatch("a8"::equals);
        System.out.println("anyOneFlase " + isAnyOneFalse);

        System.out.println("найти существуют ли все совпадения с шаблоном в коллекции");
        boolean isAll = collection.stream().allMatch((s) -> s.contains("1"));
        System.out.println("isAll " + isAll); // напечатает false

        System.out.println("сравнение на неравенство");
        boolean isNotEquals = collection.stream().noneMatch("a7"::equals);
        System.out.println("isNotEquals " + isNotEquals);

    }

    void mapTest() {

        System.out.println();
        System.out.println("Test map start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<String> collection1 = Arrays.asList("1,2,0", "4,5");

        System.out.println("Добавить \"_1\" к каждому элементу первой коллекции");
        List<String> transform = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("transform = " + transform);

        System.out.println("В первой коллекции убрать первый символ и вернуть массив чисел (int[])");
        List<Integer> listNumbers = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("number = " + listNumbers);


        int[] number = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println("number = " + Arrays.toString(number));

        System.out.println("Из второй коллекции получить все числа, перечисленные через запятую из всех элементов");
        String[] numbers = collection1.stream().flatMap((p) -> Arrays.asList(p.split(SYMBOL_COMMA)).stream()).toArray(String[]::new);
        System.out.println("number = " + Arrays.toString(numbers));

        System.out.println("Из второй коллекции получить сумму всех чисел, перечисленных через запятую");
        int sum = collection1.stream().flatMapToInt((p) -> Arrays.asList(p.split(SYMBOL_COMMA)).stream().mapToInt(Integer::parseInt)).sum();
        System.out.println("sum = " + sum);

    }

    void sortedTest() {
        System.out.println();
        System.out.println("Test sorted start");

        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");

        System.out.println("отсортировать значения по алфавиту");
        List<String> sorted = collection.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted = " + sorted); // напечатает sorted = [a1, a1, a2, a3, a4, a4]

        System.out.println("отсортировать значения по алфавиту и убрать дубликаты");
        List<String> sortedDistinct = collection.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("sortedDistinct = " + sortedDistinct); // напечатает sortedDistinct = [a1, a2, a3, a4]

        System.out.println("отсортировать значения по алфавиту в обратном порядке");
        List<String> sortedReverse = collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("sortedReverse = " + sortedReverse); // напечатает sortedReverse = [a4, a4, a3, a2, a1, a1]

        System.out.println("отсортировать значения по алфавиту в обратном порядке  и убрать дубликаты");
        List<String> distinctReverse = collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList());
        System.out.println("distinctReverse = " + distinctReverse); // напечатает sortedReverse = [a4, a3, a2, a1]


        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );


        System.out.println("Отсортировать по имени в обратном алфавитном порядке");
        Collection<People> byName = peoples.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println("byName = " + byName); // byName = [{name='Петя', age=23, sex=MAN}, {name='Иван Иванович', age=69, sex=MAN}, {name='Елена', age=42, sex=WOMEN}, {name='Вася', age=16, sex=MAN}]

    }


    void maxMinTest() {
        System.out.println();
        System.out.println("Test min and max start");

        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");


        System.out.println("найти максимальное значение");
        String max = collection.stream().max(String::compareTo).get();
        System.out.println("max " + max); // напечатает a3


        System.out.println("найти минимальное значение");
        String min = collection.stream().min(String::compareTo).get();
        System.out.println("min " + min); // напечатает a1


//        Collection<People> peoples = Arrays.asList(
//                new People("Вася", 16, Sex.MAN),
//                new People("Петя", 23, Sex.MAN),
//                new People("Елена", 42, Sex.WOMEN),
//                new People("Иван Иванович", 69, Sex.MAN)
//        );
//problems with comparator((
//        People older = peoples.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
//        System.out.println("older " + older); // напечатает {name='Иван Иванович', age=69, sex=MAN}
//
//        People younger = peoples.stream().min((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
//        System.out.println("younger " + younger); // напечатает {name='Вася', age=16, sex=MAN}

    }

    // Метод ForEach применяет указанный метод к каждому элементу стрима и заканчивает работу со стримом
    void testForEach() {
        System.out.println();
        System.out.println("For each start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.print("forEach = ");
        collection.stream().map(String::toUpperCase).forEach((e) -> System.out.print(e + ",")); // напечатает forEach = A1,A2,A3,A1,
        System.out.println();

        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        list.stream().forEachOrdered((p) -> p.append("_new"));
        System.out.println("forEachOrdered = " + list); // напечатает forEachOrdered = [a1_new, a2_new, a3_new]
    }

    // Метод Peek возвращает тот же стрим, но при этом применяет указанный метод к каждому элементу стрима
    void testPeek() {
        System.out.println();
        System.out.println("Test peek start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Напечатать отладочную информацию по каждому элементу стрима


        System.out.print("peak1 = ");
        List<String> peek = collection.stream().map(String::toUpperCase).peek((e) -> System.out.print(e + ",")).
                collect(Collectors.toList());
        System.out.println();
        System.out.println("peek2 = " + peek);

        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        List<StringBuilder> newList = list.stream().peek((p) -> p.append("_new")).collect(Collectors.toList());
        System.out.println("newList = " + newList);
    }

    void testReduce() {

        System.out.println();
        System.out.println("Test reduce start");


        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2);

        System.out.println("Получить сумму чисел или вернуть 0");
        Integer sum = collection.stream().reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println("sum = " + sum);


        System.out.println("Вернуть максимум или -1");
        Integer max1 = collection.stream().reduce((s1, s2) -> s1 > s2 ? s1 : s2).orElse(0);
        Integer max2 = collection.stream().reduce(Integer::max).orElse(0); // используя Integer::max
        System.out.println("max = " + max1 + " : " + max2);

        System.out.println("Вернуть сумму нечетных чисел или 0");
        Integer sumOdd = collection.stream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println("sumOdd = " + sumOdd);

        // ************ Работа со сложными объектами

        // Зададим коллекцию людей
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        System.out.println("Найдем самого старшего мужчину");
        int oldMan = peoples.stream().filter((p) -> p.getSex() == Sex.MAN).map(People::getAge).reduce((s1, s2) -> s1 > s2 ? s1 : s2).get();
        System.out.println("oldMan = " + oldMan);

        System.out.println("Найдем самого минимальный возраст человека у которого есть бука е в имени");
        int younger = peoples.stream().filter((p) -> p.getName().contains("е")).mapToInt(People::getAge).reduce((s1, s2) -> s1 < s2 ? s1 : s2).orElse(0);
        System.out.println("younger with e = " + younger); // напечатает 23
    }

    void testCollect() {
        System.out.println();
        System.out.println("Test distinct start");

        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Collection<String> strings = Arrays.asList("a1", "b2", "c3", "a1");

        System.out.println("Получить сумму нечетных чисел");
        long sumOdd = numbers.stream().collect(Collectors.summingInt(((p) -> p % 2 == 1 ? p : 0)));
        System.out.println("sumOdd = " + sumOdd);

        System.out.println("Вычесть от каждого элемента 1 и получить среднее");
        double average = numbers.stream().collect(Collectors.averagingInt((p) -> p - 1));
        System.out.println("average = " + average);

        System.out.println("Прибавить к числам 3 и получить статистику");
        IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt((p) -> p + 3));
        System.out.println("statistics = " + statistics); // напечатает statistics = IntSummaryStatistics{count=4, sum=22, min=4, average=5.500000, max=7}

        System.out.println("Разделить числа на четные и нечетные");
        Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));
        System.out.println("parts = " + parts); // напечатает parts = {false=[1, 3], true=[2, 4]}

        System.out.println("Получение списка без дубликатов");
        List<String> distinct = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct);


        System.out.println("Получить массив строк без дубликатов и в верхнем регистре");
        String[] array = strings.stream().distinct().map(String::toUpperCase).toArray(String[]::new);
        System.out.println("array = " + Arrays.asList(array)); // напечатает array = [A1, B2, C3]

        System.out.println("Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>");
        String join = strings.stream().collect(Collectors.joining(" : ", "<b> ", " </b>"));
        System.out.println("join = " + join);

        System.out.println("Преобразовать в map, где первый символ ключ, второй символ значение");
        Map<String, String> map = strings.stream().distinct().collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
        System.out.println("map = " + map);

        System.out.println("Преобразовать в map, сгруппировав по первому символу строки");
        Map<String, List<String>> groups = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
        System.out.println("groups = " + groups);

        System.out.println("Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через :");
        Map<String, String> groupJoin = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1), Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))));
        System.out.println("groupJoin = " + groupJoin);


    }

    public static void main(String[] args) {

        Tasks tasks = new Tasks();
//        tasks.testTask1();
//        tasks.testTask2();
//        tasks.distingtTestTask();
//        tasks.matchTest();
//        tasks.mapTest();
//        tasks.sortedTest();
//        tasks.maxMinTest();
//        tasks.testForEach();
//        tasks.testPeek();
//        tasks.testReduce();
        tasks.testCollect();

    }

}
//    Попробовать на коллекциях использовать методы стримов, описанные в статье и попробовать сделать задания внутри этой статьи, решения уже есть внутри. Собственно, кто сколько сможет, на сдаче веб проекта будет небольшим плюсом их использование.