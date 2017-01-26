package za.co.polymorph.herald.impl;

import za.co.polymorph.herald.OccasionResponse;

public class WelcomeResponse implements OccasionResponse {

    private static final String template = "Welcome %s. Please continue to the venue and take a seat.";
    private final String guestName;
    private final String venue;

    public WelcomeResponse(String guestName, String venue) {
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
