package music_shop.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicTheoryBookTest {

    private MusicTheoryBook musicTheoryBook;

    @Before
    public void setUp() throws Exception {
        musicTheoryBook = new MusicTheoryBook("Book for music", 100, 80);
    }

    @Test
    public void getDescription() {
        assertEquals("Book for music", musicTheoryBook.getDescription());
    }

    @Test
    public void setDescription() {
        musicTheoryBook.setDescription("Book for music 2");
        assertEquals("Book for music 2", musicTheoryBook.getDescription());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(100, musicTheoryBook.getSellingPrice(), 0.0);
    }

    @Test
    public void setSellingPrice() {
        musicTheoryBook.setSellingPrice(99);
        assertEquals(99, musicTheoryBook.getSellingPrice(), 0.0);

    }

    @Test
    public void getBoughtPrice() {
        assertEquals(80, musicTheoryBook.getBoughtPrice(), 0.0);
    }

    @Test
    public void setBoughtPrice() {
        musicTheoryBook.setBoughtPrice(81);
        assertEquals(81, musicTheoryBook.getBoughtPrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20, musicTheoryBook.calculateMarkup(), 0.0);
    }
}