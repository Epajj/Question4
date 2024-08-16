/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestionFour;

/**
 *
 * @author ebepa
 */
import java.util.Scanner;

public class TelecomBilling {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input for amount loaded and call time
        System.out.print("Enter the amount loaded (in UGX): ");
        double amountLoaded = scanner.nextDouble();
        
        System.out.print("Enter the call duration (in minutes): ");
        int callDurationMinutes = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Constants
        double airtimeChargePercentage = 0.10; // 10%
        double callRatePerSecond = 200.0; // UGX per second

        // Calculate the airtime charge
        double airtimeCharge = amountLoaded * airtimeChargePercentage;

        // Calculate the total call time in seconds
        int callDurationSeconds = callDurationMinutes * 60;

        // Calculate the call cost
        double callCost = callDurationSeconds * callRatePerSecond;

        // Calculate the final balance
        double initialBalance = amountLoaded - airtimeCharge;
        double finalBalance = initialBalance - callCost;

        // Output the result
        System.out.printf("Initial balance after airtime charge: UGX %.2f\n", initialBalance);
        System.out.printf("Total call cost: UGX %.2f\n", callCost);
        System.out.printf("Final balance: UGX %.2f\n", finalBalance);
    }
}
