public class UseCase9BookMyStayApp {
    private static void validateBookingInput(String guestName, int nights) {
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name is required.");
        }
        if (nights <= 0) {
            throw new IllegalArgumentException("Nights must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        String guestName = "";
        int nights = 2;

        System.out.println("UC9 - Error Handling And Validation");
        try {
            validateBookingInput(guestName, nights);
            System.out.println("Booking input is valid.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Validation error: " + ex.getMessage());
        }

        System.out.println("\nSample output complete for UC9.");
    }
}
