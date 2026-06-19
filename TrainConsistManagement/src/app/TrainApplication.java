package app;


import controller.TrainController;
import util.ConsolePrinter;

public class TrainApplication {

    public static void main(String[] args) {

        ConsolePrinter.printBanner();

        TrainController controller = new TrainController();
        controller.runUC2();   // calling UC2

        ConsolePrinter.printReadyMessage();
    }
}