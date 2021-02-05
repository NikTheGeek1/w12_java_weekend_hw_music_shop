package music_shop.instruments;

import music_shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType type;
    private String colour;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instrument(InstrumentType type, String colour, double price) {
        this.type = type;
        this.colour = colour;
        this.price = price;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
