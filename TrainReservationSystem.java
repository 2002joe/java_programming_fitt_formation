// Base class representing a generic ticket
class Ticket {
    String passengerName;
    String source;
    String destination;

    // Constructor to initialize ticket details
    public Ticket(String passengerName, String source, String destination) 
	{
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }
}

// Derived class representing a train ticket
class TrainTicket extends Ticket {
    int trainNumber;
    String departureTime;

    // Constructor to initialize train ticket details
    public TrainTicket(String passengerName, String source, String destination, int trainNumber, String departureTime) {
        // Call the base class constructor using 'super'
        super(passengerName, source, destination);
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    // Method to display train ticket details
    public void displayTrainTicketDetails() {
        // Call the base class method using 'super'
        super.displayTicketDetails();
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Departure Time: " + departureTime);
    }
}

public class TrainReservationSystem {
    public static void main(String[] args) {
        // Example usage of TrainTicket
        TrainTicket trainTicket = new TrainTicket("John Doe", "City A", "City B", 123, "12:00 PM");
        
        // Display train ticket details
        System.out.println("Train Ticket Details:");
        trainTicket.displayTrainTicketDetails();
    }
}
