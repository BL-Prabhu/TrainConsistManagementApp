package app;

import controller.TrainController;

/**
 * UC5 - Preserve Insertion Order of Bogies using LinkedHashSet
 */
public class TrainApplication {

    public static void main(String[] args) {

        TrainController controller = new TrainController();

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // Step 1: Add bogies
        controller.addBogie("Engine");
        controller.addBogie("Sleeper");
        controller.addBogie("Cargo");
        controller.addBogie("Guard");

        // Step 2: Add duplicate
        controller.addBogie("Sleeper"); // duplicate

        // Step 3: Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(controller.getFormation());

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}