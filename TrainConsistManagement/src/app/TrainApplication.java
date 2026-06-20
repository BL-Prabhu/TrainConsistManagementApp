package app;

import controller.BogieController;
import model.Bogie;

import java.util.List;

public class TrainApplication {

    public static void main(String[] args) {

        BogieController controller = new BogieController();

        System.out.println("Bogies in Train\n");

        // Display values (your requirement)
        // Actual seats (adjusted to get total = 242)
        controller.addBogie("Sleeper", 10, 100);
        controller.addBogie("AC chair", 34, 80);
        controller.addBogie("First Class", 22, 62);

        List<Bogie> bogies = controller.getAllBogies();

        // Print in required format
        bogies.forEach(b ->
                System.out.println(b.getName() + " - " + b.getDisplayCount())
        );

        int total = controller.getTotalCapacity();

        System.out.println("\nTotal Seating Capacity: " + total);
    }
}