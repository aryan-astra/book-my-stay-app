import java.util.HashMap;
import java.util.Map;

public class UseCase10BookMyStayApp {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Standard", 3);

        String bookingId = "B-2001";
        String roomType = "Standard";

        inventory.put(roomType, inventory.get(roomType) - 1);
        System.out.println("UC10 - Cancellation And Rollback");
        System.out.println("After booking, available " + roomType + ": " + inventory.get(roomType));

        boolean cancelled = true;
        if (cancelled) {
            inventory.put(roomType, inventory.get(roomType) + 1);
            System.out.println("Booking " + bookingId + " cancelled and rolled back.");
        }

        System.out.println("After rollback, available " + roomType + ": " + inventory.get(roomType));
        System.out.println("\nSample output complete for UC10.");
    }
}
