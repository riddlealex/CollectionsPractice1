package collections.practice.task2.comparator;

import collections.practice.task2.Student;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAvgMark(), o2.getAvgMark());
    }
}
