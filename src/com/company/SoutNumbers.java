package com.company;

import java.util.Scanner;

public class SoutNumbers {
    private static int count = 0;

    public static void print() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count++;
        if (n == 0) {
            return;
        }
        if (count % 2 == 1) {
            System.out.println(n);
        }
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
