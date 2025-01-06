package collections.work.task1;

import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private static final int TARGET_NUMBER = 1000;

    private ChatUtil() {
    }

    //удаляет все чаты у которых количество пользователей < target number
    public static void removeSmallChats(List<Chat> chatList) {
//      chatList.removeIf(chat -> chat.getUsersNumber() < TARGET_NUMBER);
        Iterator<Chat> iterator = chatList.iterator();
        while (iterator.hasNext()) {
            Chat chat = iterator.next();
            if (chat.getUsersNumber() < TARGET_NUMBER) {
                iterator.remove();
            }
        }
    }
}
