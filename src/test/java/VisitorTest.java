import Attraction.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(22, 187.96, 600.00);
    }

    @Test
    public void canGetAge(){
        assertEquals(22, visitor.getAge(),0.01);
    }

    @Test
    public void canGetHeight(){
        assertEquals(187.96, visitor.getHeight(),0.01);
    }

    @Test
    public void canGetMoney(){
        assertEquals(600.00, visitor.getMoney(),0.01);
    }

}
