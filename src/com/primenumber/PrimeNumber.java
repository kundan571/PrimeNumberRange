package com.primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting range:");
        int a = scanner.nextInt();
        System.out.println("Enter last range:");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i == 0 || i == 1) {
                System.out.println("Number is non prime");
                continue;
            }
            int temp = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }

            if (temp == 0)
                System.out.println(i);
        }
    }
}

