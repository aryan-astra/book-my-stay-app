import java.util.LinkedHashMap;
import java.util.Map;

public class UseCase7BookMyStayApp {
    public static void main(String[] args) {
        Map<String, Integer> addOnCatalog = new LinkedHashMap<>();
        addOnCatalog.put("Breakfast", 300);
        addOnCatalog.put("AirportPickup", 800);
        addOnCatalog.put("Laundry", 200);

        String[] selected = {"Breakfast", "Laundry"};
        int totalAddOnCost = 0;
        for (String item : selected) {
            totalAddOnCost += addOnCatalog.getOrDefault(item, 0);
        }

        System.out.println("UC7 - Add-On Service Selection");
        System.out.println("Selected add-ons: Breakfast, Laundry");
        System.out.println("Add-on total: " + totalAddOnCost);

        System.out.println("\nSample output complete for UC7.");
    }
}
