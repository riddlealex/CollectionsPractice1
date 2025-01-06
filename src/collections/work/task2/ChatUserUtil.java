package collections.work.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUserUtil {

    private ChatUserUtil() {
    }

    //метод для извлечения пользователей старше age в новый лист
    public static List<User> getCertainAgeList(List<Chat> chats, int age) {
        List<User> users = new ArrayList<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() > age) {
                    users.add(user);
                }
            }
        }
        return users;
    }

    //метод для подсчёта среднего возраста листа юзеров
    public static double calculateAvgAge(List<User> users) {
        if (users.isEmpty()) {
            return 0;
        }
        int totalAge = 0;
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            totalAge+=iterator.next().getAge();
        }
        return (double) totalAge / users.size();
    }
}
