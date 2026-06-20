package app;

import controller.BogieController;

import java.util.List;
import java.util.Map;

public class TrainApplication {

    public static void main(String[] args) {

        BogieController controller = new BogieController();

        System.out.println("=== UC9: Group Bogies by Type ===");

        // Add Bogies
        controller.addBogie("Sleeper", 72, "Passenger");
        controller.addBogie("AC Chair", 56, "Passenger");
        controller.addBogie("First Class", 24, "Passenger");
        controller.addBogie("Goods Carrier", 0, "Goods");
        controller.addBogie("Parcel Van", 0, "Goods");

        // Grouping
        Map<String, List<model.Bogie>> grouped = controller.getGroupedBogies();

        // Print grouped result
        grouped.forEach((type, bogies) -> {
            System.out.println("\nType: " + type);
            bogies.forEach(System.out::println);
        });
    }
}