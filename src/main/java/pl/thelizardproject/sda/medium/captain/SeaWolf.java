package pl.thelizardproject.sda.medium.captain;

import pl.thelizardproject.sda.medium.ship.Ship;

public class SeaWolf implements Captain {

    private Ship ship;

    @Override
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String sail() {
        if (ship == null) {
            throw new IllegalStateException("I can't sail without the ship!");
        }

        ship.sail();
        return "I can sail with " + ship.getName() + " like a boss, mate!";
    }
}
