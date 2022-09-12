import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureFrom;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureFrom, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureFrom = departureFrom;
        this.departureTime = departureTime;
    }

    public int getNumberOfSeatsFromFlight(){
        return this.plane.getNumberOfSeats();
    }

    public String addPassenger(Passenger passenger){
        if (this.getPassengers() < this.getNumberOfSeatsFromFlight()) {
        this.passengers.add(passenger);
        return "Added";
        }
        return "Not added";
    }

    public int getPassengers(){
        return this.passengers.size();
    }
}
