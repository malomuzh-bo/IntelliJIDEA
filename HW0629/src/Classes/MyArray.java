package Classes;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray<T extends Comparable<T>> {
    private T[] array;

    public MyArray(int size) {
        array = (T[]) new Comparable[size];
    }

    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = (T) scanner.next();
        }
    }



    public void fillWithRandomI() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) (Integer) (int) (Math.random() * 100);
        }
    }

    public void fillWithRandomD() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) (Double) (double) (Math.random() * 100);
        }
    }

    public void fillWithRandomF() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) (Float) (float) (Math.random() * 100);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public double findAverage() {
        double sum = 0;
        for (T element : array) {
            sum += Double.parseDouble(element.toString());
        }
        return sum / array.length;
    }

    public void sortByAscending() {
        Arrays.sort(array);
    }

    public void sortByDescending() {
        Arrays.sort(array, (a, b) -> b.compareTo(a));
    }

    public int binarySearch(T key) {
        return Arrays.binarySearch(array, key);
    }

    public void replaceValue(int index, T newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Index out of range!");
        }
    }

}
