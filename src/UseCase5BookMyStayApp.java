public class UseCase5BookMyStayApp {
    private static class BookingRequest {
        private final String guestName;
        private final String roomType;
        private final int nights;

        private BookingRequest(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        @Override
        public String toString() {
            return "BookingRequest{guest='" + guestName + "', roomType='" + roomType + "', nights=" + nights + "}";
        }
    }

    public static void main(String[] args) {
        BookingRequest request = new BookingRequest("Aarav", "Deluxe", 3);

        System.out.println("UC5 - Booking Request");
        System.out.println("Created request: " + request);

        System.out.println("\nSample output complete for UC5.");
    }
}
