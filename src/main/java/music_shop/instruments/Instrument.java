package music_shop.instruments;

import music_shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String type;
    private String colour;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instrument(String type, String colour, double price) {
        this.type = type;
        this.colour = colour;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
