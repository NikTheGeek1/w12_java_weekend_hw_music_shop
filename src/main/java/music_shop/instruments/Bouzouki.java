package music_shop.instruments;

public class Bouzouki extends Instrument {

    private int numOfStrings;
    private double neckSize;

    public Bouzouki(InstrumentType type, String colour, int numOfStrings, double neckSize, double price) {
        super(type, colour, price);
        this.numOfStrings = numOfStrings;
        this.neckSize = neckSize;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public double getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(double neckSize) {
        this.neckSize = neckSize;
    }

    @Override
    public String play() {
        return "ti ri ti tin";
    }

    @Override
    public double calculateMarkup() {
        return getPrice();
    }
}
