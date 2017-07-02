package pl.thelizardproject.sda.medium.ship;

import pl.thelizardproject.sda.medium.exception.BrokenShipException;

public class Boat extends Ship {

    public Boat() {
        super(200, 5);
    }

    @Override
    public void sail() throws BrokenShipException {
        super.sail();
        endurance--;
    }

    @Override
    public String getName() {
        return "Boat";
    }

    @Override
    public ShipType getShipType() {
        return ShipType.Boat;
    }
}