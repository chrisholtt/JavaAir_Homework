import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Alice", "Flight attendant");
    }

    @Test
    public void canRelayMessage(){
        assertEquals("We finna crash", cabinCrewMember.relayMessage("We finna crash"));
    }

}
