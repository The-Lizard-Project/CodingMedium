package pl.thelizardproject.sda.medium.ship;

public abstract class Ship {

    int endurance;

    Ship(int endurance) {
        this.endurance = endurance;
    }

    public String sail() {
        if (endurance == 0) {
            throw new IllegalStateException("The ship is broken");
        }
        endurance--;
        return "The ship is sailing normally!";
    }

    public String getName() {
        return "Abstract ship";
    }

    public int getEndurance() {
        return endurance;
    }
}