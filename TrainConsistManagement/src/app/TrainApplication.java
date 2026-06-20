package app;


import controller.TrainController;

/**
 * UC6 - Map Bogie to Capacity using HashMap
 */
public class TrainApplication {

    public static void main(String[] args) {

        TrainController controller = new TrainController();

        System.out.println("======================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        // Step 1: Add bogie capacities
        controller.addBogieCapacity("Sleeper", 72);
        controller.addBogieCapacity("AC Chair", 60);
        controller.addBogieCapacity("First Class", 24);

        // Step 2: Display mapping
        System.out.println("Bogie Capacity Mapping:");
        controller.displayFormation();

        System.out.println("\nUC6 mapping completed...");
    }
}