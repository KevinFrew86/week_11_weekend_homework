import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    AeroplaneType aeroplaneType;

    @Before
    public void before() {
        flight = new Flight(aeroplaneType.BOEING747, "FR666", "BER", "GLA", "1000" );

    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(aeroplaneType.BOEING747, flight.getType());
    }

    @Test
    public void flightHasFlightNum() {
        assertEquals("FR666", flight.getFlightNum());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("BER", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("1000", flight.getDepartureTime());
    }

    @Test
    public void passengersStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canCountAvailableSeats() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(654, flight.seatsLeft());
    }

    @Test
    public void hasSpace(){
        assertEquals(true, flight.spaceLeft());
    }
}
