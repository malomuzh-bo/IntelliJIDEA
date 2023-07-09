package Classes;

public class Pilot extends Human {
    private String planeName;

    public Pilot(String name, int age, String planeName) {
        super(name, age);
        this.planeName = planeName;
    }

    public String getPlane() {
        return planeName;
    }

    public void fly() {
        System.out.println(getName() + " is a pilot flying on " + getPlane());
    }
}
