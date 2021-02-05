package music_shop.other;

import music_shop.ISell;

public class Pick implements ISell {
    private String description;
    private double sellingPrice;
    private double boughtPrice;

    public Pick(String description, double sellingPrice, double boughtPrice) {
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.boughtPrice = boughtPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - boughtPrice;
    }
}
