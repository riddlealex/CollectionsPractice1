package collections.practice.task1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class MarkLengthUtil {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private MarkLengthUtil() {
    }

    public static void markLength4(List<String> list) {
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String next = listIterator.next();

            if (next.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(next);
            }
        }
    }
}
