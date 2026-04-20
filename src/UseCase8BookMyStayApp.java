import java.util.ArrayList;
import java.util.List;

public class UseCase8BookMyStayApp {
    private static class Booking {
        private final String id;
        private final String guest;
        private final int amount;

        private Booking(String id, String guest, int amount) {
            this.id = id;
            this.guest = guest;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        List<Booking> history = new ArrayList<>();
        history.add(new Booking("B-1001", "Aarav", 7000));
        history.add(new Booking("B-1002", "Diya", 5400));
        history.add(new Booking("B-1003", "Kabir", 9000));

        int totalRevenue = 0;
        for (Booking booking : history) {
            totalRevenue += booking.amount;
        }

        System.out.println("UC8 - Booking History And Reporting");
        System.out.println("Total bookings: " + history.size());
        System.out.println("Total revenue: " + totalRevenue);

        System.out.println("\nSample output complete for UC8.");
    }
}
