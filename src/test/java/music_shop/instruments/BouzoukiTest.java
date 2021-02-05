package music_shop.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BouzoukiTest {

    private Bouzouki bouzouki;

    @Before
    public void setUp() throws Exception {
        bouzouki = new Bouzouki("Chord", "black", 8, 1.10, 100);
    }

    @Test
    public void getNumOfStrings() {
        assertEquals(8, bouzouki.getNumOfStrings());
    }

    @Test
    public void setNumOfStrings() {
        bouzouki.setNumOfStrings(6);
        assertEquals(6, bouzouki.getNumOfStrings());
    }

    @Test
    public void getNeckSize() {
        assertEquals(1.10, bouzouki.getNeckSize(), 0.0);
    }

    @Test
    public void setNeckSize() {
        bouzouki.setNeckSize(1.11);
        assertEquals(1.11, bouzouki.getNeckSize(), 0.0);
    }

    @Test
    public void play() {
        assertEquals("ti ri ti tin", bouzouki.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(100, bouzouki.getPrice(), 0.0);
    }
}