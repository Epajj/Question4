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

public class BabyFeeding {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input for porridge and milk amounts
        System.out.print("Enter the amount of porridge (in liters): ");
        double porridgeLiters = scanner.nextDouble();
        
        System.out.print("Enter the amount of milk (in liters): ");
        double milkLiters = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Constants
        double porridgePerFeeding = 0.5; // in liters (half a cup)
        double milkPerFeeding = 1.0; // in liters (full cup)
        int porridgeFeedingInterval = 45; // in minutes
        int milkFeedingInterval = 30; // in minutes

        // Calculate the total number of feedings required
        int porridgeFeedings = (int) Math.ceil(porridgeLiters / porridgePerFeeding);
        int milkFeedings = (int) Math.ceil(milkLiters / milkPerFeeding);

        // Calculate the total time required
        int totalPorridgeTime = porridgeFeedings * porridgeFeedingInterval;
        int totalMilkTime = milkFeedings * milkFeedingInterval;

        // Determine the time to finish both
        // The time to finish both is determined by the longer time among the two
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime);

        // Output the result
        System.out.println("Total time required to finish both porridge and milk: " + totalTime + " minutes");
    }
}

