import java.util.ArrayList;
import java.util.List;

public class UseCase12BookMyStayApp {
    private static class Booking {
        private final String id;
        private final String guest;

        private Booking(String id, String guest) {
            this.id = id;
            this.guest = guest;
        }

        private String toRecord() {
            return id + "," + guest;
        }

        private static Booking fromRecord(String record) {
            String[] parts = record.split(",");
            return new Booking(parts[0], parts[1]);
        }
    }

    public static void main(String[] args) {
        List<Booking> liveData = new ArrayList<>();
        liveData.add(new Booking("B-3001", "Ira"));
        liveData.add(new Booking("B-3002", "Rohan"));

        List<String> mockStorage = new ArrayList<>();
        for (Booking booking : liveData) {
            mockStorage.add(booking.toRecord());
        }

        List<Booking> recoveredData = new ArrayList<>();
        for (String record : mockStorage) {
            recoveredData.add(Booking.fromRecord(record));
        }

        System.out.println("UC12 - Data Persistence/Recovery Mock");
        System.out.println("Stored records: " + mockStorage.size());
        System.out.println("Recovered records: " + recoveredData.size());

        System.out.println("\nSample output complete for UC12.");
    }
}
