import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Passenger passenger;
    ArrayList<Passenger> passengers;
    Plane plane;
    Flight flight;

    @Before
    public void setUp(){
        pilot = new Pilot("Chris", "Captain", "PB87Cdds");
        cabinCrewMember = new CabinCrewMember("John", "Flight Attendant");
        passenger = new Passenger("Alice", 2);
        plane = new Plane(PlaneType.BOEING747);
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        passengers = new ArrayList<Passenger>();
        flight = new Flight(pilot, cabinCrewMembers, passengers, plane, "JC89", "DUB", "EDI", "13:04");
    }

    @Test
    public void canGetNumberofAvailableSeats(){
        assertEquals(10, flight.getNumberOfSeatsFromFlight());
    }

    @Test
    public void canBookPassengerOntoPlane(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void cannotBookPassengerIfAtMaxCapacity(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals("Not added", flight.addPassenger(passenger));
    }
}
