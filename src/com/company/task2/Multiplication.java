package com.company.task2;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        System.out.println("Введите дробное число число");

        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        System.out.println("Введите степень возведения");
        int p = scan.nextInt();
        System.out.println(power(n,p));
    }

    static double power(double n, int p) {
        double power = 1;
        double num2 = n;
        for (int i = 0; i < p; i++) {
            power = power * n;
        }
        return power;

    }
}