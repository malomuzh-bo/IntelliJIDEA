package Classes;

public abstract class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void Print();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
