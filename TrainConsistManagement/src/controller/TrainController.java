package controller;


import service.TrainService;
import service.TrainServiceImpl;

/**
 * Controller layer responsible for handling application flow.
 *
 * <p>This class acts as a mediator between:
 * <ul>
 *     <li>Application entry point (Main)</li>
 *     <li>Business logic layer (Service)</li>
 * </ul>
 *
 * <p>In UC3, it triggers the unique bogie ID tracking workflow.
 *
 * @author Developer
 * @version 3.0
 */
public class TrainController {

    private final TrainService trainService;

    /**
     * Default constructor initializes service dependency.
     */
    public TrainController() {
        this.trainService = new TrainServiceImpl();
    }

    /**
     * Executes Use Case 3:
     * Track unique bogie IDs using HashSet.
     */
    public void runUC3() {

        System.out.println("=======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=======================================\n");

        trainService.trackUniqueBogieIds();
    }
}