package labprograms;
class Reservation {

    private int availableSeats;

    Reservation(int seats) {
        availableSeats = seats;
    }

    synchronized void reserve(int requestedSeats, String personName) {

        System.out.println(personName + " entered.");

        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + requestedSeats);

        if (requestedSeats <= availableSeats) {

            System.out.println("Seat Available. Reserve now :-)");

            availableSeats = availableSeats - requestedSeats;

            System.out.println(requestedSeats + " seats reserved.");

        } else {

            System.out.println("Requested seats not available :-)");
        }

        System.out.println(personName + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {

    private Reservation reservation;
    private int requestedSeats;

    Person(Reservation reservation, String name, int requestedSeats) {
        super(name);
        this.reservation = reservation;
        this.requestedSeats = requestedSeats;
    }

    public void run() {
        reservation.reserve(requestedSeats, getName());
    }
}

public class ReservationSystem {

    public static void main(String[] args) {

        Reservation reservation = new Reservation(10);

        Person person1 = new Person(reservation, "Person-1", 5);
        Person person2 = new Person(reservation, "Person-2", 2);
        Person person3 = new Person(reservation, "Person-3", 4);

        person1.setPriority(Thread.MAX_PRIORITY);
        person2.setPriority(Thread.NORM_PRIORITY);
        person3.setPriority(Thread.MIN_PRIORITY);

        person1.start();
        person2.start();
        person3.start();
    }
}