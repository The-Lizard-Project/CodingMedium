package pl.thelizardproject.sda.medium.ship;

public abstract class Ship {

    int endurance;

    Ship(int endurance) {
        this.endurance = endurance;
    }

    public void sail() {
    }

    public int getEndurance() {
        return endurance;
    }

    public abstract String getName();
}