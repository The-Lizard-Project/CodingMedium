package pl.thelizardproject.sda.medium.ship;

import pl.thelizardproject.sda.medium.exception.BrokenShipException;
import pl.thelizardproject.sda.medium.tourist.Tourist;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {

    int endurance;
    private int capacity;
    private List<Tourist> tourists = new ArrayList<>();

    Ship(int endurance, int capacity) {
        this.endurance = endurance;
        this.capacity = capacity;
    }

    public void sail() throws BrokenShipException {
        if (endurance == 0) {
            throw new BrokenShipException(getName());
        }
        endurance--;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract String getName();

    public abstract ShipType getShipType();
}