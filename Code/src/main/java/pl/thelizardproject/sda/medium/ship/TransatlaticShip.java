package pl.thelizardproject.sda.medium.ship;

public class TransatlaticShip extends Ship {

    public TransatlaticShip() {
        super(10000, 5000);
    }

    @Override
    public String getName() {
        return "Transatlantic Ship";
    }

    @Override
    public ShipType getShipType() {
        return ShipType.Transatlantic;
    }
}