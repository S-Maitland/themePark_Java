import Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    @Before
    public void setUp(){
        playground = new Playground("RaptorCity");
    }

    @Test
    public void canGetName(){
        assertEquals("RaptorCity", playground.getName());
    }
}
