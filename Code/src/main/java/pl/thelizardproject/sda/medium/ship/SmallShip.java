package pl.thelizardproject.sda.medium.ship;

public class SmallShip extends Ship {

    public SmallShip() {
        super(2000);
    }

    @Override
    public String sail() {
        super.sail();
        endurance--;
        return "The ship is sailing nimbly!";
    }

    @Override
    public String getName() {
        return "Small Ship";
    }
}