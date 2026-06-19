package util;

/**
 * Utility class for handling console output.
 *
 * <p>Provides reusable methods for:
 * <ul>
 *     <li>Printing banners</li>
 *     <li>Displaying system messages</li>
 * </ul>
 *
 * <p>This avoids duplication of print statements
 * across the application.
 *
 * <p>Follows static utility class design pattern.
 *
 * @author Developer
 * @version 1.0
 */
public class ConsolePrinter {

    /**
     * Prints application banner.
     */
    public static void printBanner() {
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=======================================\n");
    }

    /**
     * Prints system ready message.
     */
    public static void printReadyMessage() {
        System.out.println("\nSystem ready for operations...");
    }
}