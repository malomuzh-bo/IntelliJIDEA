import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        /*String path1, path2;
        System.out.println("Enter path 1: ");
        path1 = scanner.nextLine();
        System.out.println("Enter path 2: ");
        path2 = scanner.nextLine();
        System.out.println(path1.equals(path2) ? "Equal" : "Not equal");*/
        //2
        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter path: ");
            String filePath = reader.readLine();

            try (BufferedReader freader = new BufferedReader(new FileReader(filePath))) {
                String bigStr = "";
                int max = 0;

                String line;
                int lineNum = 0;
                while ((line = freader.readLine()) != null) {
                    lineNum++;
                    if (line.length() > max) {
                        max = line.length();
                        bigStr = line;
                    }
                }

                System.out.println("Length of biggest str: " + max + " elements");
                System.out.println("Biggest str (line " + lineNum + "): " + bigStr);
            } catch (Exception e) {
                System.err.println("Error_@#$%");
            }
        } catch (IOException e) {
            System.err.println("Error_@#$%");
        }*/
        //3
        ///Users/malomuzh_bo/Downloads/JAVA_HW_Module_05_ua.pdf
        /*try (BufferedReader freader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter path: ");
            String filePath = freader.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String str;
            int arrayNum = 1;
            int totalSum = 0;

            while ((str = reader.readLine()) != null) {
                String[] elements = str.split(" ");
                int[] arr = new int[elements.length];

                for (int i = 0; i < elements.length; i++) {
                    arr[i] = Integer.parseInt(elements[i]);
                    totalSum += arr[i];
                }

                System.out.println("Array " + arrayNum + ": " + Arrays.toString(arr));
                System.out.println("Min: " + findMin(arr));
                System.out.println("Max: " + findMax(arr));
                System.out.println("Sum: " + findSum(arr));
                System.out.println();

                arrayNum++;
            }

            System.out.println("Total sum: " + totalSum);
        }
            catch (Exception e){
                System.err.println("Error_@#$%");
            }
        }
        catch (Exception e) {
            System.err.println("Error_@#$%");
        }*/
        //4
        /*System.out.print("Enter path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter elements of array through 'space': ");
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writeIntArrToFile(writer, arr);
            writeIntArrToFile(writer, filterEven(arr));
            writeIntArrToFile(writer, filterOdd(arr));
            writeIntArrToFile(writer, reverseArray(arr));

            System.out.println("Success!");
        } catch (IOException e) {
            System.err.println("Error_@#$");
        }*/
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
    public static void writeIntArrToFile(BufferedWriter writer, int[] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            writer.write(String.valueOf(arr[i]));
            if (i < arr.length - 1) {
                writer.write(" ");
            }
        }
        writer.newLine();
    }
    public static int[] filterEven(int[] arr) {
        return Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
    }
    public static int[] filterOdd(int[] arr) {
        return Arrays.stream(arr).filter(i -> i % 2 != 0).toArray();
    }
    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }
}