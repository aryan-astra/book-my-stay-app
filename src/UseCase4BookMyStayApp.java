import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase4BookMyStayApp {
    private static class Room {
        private final String id;
        private final String type;
        private final int price;
        private final boolean available;

        private Room(String id, String type, int price, boolean available) {
            this.id = id;
            this.type = type;
            this.price = price;
            this.available = available;
        }

        @Override
        public String toString() {
            return id + "-" + type + "-" + price;
        }
    }

    public static void main(String[] args) {
        List<Room> rooms = Arrays.asList(
            new Room("R-101", "Standard", 2200, true),
            new Room("R-102", "Deluxe", 3500, false),
            new Room("R-103", "Deluxe", 3400, true),
            new Room("R-104", "Suite", 5000, true)
        );

        String wantedType = "Deluxe";
        List<Room> availableMatches = rooms.stream()
            .filter(room -> room.available)
            .filter(room -> room.type.equals(wantedType))
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("UC4 - Search Availability");
        System.out.println("Available " + wantedType + " rooms: " + availableMatches);

        System.out.println("\nSample output complete for UC4.");
    }
}
