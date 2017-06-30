package pl.thelizardproject.sda.medium.captain;

import pl.thelizardproject.sda.medium.ship.Ship;

public class Landlubber implements Captain {

    @Override
    public void setShip(Ship ship) {
    }

    @Override
    public String sail() {
        return "I can't sail!";
    }
}