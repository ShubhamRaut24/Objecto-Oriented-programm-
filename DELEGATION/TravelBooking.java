package DELEGATION;

public interface TravelBooking {

    public void bookTicket();

}
class TicketBookingByAgent implements TravelBooking{

    TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking travelBooking)
    {
       this.travelBooking=travelBooking;
    }
    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
class TrainTicket implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("train ticket is booked");
    }
}
class FlyTicket implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("fight ticket is booked");
    }
}
class Demo{
    public static void main(String[] args) {
        TicketBookingByAgent ticketBookingByAgent=new TicketBookingByAgent(new FlyTicket());
        ticketBookingByAgent.bookTicket();
        TicketBookingByAgent ticketBookingByAgent1=new TicketBookingByAgent(new TrainTicket());
        ticketBookingByAgent1.bookTicket();
    }
}