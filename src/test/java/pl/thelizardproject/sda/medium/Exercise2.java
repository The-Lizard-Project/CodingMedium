package pl.thelizardproject.sda.medium;

import org.junit.Before;
import org.junit.Test;
import pl.thelizardproject.sda.medium.ship.Ship;
import pl.thelizardproject.sda.medium.ship.SmallShip;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2 {

    private Ship ship;

    @Before
    public void setUp() throws Exception {
        ship = new SmallShip();
    }

    @Test
    public void testName() throws Exception {
        String expectedName = "Small Ship";

        String name = ship.getName();

        assertThat(name)
                .isEqualTo(expectedName);
    }


    @Test
    public void testSail() throws Exception {
        String expectedSailStyle = "The ship is sailing nimbly!";

        String sailStyle = ship.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testEnduranceOfNewShip() throws Exception {
        int expectedEndurance = 2000;

        int endurance = ship.getEndurance();

        assertThat(endurance)
                .isEqualTo(expectedEndurance);
    }

    @Test
    public void testEnduranceAfterOneTrip() throws Exception {
        int expectedEndurance = 1998;

        sail(ship, 1);
        int endurance = ship.getEndurance();

        assertThat(endurance)
                .isEqualTo(expectedEndurance);
    }

    @Test
    public void testEnduranceAfter20Trips() throws Exception {
        int expectedEndurance = 1960;

        sail(ship, 20);
        int endurance = ship.getEndurance();

        assertThat(endurance)
                .isEqualTo(expectedEndurance);
    }

    private static void sail(Ship ship, int amount) {
        for (int i = 0; i < amount; i++) {
            ship.sail();
        }
    }
}