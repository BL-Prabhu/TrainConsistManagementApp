package service;



import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of TrainService interface.
 *
 * <p>This class contains business logic for managing
 * train operations.
 *
 * <p>UC3 Implementation:
 * <ul>
 *     <li>Stores bogie IDs in HashSet</li>
 *     <li>Ensures uniqueness automatically</li>
 *     <li>Demonstrates duplicate handling</li>
 * </ul>
 *
 * <p>Key Concept:
 * HashSet does not allow duplicate elements.
 *
 * @author Developer
 * @version 3.0
 */
public class TrainServiceImpl implements TrainService {

    /**
     * Performs uniqueness validation of bogie IDs.
     *
     * <p>Steps:
     * <ol>
     *     <li>Create HashSet</li>
     *     <li>Add bogie IDs (including duplicates)</li>
     *     <li>Display unique values</li>
     * </ol>
     */
    @Override
    public void trackUniqueBogieIds() {

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (duplicates included intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}