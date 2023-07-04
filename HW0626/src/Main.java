import java.lang.reflect.Array;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1
        /*String quote = "Your time is limited, so don’t waste it living someone else’s life";
        int counter = 0;
        String[] arr = quote.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (counter < 4){
                System.out.print(arr[i] + " ");
                counter++;
            }
            else {
                System.out.println("");
                counter = 0;
            }
        }*/
        //2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        System.out.println("Enter percent: ");
        int percent = scanner.nextInt();
        int result = num * percent / 100;
        System.out.println("Result: " + result);*/
        //3
        /*Scanner scanner = new Scanner(System.in);
        String num1, num2, num3;
        System.out.println("Enter num: ");
        num1 = scanner.nextLine();
        System.out.println("Enter second num: ");
        num2 = scanner.nextLine();
        System.out.println("Enter another num: ");
        num3 = scanner.nextLine();

        System.out.println("Result: " + num1 + num2 + num3);*/
        //4
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6-digit number: ");
        int num = scanner.nextInt();

        int[] digits = new int[6];
        for (int i = 5; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        int temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;

        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;

        int newNum = 0;
        for (int i = 0; i < 6; i++) {
            newNum = newNum * 10 + digits[i];
        }

        System.out.println("Edited number: " + newNum);*/
        //5
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of the month: ");
        int month = scanner.nextInt();
        switch (month){
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
        }*/
        //6
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of meters: ");
        int meters = scanner.nextInt();
        System.out.println("Convert to miles, inches or yards (1, 2, 3)? ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(meters + " meters = " + (float) meters / 1609 + " miles");
                break;
            case 2:
                System.out.println(meters + " meters = " + (float) meters * 39.3701f + " inches");
                break;
            case 3:
                System.out.println(meters + " meters = " + (float) meters * 1.094f + " yards");
                break;
        }*/
        //7
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();
        System.out.println("Enter another num: ");
        int num2 = scanner.nextInt();
        if (num > num2) {
            int temp = num;
            num = num2;
            num2 = temp;
        }
        for (int i = num; i <= num2; i++) {
            if (i % 2 != 0) System.out.println(i);
        }*/
        //8
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int start = scanner.nextInt();
        System.out.print("Enter second num: ");
        int end = scanner.nextInt();
        scanner.close();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Multiplication Table:");
        System.out.println("---------------------");

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }*/
        //9 + 12
        /*int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 30);
            System.out.println(arr[i]);
        }
        int min = arr[0], max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])max = arr[i];
            if (min > arr[i])min = arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        Arrays.sort(arr);*/
        //10
        /*int size = 9;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-30, 30);
        }

        int[] arr2 = separateEvenNumbers(arr);
        int[] arr3 = separateOddNumbers(arr);
        int[] arr4 = separateNegativeNumbers(arr);
        int[] arr5 = separatePositiveNumbers(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even Numbers: " + Arrays.toString(arr2));
        System.out.println("Odd Numbers: " + Arrays.toString(arr3));
        System.out.println("Negative Numbers: " + Arrays.toString(arr4));
        System.out.println("Positive Numbers: " + Arrays.toString(arr5));*/
        //11
        displayLine(7, Direction.Vertical, '$');
        displayLine(11, Direction.Horizontal, '#');
    }
    public static int[] separateEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                arr[index] = number;
                index++;
            }
        }
        return arr;
    }
    public static int[] separateOddNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                arr[index] = number;
                index++;
            }
        }
        return arr;
    }
    public static int[] separateNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int number : array) {
            if (number < 0) {
                arr[index] = number;
                index++;
            }
        }
        return arr;
    }
    public static int[] separatePositiveNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number >= 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int number : array) {
            if (number >= 0) {
                arr[index] = number;
                index++;
            }
        }
        return arr;
    }

    public static void displayLine(int length, Direction direction, char character){
        switch (direction){
            case Vertical:
                for (int i = 0; i < length; i++) {
                    System.out.println(character);
                }
                break;
            case Horizontal:
                for (int i = 0; i < length; i++) {
                    System.out.print(character);
                }
                break;
        }
    }
    enum Direction{
        Vertical, Horizontal;
    }
}