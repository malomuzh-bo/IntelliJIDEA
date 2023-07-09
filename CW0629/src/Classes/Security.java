package Classes;

public class Security extends Worker{
    int rating;
    public Security(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    @Override
    public void Print() {
        System.out.println("Security " + getName() + "\nAge: " + getAge() + "\nRating: " + rating);
    }
}
