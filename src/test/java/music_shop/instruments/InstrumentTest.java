package music_shop.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentTest {

    private Bouzouki bouzouki;

    @Before
    public void setUp() throws Exception {
        bouzouki = new Bouzouki("Chord", "black", 4, 8, 1.10);
    }

    @Test
    public void getType() {
        assertEquals("Chord", bouzouki.getType());
    }

    @Test
    public void setType() {
        bouzouki.setType("Hybrid");
        assertEquals("Hybrid", bouzouki.getType());
    }

    @Test
    public void getColour() {
        assertEquals("black", bouzouki.getColour());
    }

    @Test
    public void setColour() {
        bouzouki.setColour("yellow");
        assertEquals("yellow", bouzouki.getColour());
    }
}