import Attraction.Dodgem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;
    ArrayList<Dodgem> dodgems;

    @Before
    public void setUp(){
        dodgem = new Dodgem("bash");
        dodgems = new ArrayList<Dodgem>();
    }

    @Test
    public void canCreateDodgem(){
        dodgems.add(dodgem);
        assertEquals(1, dodgems.size());
    }

    @Test
    public void canGetDodgemName(){
        assertEquals("bash", dodgem.getName());
    }

}
