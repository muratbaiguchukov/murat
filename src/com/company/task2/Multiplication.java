package com.company.task2;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        System.out.println("Введите дробное число число");

        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        System.out.println("Введите степень возведения");
        int p = scan.nextInt();

    }

    public static double power(double n, int p) {

        double power = 1;
        for (int i = 1; i <= p; i++) {
            power = power * n;

            }
        //System.out.println(power);


    }
}