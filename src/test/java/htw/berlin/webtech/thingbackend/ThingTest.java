package htw.berlin.webtech.thingbackend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class ThingTest {

        @Test
        void testToString() {
            //Eingabedaten
            String name = "Ding";
            int price = 99;

            //"System under test" aufsetzen
            Thing thing = new Thing(name, price, "wider@htw-berlin.de");
            thing.setId(42L);

            //Erwartetes Ergebnis
            String expected = "Thing{id=42, name='Ding', price=99}";

            //Tatsächliches Ergebnis
            String actual = thing.toString();

            //Vergleich
            assertEquals(expected, actual);
        }
    }


