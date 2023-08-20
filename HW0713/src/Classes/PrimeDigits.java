package Classes;

import java.io.*;
import java.util.*;

public class PrimeDigits extends Thread{
    private String inputFilePath;
    private BufferedWriter primesWriter;

    public PrimeDigits(String inputFilePath, BufferedWriter primesWriter) {
        this.inputFilePath = inputFilePath;
        this.primesWriter = primesWriter;
    }

    @Override
    public void run() {
        List<Integer> primes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (isPrime(number)) {
                    primes.add(number);
                }
            }

            primesWriter.write("Prime digits:");
            primesWriter.newLine();
            for (int prime : primes) {
                primesWriter.write(String.valueOf(prime));
                primesWriter.newLine();
            }

            primesWriter.flush();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
