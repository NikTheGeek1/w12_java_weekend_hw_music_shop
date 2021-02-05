package music_shop.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    private Drums drums;

    @Before
    public void setUp() throws Exception {
        drums = new Drums("percussion", "rainbow", 5, 100);
    }

    @Test
    public void getNumOfParts() {
        assertEquals(5, drums.getNumOfParts());
    }

    @Test
    public void setNumOfParts() {
        drums.setNumOfParts(3);
        assertEquals(3, drums.getNumOfParts());
    }

    @Test
    public void play() {
        assertEquals("tou rou tou toun", drums.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(100, drums.getPrice(), 0.0);
    }
}