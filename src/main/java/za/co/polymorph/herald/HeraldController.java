package za.co.polymorph.herald;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.polymorph.occasion.OccasionProperties;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HeraldController {

    private static final Logger LOG = LoggerFactory.getLogger(HeraldController.class);

    @Autowired
    private OccasionProperties occasionProperties;

    @RequestMapping(value = "/welcome/{arrivalName}", method = GET)
    public OccasionResponse publish(@PathVariable String arrivalName) {
        if (isGuest(arrivalName)) {
            return new WelcomeResponse(arrivalName, occasionProperties.getVenue());
        } else {
            return new RejectionResponse(arrivalName);
        }
    }

    private boolean isGuest(String arrivalName) {
        LOG.debug("arrivalName: [{}], attendees: [{}]", arrivalName, occasionProperties.getGuests());
        return occasionProperties.getGuests().stream().anyMatch(x -> x.equalsIgnoreCase(arrivalName));
    }
}
