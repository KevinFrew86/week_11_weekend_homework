import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private AeroplaneType aeroplane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(AeroplaneType aeroplane, String flightNum, String destination, String departureAirport, String departureTime) {
        this.aeroplane = aeroplane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }


    public AeroplaneType getType() {
        return aeroplane;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (this.spaceLeft()) {
            this.passengers.add(passenger);
        }
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int seatsLeft() {
        return (this.aeroplane.getCapacityValue() - this.passengerCount());
    }

    public boolean spaceLeft() {
        if (this.passengerCount() < aeroplane.getCapacityValue()) {
            return true;
        }
        return false;
    }
}
