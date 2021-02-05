package music_shop.instruments;

public class Guitar extends Instrument{

    private double neckSize;

    public Guitar(String type, String colour, double neckSize, double price) {
        super(type, colour, price);
        this.neckSize = neckSize;
    }

    public double getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(double neckSize) {
        this.neckSize = neckSize;
    }

    @Override
    public String play() {
        return "drum drum drum";
    }

    @Override
    public double calculateMarkup() {
        return getPrice();
    }
}
