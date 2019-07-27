package com.murrmeow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Factorial calculator
 * v1.0 by Ilia Minkov, 2019
 */
public class Main {

    /**
     * @param args - not used
     * @throws IOException - if user input not correct
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Input n:\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();

        try {
            int n = Integer.parseInt(userInput);
            long result = GetFactorial(n);
            System.out.println(String.format("n! = %d", result));
        }
        catch (NumberFormatException b) { System.out.println("Error! Not a number!"); }
        catch (IllegalArgumentException a) { System.out.println("Error! n < 0  or n > 15"); }
    }

    /**
     * @param n - the number for which we calculate factorial (accepted values 0..15)
     * @return factorial value of n
     */
    private static long GetFactorial(int n)
    {
        if (n < 0 || n > 15) throw new IllegalArgumentException();

        int i = 1;
        long result = i;

        while (i <= n) result *= i++;

        return result;
    }
}
