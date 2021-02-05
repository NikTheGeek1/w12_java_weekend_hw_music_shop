package music_shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public ISell removeFromStock(ISell item) {
        return this.stock.remove(this.stock.indexOf(item));
    }

    public double totalPotentialProfit() {
        double total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
