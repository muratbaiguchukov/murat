package com.company.task1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Введите 5-и значное число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int num = number;
        int rev = 0, rmd;
        while (number > 0) {

            rmd = number % 10;
            rev = rev * 10 + rmd;
            number = number / 10;
        }
        if (rev == num)
            System.out.println(num + "Это число является палиндромом");
        else
            System.out.println(num + "Это число не является палиндромом");
            }
    //public static boolean isPalindrome(int num) {

      //  return true;
    }





