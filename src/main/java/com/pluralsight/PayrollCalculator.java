package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String userName = scanner.nextLine();

        System.out.print("Enter the amount of hours you worked: ");

        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = payRate * hoursWorked;

        System.out.println("Your gross pay is: $" + grossPay);

    }
}
