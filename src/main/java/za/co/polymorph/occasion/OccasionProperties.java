package za.co.polymorph.occasion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hermansmith on 2017/01/26.
 */

@Component
@ConfigurationProperties(prefix = "occasion")
public class OccasionProperties {
    private String venue;
    private List<String> guests;

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public List<String> getGuests() {
        return guests;
    }

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }
}
