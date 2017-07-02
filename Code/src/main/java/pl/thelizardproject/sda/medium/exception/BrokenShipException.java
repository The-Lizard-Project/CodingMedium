package pl.thelizardproject.sda.medium.exception;

public class BrokenShipException extends Exception {
    public BrokenShipException(String shipName) {
        super("The " + shipName + " is broken");
    }
}