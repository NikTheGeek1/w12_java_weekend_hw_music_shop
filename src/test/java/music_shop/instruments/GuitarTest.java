package music_shop.instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("chord", "white", .80, 100);
    }

    @Test
    public void getNeckSize() {
        assertEquals(.80, guitar.getNeckSize(), 0.0);
    }

    @Test
    public void setNeckSize() {
        guitar.setNeckSize(1);
        assertEquals(1, guitar.getNeckSize(), 0.0);
    }

    @Test
    public void play() {
        assertEquals("drum drum drum", guitar.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(100, guitar.getPrice(), 0.0);
    }
}