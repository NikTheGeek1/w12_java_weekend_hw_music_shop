package music_shop;

import music_shop.instruments.Bouzouki;
import music_shop.instruments.Guitar;
import music_shop.other.Pick;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private Bouzouki bouzouki;
    private Pick pick;
    private ArrayList<ISell> stock;

    @Before
    public void setUp() throws Exception {
        bouzouki = new Bouzouki("chord", "black", 4, 1.1, 100);
        pick = new Pick("Pick for bouzouki", 100, 80);
        stock = new ArrayList<ISell>();
        stock.add(bouzouki);
        stock.add(pick);
        shop = new Shop(stock);
    }

    @Test
    public void getStock() {
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void addToStock() {
        Guitar guitar = new Guitar("chord", "black", .8, 100 );
        shop.addToStock(guitar);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void removeFromStock() {
        shop.removeFromStock(bouzouki);
        assertEquals(1, shop.getStock().size());
    }
}