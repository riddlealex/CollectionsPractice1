package collections.practice.task2;

public class Student {

    private String name;
    private String surname;
    private int age;
    private double avgMark;

    public Student(String name, String surname, int age, double avgMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avgMark = avgMark;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAvgMark() {
        return avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", avgMark=" + avgMark +
                '}';
    }
}
