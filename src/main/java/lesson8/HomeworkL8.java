package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeworkL8 {
    private static String text = "Малыш Малыш* тяжело дышал, был бледен и крайне 45 слаб - его состояние вызывало у нас серьезные опасения. Мы решили не рисковать и вызывали separator на себя детскую реанимацию.* Первую помощь 33 , конечно, мы окажем, а вот separator довезем ли кроху до больницы - неизвестно, машина наша не оборудована должным образом.\n" +

            "Судя по всему, у двухлетнего мальчика - тяжелейшая пневмония в крайне запущенной форме. Спрашиваем у матери - когда последний раз былрп былрп педиатр? Услышав ответ, уронили челюсть на пол.";

    public static void main(String[] args) {
        HomeworkL8 homeworkL8 = new HomeworkL8();
        System.out.println(homeworkL8.text);
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        Task8 task8 = new Task8();

        task1.task1(text);//ok
        task2.task2(text);//ok
        task3.task3(text);//ok,  with pattern/matcher
        task4.task4(text);//ok
        task5.task5(text);//so-so, but still ok
        task6.task6(text);//repeats the output of words as many times as this word occurs in text
        task7.task7(text);//ok
        task8.task8(text);//ok, with pattern/matcher
    }
}
