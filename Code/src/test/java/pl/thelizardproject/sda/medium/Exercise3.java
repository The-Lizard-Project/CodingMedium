package pl.thelizardproject.sda.medium;

import org.junit.Before;
import org.junit.Test;
import pl.thelizardproject.sda.medium.captain.Captain;
import pl.thelizardproject.sda.medium.captain.Landlubber;
import pl.thelizardproject.sda.medium.ship.SmallShip;
import pl.thelizardproject.sda.medium.ship.VeryBigShip;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3 {

    private Captain captain;

    @Before
    public void setUp() throws Exception {
        captain = new Landlubber();
    }

    @Test
    public void testSailingWithVeryBigShip() throws Exception {
        String expectedSailStyle = "I can't sail!";

        captain.setShip(new VeryBigShip());
        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithSmallShip() throws Exception {
        String expectedSailStyle = "I can't sail!";

        captain.setShip(new SmallShip());
        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }

    @Test
    public void testSailingWithoutShip() throws Exception {
        String expectedSailStyle = "I can't sail!";

        String sailStyle = captain.sail();

        assertThat(sailStyle)
                .isEqualTo(expectedSailStyle);
    }
}