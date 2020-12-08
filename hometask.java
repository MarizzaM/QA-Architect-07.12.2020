package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// 1
        System.out.print("Enter number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = scanner.nextInt();

        if (n1 == 0 && n2 == 0){
            System.out.println("both zeroes");
        } else {
            System.out.println("not both zeroes");
        }
// 2 && 4
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter b number: ");
        int b = scanner.nextInt();
        System.out.print("Enter c number: ");
        int c = scanner.nextInt();

        if (a != b && a != c && b != c){
            System.out.println("diff");
            if (a > b && b > c){
                System.out.println("number 'a' is the biggest");
            } else if (b > c){
                System.out.println("number 'b' is the biggest");
            } else {
                System.out.println("number 'c' is the biggest");
            }
        } else {
            System.out.println("similar");
        }
// 3
        System.out.print("Enter x number: ");
        float x = scanner.nextFloat();
        System.out.print("Enter y number: ");
        float y = scanner.nextFloat();
        System.out.print("Enter z number: ");
        float z = scanner.nextFloat();

        if ( x > 0 && y > 0 && z > 0){
            System.out.println("3 positive numbers");
        } else if ((x > 0 && y > 0) || (x > 0 && z > 0) || (y > 0 && z > 0)) {
            System.out.println("2 positive numbers");
        } else if (x > 0 || y > 0 || z > 0){
            System.out.println("1 positive numbers");
        } else {
            System.out.println("0 positive numbers");
        }
    }
}
