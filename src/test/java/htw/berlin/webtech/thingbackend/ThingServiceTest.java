package htw.berlin.webtech.thingbackend;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class ThingServiceTest {

    @Autowired
    private ThingService service;

    @MockBean
    private ThingRepository repository;

    @Test
    @DisplayName("should find a thing by its id")
    void testGet() {
        var t1 = new Thing("Lineal", 99, "wider@htw-berlin.de");
        var t2 = new Thing("Stift", 199, "wider@htw-berlin.de");
        doReturn(Optional.of(t1)).when(repository).findById(42L);
        doReturn(Optional.of(t2)).when(repository).findById(43L);

        Thing actual = service.get(42L);

        assertEquals(actual.getPrice(), 99);
    }
}


