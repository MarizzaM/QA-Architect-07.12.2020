package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        float temperature = scanner.nextFloat();

        if (temperature >= 37.5 || temperature <= 36){
            System.out.println("go to doctor");
        }
        else {
            System.out.println("no need doctor");
        }
    }
}
