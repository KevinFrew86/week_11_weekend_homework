import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bag bag;

    @Before
    public void before() {
        passenger = new Passenger("Craig");
    }

    @Test
    public void passengerHasName() {
        assertEquals("Craig", passenger.getName());
    }

    @Test
    public void passengerHasBags() {

        assertEquals(0, passenger.bagCount());
    }

    @Test
    public void canAddBag() {
        passenger.addBag(bag);
        assertEquals(1, passenger.bagCount());
    }

    @Test
    public void canRemoveBag() {
        passenger.addBag(bag);
        passenger.removeBag();
        assertEquals(0, passenger.bagCount());
    }
}
