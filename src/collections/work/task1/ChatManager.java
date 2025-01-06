package collections.work.task1;

import collections.work.task1.comparator.UsersNumberComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**Задание 1
 Дан список чатов.
 Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

 Задача:

 - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.

 - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.

 - Также предоставить сортировку чатов по названию по умолчанию.**/

public class ChatManager {

    public static void main(String[] args) {

        List<Chat> chatList = new ArrayList<>();
        chatList.add(new Chat("Amazon", 3000));
        chatList.add(new Chat("Google", 150));
        chatList.add(new Chat("Facebook", 1100));
        chatList.add(new Chat("Microsoft", 900));
        chatList.add(new Chat("Uber", 2000));
        chatList.add(new Chat("Samsung", 3500));
        Collections.sort(chatList);
        System.out.println(chatList);



        ChatUtil.removeSmallChats(chatList);
        Collections.sort(chatList, new UsersNumberComparator());
        System.out.println(chatList);
    }
}
