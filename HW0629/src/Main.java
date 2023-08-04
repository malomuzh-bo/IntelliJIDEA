import Classes.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> intArray = new MyArray<>(5);
        intArray.fillFromKeyboard();
        intArray.print();

        MyArray<Double> doubleArray = new MyArray<>(7);
        doubleArray.fillWithRandomD();
        doubleArray.print();

        System.out.println("Max value: " + intArray.findMax());
        System.out.println("Min value: " + doubleArray.findMin());

        System.out.println("Average value: " + doubleArray.findAverage());

        intArray.sortByAscending();
        intArray.print();

        doubleArray.sortByDescending();
        doubleArray.print();

    }
}