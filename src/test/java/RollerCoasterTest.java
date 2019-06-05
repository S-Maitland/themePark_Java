
import Attraction.RollerCoaster;
import Attraction.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp(){
        rollerCoaster = new RollerCoaster("Big Dipper");
        visitor = new Visitor(28, 186.75, 600.00);
    }
    @Test
    public void canReturnName(){
        assertEquals("Big Dipper", rollerCoaster.getName());
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
}
