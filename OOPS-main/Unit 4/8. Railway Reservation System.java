class RailwayReservation {
    int tickets = 1;
    synchronized void book() {
        if (tickets > 0) {
            System.out.println("Ticket booked successfully");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }
    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();
        new Thread(obj::book).start();
        new Thread(obj::book).start();
    }
}
