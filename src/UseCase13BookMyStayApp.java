public class UseCase13BookMyStayApp {
    public static void main(String[] args) {
        long requestsHandled = 1200;
        long successfulBookings = 910;
        long failedBookings = requestsHandled - successfulBookings;
        double avgResponseMs = 18.7;

        System.out.println("UC13 - Performance/System Summary");
        System.out.println("Requests handled: " + requestsHandled);
        System.out.println("Successful bookings: " + successfulBookings);
        System.out.println("Failed bookings: " + failedBookings);
        System.out.println("Average response time (ms): " + avgResponseMs);

        System.out.println("\nSample output complete for UC13.");
    }
}
