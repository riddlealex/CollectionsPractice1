package collections.practice.task2;

import collections.practice.task2.comparator.AgeComparator;
import collections.practice.task2.comparator.FullNameComparator;
import collections.practice.task2.comparator.MarkComparator;

import java.util.Arrays;
import java.util.List;
/**
 * 2. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 *  Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */

public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", "Alexov", 19, 9.4),
                new Student("Petr", "Petrov", 18, 8.7),
                new Student("Ivan", "Ivanov", 20, 7.9),
                new Student("Sveta", "Svetikova", 19, 8.3),
                new Student("Bob", "Bobov", 21, 8.9),
                new Student("Ryan", "Gosling", 22, 9.5)
        );

        Student bestStudent = BestStudentFinder.getBestStudent(students);
        System.out.println(bestStudent);

        students.sort(new AgeComparator());
        System.out.println(students);

        students.sort(new FullNameComparator());
        System.out.println(students);

        students.sort(new MarkComparator());
        System.out.println(students);
    }
}
