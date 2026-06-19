package service;

/**
 * Service interface defining train-related operations.
 *
 * <p>This interface abstracts business logic and allows
 * loose coupling between controller and implementation.
 *
 * <p>UC3 focuses on uniqueness validation of bogie IDs.
 *
 * @author Developer
 * @version 3.0
 */
public interface TrainService {

    /**
     * Tracks and validates unique bogie IDs.
     *
     * <p>Uses HashSet to:
     * <ul>
     *     <li>Store bogie IDs</li>
     *     <li>Automatically remove duplicates</li>
     * </ul>
     */
    void trackUniqueBogieIds();
}