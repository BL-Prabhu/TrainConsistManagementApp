package app;


import controller.TrainController;

public class TrainApplication {

    public static void main(String[] args) {

        com.train.util.ConsolePrinter.printBanner();

        TrainController controller = new TrainController();
        controller.startApplication();

        com.train.util.ConsolePrinter.printReadyMessage();
    }
}