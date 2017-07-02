package pl.thelizardproject.sda.medium.ship.strategy;

import pl.thelizardproject.sda.medium.ship.Ship;

public interface ShipControlStrategy {
    String control(Ship ship);
}