package Classes;

public class President extends Worker{
    String department;
    public President(String name, int age, String depart) {
        super(name, age);
        department = depart;
    }

    @Override
    public void Print() {
        System.out.println("President " + getName() + "\nAge: " + getAge() + "\nDepartment: " + department);
    }
}
