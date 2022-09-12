import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PilotTest {
    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("John", "Private", "ff4fere");
    }

    @Test
    public void canthePilotFlyThePLane(){
        assertEquals("Taking off", pilot.flyThePLane());
    }


}
