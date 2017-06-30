package pl.thelizardproject.sda.medium;

import org.junit.Before;
import org.junit.Test;
import pl.thelizardproject.sda.medium.captain.Captain;
import pl.thelizardproject.sda.medium.captain.SeaWolf;
import pl.thelizardproject.sda.medium.ship.SmallShip;
import pl.thelizardproject.sda.medium.ship.VeryBigShip;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise4 {

    private Captain captain;

    @Before
    public void setUp() throws Exception {
        captain = new SeaWolf();
    }

    @Test
    public void testSailingWithVeryBigShip() throws Exception {
        String expectedSailStyle = "I can sail with Very Big Ship like a boss, mate!";

        captain.setShip(new VeryBigShip());
        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithSmallShip() throws Exception {
        String expectedSailStyle = "I can sail with Small Ship like a boss, mate!";

        captain.setShip(new SmallShip());
        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithoutShip() throws Exception {
        assertThatThrownBy(() -> captain.sail())
                .isInstanceOf(IllegalStateException.class)
                .withFailMessage("I can't sail without the ship!");
    }
}