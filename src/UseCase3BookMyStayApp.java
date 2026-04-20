import java.util.HashMap;
import java.util.Map;

public class UseCase3BookMyStayApp {
    private static class RoomInventory {
        private final Map<String, Integer> inventory = new HashMap<>();

        private void set(String roomType, int count) {
            inventory.put(roomType, count);
        }

        private int get(String roomType) {
            return inventory.getOrDefault(roomType, 0);
        }

        private boolean allocate(String roomType) {
            int available = get(roomType);
            if (available <= 0) {
                return false;
            }
            inventory.put(roomType, available - 1);
            return true;
        }
    }

    public static void main(String[] args) {
        RoomInventory centralizedInventory = new RoomInventory();
        centralizedInventory.set("Standard", 10);
        centralizedInventory.set("Deluxe", 4);

        boolean allocated = centralizedInventory.allocate("Standard");

        System.out.println("UC3 - Centralized Room Inventory");
        System.out.println("Standard room allocated: " + allocated);
        System.out.println("Standard rooms remaining: " + centralizedInventory.get("Standard"));

        System.out.println("\nSample output complete for UC3.");
    }
}
