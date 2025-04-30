package lab8;
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class TicketBooking {
    private static final boolean[] seats = new boolean[10];
    
    public static void bookSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked.");
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        try {
            TicketBooking.bookSeat(3);
            TicketBooking.bookSeat(3);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
    }
}
