package Classes;

public class Manager extends Worker{
    String department;
    public Manager(String name, int age, String depart) {
        super(name, age);
        this.department = depart;
    }

    @Override
    public void Print() {
        System.out.println("Manager " + getName() + "\nAge: " + getAge() + "\nDepartment: " + department);
    }
}
