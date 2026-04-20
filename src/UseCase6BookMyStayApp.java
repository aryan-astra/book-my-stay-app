import java.util.HashMap;
import java.util.Map;

public class UseCase6BookMyStayApp {
    private static class Inventory {
        private final Map<String, Integer> rooms = new HashMap<>();

        private void put(String type, int count) {
            rooms.put(type, count);
        }

        private boolean allocate(String type) {
            int available = rooms.getOrDefault(type, 0);
            if (available <= 0) {
                return false;
            }
            rooms.put(type, available - 1);
            return true;
        }

        private int available(String type) {
            return rooms.getOrDefault(type, 0);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 1);

        String requestedType = "Deluxe";
        boolean confirmed = inventory.allocate(requestedType);

        System.out.println("UC6 - Reservation Confirmation And Allocation");
        if (confirmed) {
            System.out.println("Reservation confirmed for " + requestedType + " room.");
        } else {
            System.out.println("Reservation failed: no rooms available.");
        }
        System.out.println("Remaining " + requestedType + " rooms: " + inventory.available(requestedType));

        System.out.println("\nSample output complete for UC6.");
    }
}
