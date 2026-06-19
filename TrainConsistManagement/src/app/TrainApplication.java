package app;

import controller.TrainController;
import util.ConsolePrinter;

/**
 * UC4 - Maintain Ordered Bogie Consist
 */
public class TrainApplication {

    public static void main(String[] args) {

        TrainController controller = new TrainController();

        ConsolePrinter.printHeader("UC4 - Maintain Ordered Bogie Consist");

        // Step 1: Initialize
        controller.initializeTrain();
        ConsolePrinter.print("Initial Train Consist:");
        ConsolePrinter.print(controller.getConsist().toString());

        // Step 2: Insert
        controller.insertBogie(2, "Pantry Car");
        ConsolePrinter.print("\nAfter Inserting 'Pantry Car' at position 2:");
        ConsolePrinter.print(controller.getConsist().toString());

        // Step 3: Remove
        controller.removeFirst();
        controller.removeLast();
        ConsolePrinter.print("\nAfter Removing First and Last Bogie:");
        ConsolePrinter.print(controller.getConsist().toString());

        ConsolePrinter.print("\nUC4 ordered consist operations completed...");
    }
}