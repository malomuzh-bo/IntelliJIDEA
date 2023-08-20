package Classes;

import java.io.*;

public class FactorialsDigits extends Thread{
    String inputFilePath;

    public FactorialsDigits(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                long factorial = calculateFactorial(number);
                System.out.println("Factorial " + number + ": " + factorial);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
