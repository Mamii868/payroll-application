package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter the amount of hours you worked: ");
        double hoursWorked = scanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        double payRate = scanner.nextFloat();

        double grossPay = calculatePay(payRate, hoursWorked);

        System.out.printf(userName + ", Your gross pay is: $" + "%.2f", grossPay);

    }

    public static double calculatePay(double payRate, double hoursWorked) {
        double grossPay = payRate * hoursWorked;

        if (hoursWorked > 40) {
            grossPay = payRate * 40;
            double hoursForOvertimePay = hoursWorked - 40;
            double grossOvertimePay = (payRate * 1.5) * hoursForOvertimePay;
            grossPay += grossOvertimePay;
        }
        return grossPay;
    }
}