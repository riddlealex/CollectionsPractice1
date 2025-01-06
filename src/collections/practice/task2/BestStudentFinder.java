package collections.practice.task2;

import java.util.List;

public final class BestStudentFinder {

    private BestStudentFinder() {
    }

    public static Student getBestStudent(List<Student> students) {
        Student bestStudent = null;
        for (Student student : students) {
            if (bestStudent == null || bestStudent.getAvgMark() < student.getAvgMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

}
