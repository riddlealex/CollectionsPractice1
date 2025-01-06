package collections.practice.task2.comparator;

import collections.practice.task2.Student;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
