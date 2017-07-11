package pl.thelizardproject.sda.medium.captain;

import pl.thelizardproject.sda.medium.exception.BrokenShipException;
import pl.thelizardproject.sda.medium.ship.Ship;
import pl.thelizardproject.sda.medium.ship.ShipType;
import pl.thelizardproject.sda.medium.ship.strategy.ShipControlStrategy;

import java.util.HashMap;

public class Captain {

    private Ship ship;
    private HashMap<ShipType, ShipControlStrategy> leanedStrategies = new HashMap<>();

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void learn(ShipType shipType, ShipControlStrategy shipControlStrategy) {
        leanedStrategies.put(shipType, shipControlStrategy);
    }

    public String sail() throws BrokenShipException {
        if (ship == null) {
            throw new IllegalStateException("I can't sail without the ship!");
        }

        // old logic
        if (leanedStrategies.isEmpty()) {
            if (ship.getShipType() == ShipType.Boat) {
                ship.sail();
                return "I can sail with " + ship.getName() + " like a boss, mate!";
            } else {
                return "I can't sail with " + ship.getName() + "!";
            }
        }

        // new logic
        if (leanedStrategies.containsKey(ship.getShipType())) {
            ship.sail();
            return leanedStrategies.get(ship.getShipType()).control(ship);
        } else {
            return "I can't sail with " + ship.getName() + "!";
        }
    }
}