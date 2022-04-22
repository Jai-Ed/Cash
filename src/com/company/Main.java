package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner coins = new Scanner(System.in);
        int count = 0;

        double i = -1;

        while( i < 0)
        {
            System.out.print("Please enter change owed : ");
            i = coins.nextDouble();
            System.out.println("\n");
        }
        int owed = (int)Math.round(i * 100);
        if(owed >= 25)
        {
            int change;
            change = owed % 25;
            count = count+ ((owed-change) / 25);
            owed = change;
        }
        if(owed >= 10) {
            int j = owed % 10;
            count += ((owed - j) / 10);
            owed = j;
        }
        if(owed >= 5) {
            int k = owed % 5;
            count += ((owed - k) / 5);
            owed = k;
        }
        count += owed;
        System.out.print("Number of coins: ");
        System.out.print(count);
    }}

