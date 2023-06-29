import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1
        /*String str = "Fall seven times and stand up eight";
        for (String s : str.split(" ")) {
            System.out.println(s);
        }*/
        //2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float num1 = scanner.nextFloat();
        System.out.println("Enter number 2: ");
        float num2 = scanner.nextFloat();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Diff: " + (num1 - num2));
        System.out.println("Multiply: " + (num1 * num2));
        System.out.println("Div: " + (num1 / num2));*/
        //3
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4-digit number");
        String string = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(builder);
        builder.reverse();
        System.out.println(builder.toString());*/
        //4
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = scanner.nextInt();
        switch (hour){
            case 0, 1, 2, 3, 4:{
                System.out.println("Good night!");
                break;
            }
            case 5, 6, 7, 8, 9, 10:{
                System.out.println("Good morning!");
                break;
            }
            case 11, 12, 13, 14, 15, 16, 17:{
                System.out.println("Good day!");
                break;
            }
            case 18, 19, 20, 21, 22, 23:{
                System.out.println("Good evening!");
                break;
            }
        }*/
        //5
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6-digit number: ");
        int number = scanner.nextInt();

        String numStr = String.valueOf(number);

        if (numStr.length() != 6) {
            System.out.println("Error___");
        }
        else {
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            }
            int firstSum = arr[0] + arr[1] + arr[2];
            int lastSum = arr[3] + arr[4] + arr[5];

            if (firstSum == lastSum){
                System.out.println("This number is lucky!)");
            }
            else System.out.println("This number is not lucky!)");
        }*/
        //6
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 100){
            System.out.println("Error___");
        }
        else{
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("Fizz Buzz");
                return;
            }
            if (num % 3 == 0){
                System.out.println("Fizz");
                return;
            }
            if (num % 5 == 0){
                System.out.println("Buzz");
                return;
            }
            else System.out.println(num);
        }*/
        //7
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (short i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Factorial number " + num + " is " + factorial);*/
        //8
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) counter++;
        }
        if (counter == 2) System.out.println("This number is simple");
        else System.out.println("This number is not simple");*/
        //9
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++){
            System.out.println("Enter " + i + " element: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        float avg = (float) sum / size;

        System.out.println("Displaying array:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);*/
        //10
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Enter " + i + " element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter number for searching: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < size; i++){
            if (number == arr[i]) counter++;
        }

        System.out.println("Result: " + counter);*/
        //11
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum: ");
        int min = scanner.nextInt();
        System.out.println("Enter maximum: ");
        int max = scanner.nextInt();
        int sum = 0;
        if (min > max){}
        else {
            for (int i = min; i <= max; i++) {
                sum += i;
            }
        }
        System.out.println("Result: " + sum);*/
        //12
        //поки не ворк, але в майбутньому дороблю
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] factorials = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Enter " + i + " element: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            factorials[i] = 1;
            for (int j = 2; j <= arr[i]; j++) {
                factorials[i] *= j;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(factorials[i]);
        }
    }
}
