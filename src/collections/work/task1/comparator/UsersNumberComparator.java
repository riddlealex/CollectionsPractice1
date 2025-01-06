package collections.work.task1.comparator;

import collections.work.task1.Chat;

import java.util.Comparator;

public class UsersNumberComparator implements Comparator<Chat> {
    //сравнение по номеру
    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getUsersNumber() - o2.getUsersNumber();
    }
}
