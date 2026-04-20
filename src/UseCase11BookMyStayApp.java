public class UseCase11BookMyStayApp {
    private static class SharedInventory {
        private int deluxeRooms;

        private SharedInventory(int deluxeRooms) {
            this.deluxeRooms = deluxeRooms;
        }

        private synchronized boolean tryBookDeluxe(String user) {
            if (deluxeRooms <= 0) {
                System.out.println(user + " booking failed (no room left)");
                return false;
            }
            deluxeRooms--;
            System.out.println(user + " booking confirmed. Remaining deluxe: " + deluxeRooms);
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedInventory inventory = new SharedInventory(1);

        Thread userA = new Thread(() -> inventory.tryBookDeluxe("UserA"));
        Thread userB = new Thread(() -> inventory.tryBookDeluxe("UserB"));

        System.out.println("UC11 - Concurrent Booking Simulation");
        userA.start();
        userB.start();
        userA.join();
        userB.join();

        System.out.println("\nSample output complete for UC11.");
    }
}
