package app;

import controller.BogieController;

public class TrainApplication {

    public static void main(String[] args) {

        BogieController controller = new BogieController();

        System.out.println("=== UC8: Filter Bogies using Streams ===");

        // Reuse data
        controller.addBogie("Sleeper", 72);
        controller.addBogie("AC Chair", 56);
        controller.addBogie("First Class", 24);
        controller.addBogie("General", 90);

        System.out.println("\nBogies with capacity > 60:");

        controller.getFilteredBogies(60)
                .forEach(System.out::println);
    }
}