package Classes;

public class Engineer extends Worker{
    String specialty;
    public Engineer(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public void Print() {
        System.out.println("Manager " + getName() + "\nAge: " + getAge() + "\nSpecialty: " + specialty);
    }
}