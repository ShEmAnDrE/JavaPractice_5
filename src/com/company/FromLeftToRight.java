package com.company;

import java.util.Scanner;

public class FromLeftToRight {
    public static void leftToRight(int n) {
        if (n != 0) {
        leftToRight(n/10);
        System.out.println(n%10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        leftToRight(n);
    }
}
