package music_shop.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TunerTest {

    private Tuner tuner;

    @Before
    public void setUp() throws Exception {
        tuner = new Tuner("Tuner", 100, 80);
    }

    @Test
    public void getDescription() {
        assertEquals("Tuner", tuner.getDescription());
    }

    @Test
    public void setDescription() {
        tuner.setDescription("Book for music 2");
        assertEquals("Book for music 2", tuner.getDescription());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(100, tuner.getSellingPrice(), 0.0);
    }

    @Test
    public void setSellingPrice() {
        tuner.setSellingPrice(99);
        assertEquals(99, tuner.getSellingPrice(), 0.0);

    }

    @Test
    public void getBoughtPrice() {
        assertEquals(80, tuner.getBoughtPrice(), 0.0);
    }

    @Test
    public void setBoughtPrice() {
        tuner.setBoughtPrice(81);
        assertEquals(81, tuner.getBoughtPrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20, tuner.calculateMarkup(), 0.0);
    }

}