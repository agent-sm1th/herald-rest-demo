package za.co.polymorph.herald;

public class RejectionResponse implements OccasionResponse {

    private static final String template = "Sorry %s. You are not invited to this occasion. Please report to reception.";
    private final String intruderName;

    RejectionResponse(String guestName) {
        this.intruderName = guestName;
    }

    public String getMessage() {
        return String.format(template, intruderName);
    }
}
