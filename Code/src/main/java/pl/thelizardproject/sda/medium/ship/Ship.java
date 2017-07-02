package pl.thelizardproject.sda.medium.ship;

import pl.thelizardproject.sda.medium.exception.BrokenShipException;
import pl.thelizardproject.sda.medium.tourist.Tourist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Ship {

    int endurance;
    private int capacity;
    private List<Tourist> tourists = new ArrayList<>();

    Ship(int endurance, int capacity) {
        this.endurance = endurance;
        this.capacity = capacity;
    }

    public void sail() throws BrokenShipException {
        if (endurance == 0) {
            throw new BrokenShipException(getName());
        }
        endurance--;
    }

    public void addTourist(Tourist tourist) {
        if (tourists.size() == capacity) {
            throw new IllegalStateException("Too much tourists!");
        }
        tourists.add(tourist);
    }

    public int getEndurance() {
        return endurance;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTouristCount() {
        return tourists.size();
    }

    public Tourist getFirstTourist() {
        return tourists.stream()
                .findFirst()
                .orElse(null);
    }

    public Tourist getLastTourist() {
        return tourists.stream()
                .reduce((a, b) -> b)
                .orElse(null);
    }

    public String getTouristNames() {
        return tourists.stream()
                .map(tourist -> tourist.name)
                .collect(Collectors.joining(", "));
    }

    public Tourist getTheOldestTourist() {
        return tourists.stream()
                .max(Comparator.comparingInt(o -> o.age))
                .orElse(null);
    }

    public Tourist getTheYoungestTourist() {
        return tourists.stream()
                .min(Comparator.comparingInt(o -> o.age))
                .orElse(null);
    }

    public List<Tourist> getTouristsSortedByAgeAsc() {
        return tourists.stream()
                .sorted(Comparator.comparingInt(o -> o.age))
                .collect(Collectors.toList());
    }

    public List<Tourist> getTouristsSortedByAgeDesc() {
        return tourists.stream()
                .sorted(Comparator.comparingInt(o -> ((Tourist) o).age).reversed())
                .collect(Collectors.toList());
    }

    public List<Tourist> getFemaleTourists() {
        return tourists.stream()
                .filter(tourist -> !tourist.isMale)
                .collect(Collectors.toList());
    }

    public List<Tourist> getMaleTourists() {
        return tourists.stream()
                .filter(tourist -> tourist.isMale)
                .collect(Collectors.toList());
    }

    public abstract String getName();

    public abstract ShipType getShipType();
}