import Classes.*;

public class Main {
    public static void main(String[] args) {
        //1
        /*Person person = new Person("name", "date", "0123456789", "city", "country", "address");
        Person person1 = new Person("name2", "date2", "0527418963", "city2", "country2", "address2");
        System.out.println(Person.getAmountOfCreated());*/
        //2
        /*float triangleArea = AreaCalculator.triangleArea(5, 4);
        float rectangleArea = AreaCalculator.rectangleArea(6, 8);
        float squareArea = AreaCalculator.squareArea(3);
        float rhombusArea = AreaCalculator.rhombusArea(4, 6);

        int calculationCount = AreaCalculator.getCalculationCount();
        System.out.println("Number of calculations: " + calculationCount);*/
        //3
        /*int max = Calculator.findMax(10, 20, 5, 15);
        System.out.println("Max: " + max);

        int min = Calculator.findMin(10, 20, 5, 15);
        System.out.println("Min: " + min);

        double mean = Calculator.getAvg(10, 20, 5, 15);
        System.out.println("Avg: " + mean);

        int num = 9;
        int factorial = Calculator.factorial(num);
        System.out.println("Factorial of " + num + ": " + factorial);*/
        //4
        /*Builder builder = new Builder("name", 34, "profession");
        builder.build();

        Sailor sailor = new Sailor("name2", 27, "The Black Pearl");
        sailor.sail();

        Pilot pilot = new Pilot("name3", 41, "Boeing 747");
        pilot.fly();*/
        //5
        /*Passport passport = new Passport("person", "Ukraine", "123456789");
        System.out.println("Name: " + passport.getName());
        System.out.println("Nationality: " + passport.getNationality());
        System.out.println("Passport number: " + passport.getPassNum());
        System.out.println("-------------");
        ForeignPassport fPassport = new ForeignPassport("person2", "Poland", "987654321",
                "F0135541");
        fPassport.addVisa("Visa1");
        fPassport.addVisa("Visa2");
        System.out.println("Name: " + fPassport.getName());
        System.out.println("Nationality: " + fPassport.getNationality());
        System.out.println("Passport number: " + fPassport.getPassNum());
        System.out.println("Foreign passport number: " + fPassport.getForeignPassNum());
        System.out.println("Visas: " + fPassport.getVisas());*/
        //6
        /*President president = new President("Bohdan", 41, "Finance");
        president.Print();
        System.out.println("-----------");
        Security security = new Security("John", 35, 5);
        security.Print();
        System.out.println("-----------");
        Manager manager = new Manager("Javier", 24, "HR");
        manager.Print();
        System.out.println("-----------");
        Engineer engineer = new Engineer("Alexander", 30, "specialty");
        engineer.Print();*/
        //7
        /*Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(5);
        shapes[2] = new RightTriangle(4, 7);
        shapes[3] = new Trapezoid(6, 8, 5);

        for (Shape shape : shapes) {
            float area = shape.calculate();
            System.out.println("Area: " + area);
        }*/
        //8
        int[] arr = new int[]{4, -5, 0, 123, 54, 9, 75, 68};
        MyArray array = new MyArray(arr);

        array.show();
        System.out.println("--------");
        array.show("Printing array numbers");
    }
}
