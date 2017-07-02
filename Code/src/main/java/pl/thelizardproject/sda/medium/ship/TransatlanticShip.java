package pl.thelizardproject.sda.medium.ship;

public class TransatlanticShip extends Ship {

    public TransatlanticShip() {
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