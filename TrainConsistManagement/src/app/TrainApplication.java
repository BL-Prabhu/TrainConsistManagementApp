package app;

import controller.BogieController;

public class TrainApplication {

    public static void main(String[] args) {

        BogieController controller = new BogieController();

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Add Bogies
        controller.addBogie("Sleeper", 72);
        controller.addBogie("AC Chair", 56);
        controller.addBogie("First Class", 24);
        controller.addBogie("General", 90);

        // Ascending
        System.out.println("\nAscending Order:");
        controller.getSortedAscending().forEach(System.out::println);

        // Descending
        System.out.println("\nDescending Order:");
        controller.getSortedDescending().forEach(System.out::println);
    }
}