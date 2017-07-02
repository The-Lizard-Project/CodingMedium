package pl.thelizardproject.sda.medium.ship.strategy;

import pl.thelizardproject.sda.medium.ship.Ship;

public class TransatlanticShipControlStrategy implements ShipControlStrategy {
    @Override
    public String control(Ship ship) {
        return "I can sail with " + ship.getName() + " with a transatlantic ship style!";
    }
}