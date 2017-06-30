package pl.thelizardproject.sda.medium.ship;

public class VeryBigShip extends Ship {

    public VeryBigShip() {
        super(10000);
        endurance--;
    }

    @Override
    public String sail() {
        super.sail();
        return "The ship is sailing very fast!";
    }

    @Override
    public String getName() {
        return "Very Big Ship";
    }
}