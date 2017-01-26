package za.co.polymorph.herald;

public class WelcomeResponse implements OccasionResponse {

    private static final String template = "Welcome %s. Please continue to the venue and take a seat.";
    private final String guestName;
    private final String venue;

    WelcomeResponse(String guestName, String venue) {
        this.guestName = guestName;
        this.venue = venue;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getMessage() {
        return String.format(template, guestName);
    }

    public String getVenue() {
        return venue;
    }
}
