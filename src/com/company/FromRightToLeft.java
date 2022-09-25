package com.company;

import java.util.Scanner;

public class FromRightToLeft {
    public static void rightToLeft(int n) {
        System.out.println(n % 10);
        if (n >= 10) {
            rightToLeft(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rightToLeft(n);
    }
}
