package music_shop.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PickTest {

    private Pick pick;

    @Before
    public void setUp() throws Exception {
        pick = new Pick("Pic for guitar", 100, 80);
    }

    @Test
    public void getDescription() {
        assertEquals("Pic for guitar", pick.getDescription());
    }

    @Test
    public void setDescription() {
        pick.setDescription("Book for music 2");
        assertEquals("Book for music 2", pick.getDescription());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(100, pick.getSellingPrice(), 0.0);
    }

    @Test
    public void setSellingPrice() {
        pick.setSellingPrice(99);
        assertEquals(99, pick.getSellingPrice(), 0.0);

    }

    @Test
    public void getBoughtPrice() {
        assertEquals(80, pick.getBoughtPrice(), 0.0);
    }

    @Test
    public void setBoughtPrice() {
        pick.setBoughtPrice(81);
        assertEquals(81, pick.getBoughtPrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20, pick.calculateMarkup(), 0.0);
    }
}