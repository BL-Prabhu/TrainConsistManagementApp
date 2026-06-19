package app;


import controller.TrainController;
import util.ConsolePrinter;

/**
 * Entry point of the Train Consist Management Application.
 *
 * <p>This class is responsible for:
 * <ul>
 *     <li>Bootstrapping the application</li>
 *     <li>Invoking the controller layer</li>
 *     <li>Displaying application banner and ready state</li>
 * </ul>
 *
 * <p>Follows standard Java application structure using the main() method.
 *
 * @author Developer
 * @version 3.0
 */
public class TrainApplication {

    /**
     * Main method - JVM entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        ConsolePrinter.printBanner();

        TrainController controller = new TrainController();
        controller.runUC3();

        ConsolePrinter.printReadyMessage();
    }
}