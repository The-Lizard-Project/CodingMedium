package pl.thelizardproject.sda.medium;

import org.junit.Before;
import org.junit.Test;
import pl.thelizardproject.sda.medium.captain.Captain;
import pl.thelizardproject.sda.medium.ship.Boat;
import pl.thelizardproject.sda.medium.ship.ShipType;
import pl.thelizardproject.sda.medium.ship.TransatlanticShip;
import pl.thelizardproject.sda.medium.ship.strategy.TransatlanticShipControlStrategy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise5 {

    private Captain captain;

    @Before
    public void setUp() throws Exception {
        captain = new Captain();
    }

    @Test
    public void testSailingWithKnownShip() throws Exception {
        String expectedSailStyle = "I can sail with Transatlantic Ship with a transatlantic ship style!";
        captain.setShip(new TransatlanticShip());
        captain.learn(ShipType.Transatlantic, new TransatlanticShipControlStrategy());

        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithUnknownShip() throws Exception {
        String expectedSailStyle = "I can't sail with Boat!";
        captain.setShip(new Boat());
        captain.learn(ShipType.Transatlantic, new TransatlanticShipControlStrategy());

        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithoutShip() throws Exception {
        assertThatThrownBy(captain::sail)
                .isInstanceOf(IllegalStateException.class)
                .withFailMessage("I can't sail without the ship!");
    }
}