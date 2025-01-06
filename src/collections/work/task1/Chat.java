package collections.work.task1;

public class Chat implements Comparable<Chat> {

    private String name;
    private int usersNumber;

    public Chat(String name, int usersNumber) {
        this.name = name;
        this.usersNumber = usersNumber;
    }

    public String getName() {
        return name;
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersNumber=" + usersNumber +
                '}';
    }

    //стандартное сравнение идёт по имени
    @Override
    public int compareTo(Chat o) {
        return getName().compareTo(o.getName());
    }
}
