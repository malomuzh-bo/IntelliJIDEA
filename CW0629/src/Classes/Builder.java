package Classes;

public class Builder extends Human {
    String profession;

    public Builder(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void build() {
        System.out.println(getName() + " is a " + getProfession() + " and is building something");
    }
}
