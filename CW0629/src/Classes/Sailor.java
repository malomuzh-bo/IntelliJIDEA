package Classes;

public class Sailor extends Human {
    private String ship;

    public Sailor(String name, int age, String ship) {
        super(name, age);
        this.ship = ship;
    }

    public String getShip() {
        return ship;
    }

    public void sail() {
        System.out.println(getName() + " is a sailor on the ship " + getShip());
    }
}
