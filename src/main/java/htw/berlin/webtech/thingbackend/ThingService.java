package htw.berlin.webtech.thingbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThingService {

    @Autowired
    ThingRepository repo;

    public Thing save(Thing thing) {
        return repo.save(thing);
    }

    public Thing get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Thing> getAll() {
        Iterable<Thing> iterator = repo.findAll();
        List<Thing> things = new ArrayList<>();
        for (Thing thing : iterator)  things.add(thing);
        return things;
    }

}
