package collections.work.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Задание 2
 Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.

 Задача:

 - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 20 лет

 - С помощью итератора посчитать средний возраст всех оставшихся пользователей.**/

public class ChatManager {

    public static void main(String[] args) {

        List<Chat> chats = new ArrayList<>();

        chats.add(new Chat("Java", Arrays.asList(
                new User(1, "John", 25),
                new User(2, "Alice", 17),
                new User(3, "Bob", 30)
        )));

        chats.add(new Chat("Python", Arrays.asList(
                new User(4, "Eve", 22),
                new User(5, "Mike", 16),
                new User(6, "Sara", 28)
        )));

        chats.add(new Chat("JavaScript", Arrays.asList(
                new User(7, "Tom", 19),
                new User(8, "Anna", 21),
                new User(9, "Peter", 15)
        )));

        System.out.println("Начальный: " + chats);

        List<User> newList = ChatUserUtil.getCertainAgeList(chats, 20);
        System.out.println(newList);

        double avgAge = ChatUserUtil.calculateAvgAge(newList);
        System.out.println("Средний возраст оставшихся пользователей: " + avgAge);


    }
}
