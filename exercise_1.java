package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter b number: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("a equals b");
        }

        if (a != b){
            System.out.println("a NOT equals b");
            if (a > b){
                int C = a;
                System.out.println("max: " + C);
            }
            if (a < b){
                int C = b;
                System.out.println("max: " + C);
            }
        }
    }
}
