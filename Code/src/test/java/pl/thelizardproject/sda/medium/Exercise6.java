package pl.thelizardproject.sda.medium;

import org.junit.Before;
import org.junit.Test;
import pl.thelizardproject.sda.medium.ship.Ship;
import pl.thelizardproject.sda.medium.ship.TransatlaticShip;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise6 {

    private Ship ship;

    @Before
    public void setUp() throws Exception {
        ship = new TransatlaticShip();
    }

    @Test
    public void testCapacity() throws Exception {
        int expectedCapacity = 5000;

        int capacity = ship.getCapacity();

        assertThat(capacity)
                .isEqualTo(expectedCapacity);
    }
}