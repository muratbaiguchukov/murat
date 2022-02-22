package com.company.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[9];
        int a = 0;
        int b = 0;
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
        }
        for( int i = 0; i < house.length; i++) {
            if (house[i] == 0)
                a++;
            else if (house[i] % 2 == 0)
                a++;
            else
                b++;
        }
        if(a > b)
            System.out.println("На нечетной стороне больше жителей");

        else

            System.out.println("На четной стороне больше жителей");
        }

    }









