import java.util.LinkedHashMap;
import java.util.Map;

public class UseCase2BookMyStayApp {
    public static void main(String[] args) {
        Map<String, Integer> staticAvailability = new LinkedHashMap<>();
        staticAvailability.put("Standard", 8);
        staticAvailability.put("Deluxe", 5);
        staticAvailability.put("Suite", 2);

        System.out.println("UC2 - Room Types Static Availability");
        for (Map.Entry<String, Integer> entry : staticAvailability.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " available");
        }

        System.out.println("\nSample output complete for UC2.");
    }
}
