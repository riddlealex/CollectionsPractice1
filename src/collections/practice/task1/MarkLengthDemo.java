package collections.practice.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. Написать метод markLength4, принимающий в качестве
 * параметра список (List) строк и размещающий строку "****"
 * перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****",
 * "Java", "programmer"}
 */

public class MarkLengthDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(list);
        MarkLengthUtil.markLength4(list);
        System.out.println(list);
    }
}
