package pl.thelizardproject.sda.medium.captain;

import pl.thelizardproject.sda.medium.ship.Ship;

public interface Captain {

    void setShip(Ship ship);

    String sail();
}