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

        double grossPay = payRate * hoursWorked;

        if (hoursWorked > 40) {
            float hoursForOvertimePay = hoursWorked - 40;
            double grossOvertimePay = (payRate * 1.5) * hoursForOvertimePay;
            grossPay += grossOvertimePay;
        }

        System.out.printf( userName + ", Your gross pay is: $" + "%.2f", grossPay);

    }
}
