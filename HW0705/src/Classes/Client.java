package Classes;

public class Client {
    private String name;
    private int priority;

    public Client(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
