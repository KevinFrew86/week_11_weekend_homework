import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane (AeroplaneType.BOEING747);
    }

    @Test
    public void canGetType() {
        assertEquals(AeroplaneType.BOEING747, plane.getType());
    }

    @Test
    public void capacityIsKnown() {
        assertEquals(660, plane.getCapacity());
    }

    @Test
    public void totalWeightIsKnown() {
        assertEquals(439560, plane.getTotalWeight());
    }

    @Test
    public void baggageCapacityIsKnown() {
        assertEquals(333, plane.getBaggage());
    }

}
