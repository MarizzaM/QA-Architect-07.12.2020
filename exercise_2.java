package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter b number: ");
        int b = scanner.nextInt();
        System.out.print("Enter c number: ");
        int c = scanner.nextInt();

        if (c > a && c > b){
            System.out.println("c is biggest");
        }

        System.out.print("Enter d number: ");
        int d = scanner.nextInt();
        System.out.print("Enter e number: ");
        int e = scanner.nextInt();
        System.out.print("Enter f number: ");
        int f = scanner.nextInt();

        if (!(d >= e || d >= f)){
            System.out.println("d is smallest");
        }
    }
}
