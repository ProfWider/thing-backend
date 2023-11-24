package htw.berlin.webtech.thingbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThingController {

    @Autowired
    ThingService service;

    Logger logger = LoggerFactory.getLogger(ThingController.class);

    @PostMapping("/things")
    public Thing createThing(@RequestBody Thing thing) {
        return service.save(thing);
    }

    @GetMapping("/things/{id}")
    public Thing getThing(@PathVariable String id) {
        logger.info("GET request on route things with {}", id);
        Long thingId = Long.parseLong(id);
        return service.get(thingId);
    }

    @GetMapping("/things")
    public List<Thing> getAllThings() {
        return service.getAll();
    }


}
